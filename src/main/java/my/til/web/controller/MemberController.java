package my.til.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import my.til.web.service.MemberService;
import my.til.web.vo.MemberVO;

@RestController
public class MemberController {

	@Autowired
	MemberService memberService;

	// 회원가입 기능
	@PostMapping("memberInsert")
	public MemberVO memberInsert(@ModelAttribute MemberVO vo) {
		try {
			memberService.memberInsert(vo);
			vo.setPw(null); // 비밀번호 노출 방지
		} catch (Exception e) {
			e.printStackTrace(); // 디버깅을 위한 코드, 배포할땐 삭제해야한다.
			vo.setMsg("registered failed");
		}
		return vo;
	}
}
