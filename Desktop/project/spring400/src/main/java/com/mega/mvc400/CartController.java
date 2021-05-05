package com.mega.mvc400;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mega.mvc400.CartVO;

@Controller
public class CartController {

	@Autowired
	CartDAO dao;
	// 싱글톤으로 만들어진 객체의 주소를 넣는다.
	// CartDAO에서 만든 @Component
	
	@RequestMapping("cart")
	private void insert(CartVO bag) throws Exception {
		// private void insert(String mid, String pid, String price, String pcount)
		// 컨트롤러에 있는 메서드에 변수를 선언하면, 
		// 스프링이 객체를 생성해준다.
		// CartDAO dao = new CartDAO();
		dao.create(bag);
	}

	
}
