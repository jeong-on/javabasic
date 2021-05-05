package com.mega.mvc40;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	@Autowired
	ProductDAO dao; // 싱글톤으로 만들어진 객체의 주소를 넣는다.(MemberDAO에서 만든 @Component 
	
	@RequestMapping("insert11")
	public void insert(ProductVO bag) throws Exception {
		//public void insert(String id, String pw, String name, String tel) {
		//컨트롤러에 있는 메서드에 변수를 선언하면, 
		//스프링이 객체를 생성해준다.
		//MemberDAO dao = new MemberDAO();
		dao.create(bag);
	}
	
	@RequestMapping("select3")
	public void select3(ProductVO productVO, Model model) throws Exception {
		ProductVO vo = dao.select(productVO);
		// 검색결과를 담기위해 view까지 데이터를 넘김.
		model.addAttribute("vo3",vo);
	}
	
}

