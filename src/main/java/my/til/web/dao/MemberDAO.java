package my.til.web.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import my.til.web.vo.MemberVO;



@Repository
public class MemberDAO {

	@Autowired
	SqlSession sqlSession;
	
	public void memberInsert(MemberVO vo) {
		sqlSession.insert("mapper.member.memberInsert", vo);
	}

}
