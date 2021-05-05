package com.mega.mvc38;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@Autowired
	MemberDAO dao; // 싱글톤으로 만들어진 객체의 주소를 넣는다.(MemberDAO에서 만든 @Component

	@RequestMapping("select2")
	public void select2(MemberVO memberVO, Model model) throws Exception {
		MemberVO vo = dao.select(memberVO);
		// 검색결과를 담기위해 view까지 데이터를 넘김.
		model.addAttribute("vo2", vo);
	}

	@RequestMapping("insert.mega")
	public void insert(MemberVO bag) throws Exception {
		// public void insert(String id, String pw, String name, String tel) {
		// 컨트롤러에 있는 메서드에 변수를 선언하면,
		// 스프링이 객체를 생성해준다.
		// MemberDAO dao = new MemberDAO();
		dao.create(bag);
		System.out.println("컨트롤러에서 받은 id: " + bag.getId());
		System.out.println("컨트롤러에서 받은 pw: " + bag.getPw());
		System.out.println("컨트롤러에서 받은 name: " + bag.getName());
		System.out.println("컨트롤러에서 받은 tel: " + bag.getTel());

		// JDBC프로그램 절차 4단계
	}

	@RequestMapping("login")
	public String login(MemberVO bag, HttpSession session) {
		MemberVO vo = dao.login(bag);
		System.out.println("====================" + vo);
		if (vo != null) {
			System.out.println("해당 id/pw가 있음.");
			session.setAttribute("userId", vo.getId());
			return "ok";

		} else {
			System.out.println("해당 id/pw가 없음.");
			return "no";
		}
	}

}
