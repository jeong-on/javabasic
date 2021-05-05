package com.mega.mvc400;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
// CartDAO dao = new CartDAO();를 해준것, 한개만 객체 생성!
// dao안에 CartDAO에서 쓸수 있는 매서드를 사용할 수 있다.
// 싱글톤 만들기
public class CartDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public void create(CartVO bag) throws Exception {
		// myBatis에 실행
		my.insert("cart.insert", bag);
	}

}
