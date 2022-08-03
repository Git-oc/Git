package dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import po.Member;
import util.MyBatisUtil;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MemberDAOTest {

    @Test
    public void insertMember() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        try {
            MemberDAO memberDAO = sqlSession.getMapper(MemberDAO.class);
            Member member = new Member(6,"小红","男",18,"益阳");
            int i = memberDAO.insertMember(member);
            System.out.println(i);
            sqlSession.commit();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void deleteMember() {

        MemberDAO memberDAO = MyBatisUtil.getMapper(MemberDAO.class);

        int i = memberDAO.deleteMember(6);

        System.out.println(i);

    }

    @Test
    public void listMember() {

        MemberDAO memberDAO = MyBatisUtil.getMapper(MemberDAO.class);

        List<Member> members = memberDAO.listMember();

        for (Member member:members) {
            System.out.println(member);
        }

        assertNotNull(members);

    }

    @Test
    public void updateMember() {

        MemberDAO memberDAO = MyBatisUtil.getMapper(MemberDAO.class);

        int i = memberDAO.updateMember(new Member(6,"小红","女",19,"益阳"));

        assertEquals(1,i);
    }
}