package com.service;

import com.entity.Emp;

import java.util.List;

public interface EmpService {

    public List<Emp> showAllEmp();

    public int removeEmp(int id);

    public int modify(Emp emp);

    public Emp showEmp(int id);

}
