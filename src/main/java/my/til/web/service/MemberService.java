package my.til.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.til.web.dao.MemberDAO;
import my.til.web.vo.MemberVO;

@Service
public class MemberService {

	@Autowired
	MemberDAO memberDAO;

	public void memberInsert(MemberVO vo) {
			memberDAO.memberInsert(vo);
	}
	
}
