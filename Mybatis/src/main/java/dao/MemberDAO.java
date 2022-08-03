package dao;

import po.Member;

import java.util.List;

public interface MemberDAO {

    public int insertMember(Member member);

    public int deleteMember(int id);

    public List<Member> listMember();

    public int updateMember(Member member);

}
