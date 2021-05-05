package com.mega.mvc39;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {

	@Autowired
	BbsDAO dao; // 싱글톤으로 만들어진 객체의 주소를 넣는다.(MemberDAO에서 만든 @Component 
	
	@RequestMapping("insert10")
	public void insert(BbsVO bag) throws Exception {
		//public void insert(String id, String pw, String name, String tel) {
		//컨트롤러에 있는 메서드에 변수를 선언하면, 
		//스프링이 객체를 생성해준다.
		//MemberDAO dao = new MemberDAO();
		dao.create(bag);
	}
	
}

