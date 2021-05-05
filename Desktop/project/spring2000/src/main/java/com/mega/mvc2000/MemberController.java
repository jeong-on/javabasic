package com.mega.mvc2000;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@Autowired
	MemberDAO dao; // 싱글톤으로 만들어진 객체의 주소를 넣는다.(MemberDAO에서 만든 @Component 
	
	@RequestMapping("insert.mega")
	public void insert(MemberVO bag, MemberDAO dao) throws Exception { 
		// ()안에 MemberVO bag은 get,set + MemberVO bag = new MemberVO() 까지포함한다.
		// ()안에서 new를 해줌. 
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
	
	// login.mega를 찾고 그밑에 있는 메서드를 자동으로 호출
	// 처리한 결과가 views/아래에 ok.jsp 혹은 no.jsp를 호출
	@RequestMapping("login.mega")
	public String login(String id, String pw, String pw2) {
		System.out.println("내가 호출됨...!!");
		System.out.println("컨트롤러에서 받은 id: " + id);
		System.out.println("컨트롤러에서 받은 pw: " + pw);
		System.out.println("컨트롤러에서 받은 pw2: " + pw2);
		
		boolean result = false; // 로그인이 안되었을때
		if (id.equals("root") && pw.equals("1234")) {
			result = true;
		}
		if(result) {
			return "ok";
		} else {
			return "no";
		}
		// return ok, no는 views/안으로 가게됨
		// WEb_INF/spring/appServlet/servlet-cotext.xml 파일안에 
		// <beans:property name="prefix" value="/WEB-INF/views/" />
		// <beans:property name="suffix" value=".jsp" />
		// 확장자 명과 경로가 지정되어 있음.
	}

}
