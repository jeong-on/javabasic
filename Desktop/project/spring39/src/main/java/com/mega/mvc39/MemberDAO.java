package com.mega.mvc39;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
//MemeberDAO dao = new MemberDAO();를 해준것, 한개만 객체 생성!
//dao안에 MemberDAO에서 쓸수 있는 매서드를 사용할 수 있다.
//이렇게 한개만 만드는것 싱글톤!
public class MemberDAO {

	// myBatis 싱클톤 주소를 주입!
	@Autowired
	SqlSessionTemplate my;
	
	public void create(MemberVO bag) throws Exception {
		// myBatis에 실행시킬 예정
		my.insert("member.insert", bag);
	}

	public void delete() {

	}

}
