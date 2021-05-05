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
public class BbsDAO {

	// myBatis 싱클톤 주소를 주입!
	@Autowired
	SqlSessionTemplate my;
	
	public void create(BbsVO bag) throws Exception {
		// myBatis에 실행시킬 예정
		my.insert("bbs.insert", bag);
	}
		
//	public void create(BbsVO bag) throws Exception {
//		System.out.println("전달받은 가방에 들어있는 데이터 db에 넣는 처리 하면 됨.");
//		// 1. 커넥터 사용하겠다고 설정해야함.
//		System.out.print("===============" + bag.getId());
//		Class.forName("oracle.jdbc.OracleDriver");
//		System.out.println("1. 커넥터 사용 설정 성공. <br>");
//
//		// 2. db연결해보자!-shop, root, 1234
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		Connection con = DriverManager.getConnection(url, "ROOT", "1234");
//		System.out.println("2. db연결 성공. <br>");
//
//		//3. sql문 객체로 만들기
//		String sql = "insert into BBS values (?, ?, ?, ?)"; 
//		PreparedStatement ps = con.prepareStatement(sql);
//		ps.setString(1, bag.getId());
//		ps.setString(2, bag.getTitle());
//		ps.setString(3, bag.getContent());
//		ps.setString(4, bag.getWriter());
//		System.out.println("3. SQL문을 만들기 성공. <br>");
//
//		// 4. SQL문을 mySQL서버로 전송함.
//		int result = ps.executeUpdate();
//		con.commit();
//		con.close();
//		System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
//	}

	public void delete() {

	}

}
