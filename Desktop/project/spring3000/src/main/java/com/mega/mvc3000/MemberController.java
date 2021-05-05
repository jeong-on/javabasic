package com.mega.mvc3000;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//table하나당 controller한개
@Controller 
public class MemberController { // controller로 사용하는 페이지

	@RequestMapping("insert.mega") // form action으로 입력받은 데이터를 받아옴
	public void insert(MemberVO bag, MemberDAO dao) {
		// public void insert(String id, String pw, String name, String tel)
		// input name으로 받은것들을 가져옴,
		// String id = request.getParamete처럼 매개변수로 받음
		System.out.println("입력한 id : " + bag.getId());
		System.out.println("입력한 pw : " + bag.getPw());
		System.out.println("입력한 name : " + bag.getName());
		System.out.println("입력한 tel : " + bag.getTel());
	}
	
	@RequestMapping("login.mega")
	public String login(String id, String pw) {
		System.out.println("내가 호출됨...!!");
		System.out.println("컨트롤하는 메서드");
		System.out.println("컨트롤러에서 받은 id : " + id);
		System.out.println("컨트롤러에서 받은 pw : " + pw);
		
		boolean result = false;
    	if (id.equals("root") && pw.equals("1234")) {
    		result = true;
       	}
		if (result) {
			return "ok"; // views 아래에 있는 ok.jsp를 찾아서 열어줌
		} else {
			return "no"; 
		}
	}
	
	@RequestMapping("insert2.mega")
	public void insert2(BbsVO bag) {
		System.out.println("작성자 ID : " + bag.getId());
		System.out.println("제목 : " + bag.getTitle());
		System.out.println("내용 : " + bag.getContent());
		System.out.println("작성자 : " + bag.getWriter());
	}
}
