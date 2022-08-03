package com.service;

import com.dao.EmpManagerDao;
import com.dao.EmpManagerDaoImpl;
import com.entity.EmpManager;
import com.utils.DbUtils;

public class EmpManagerServiceImpl implements EmpManagerService{

    private final EmpManagerDao empManagerDao = new EmpManagerDaoImpl();

    @Override
    public EmpManager login(String username, String password) {
        EmpManager empManager = null;
        try {
            DbUtils.begin();
            EmpManager temp = empManagerDao.select(username);
            if (temp != null){
                if (temp.getPassword().equals(password)){
                    empManager = temp;
                }
            }
            DbUtils.commit();
        } catch (Exception e) {
            DbUtils.rollback();
            e.printStackTrace();
        }
        return empManager;
    }
}
