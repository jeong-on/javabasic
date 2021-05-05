package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB연결 {

	public static void main(String[] args) throws Exception {
		String id = "window";
		String pw = "window";
		String name = "window";
		String tel = "window";
		Class.forName();
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		String url = "jdbc:mysql://";
		Connection con = DriverManager.getConnection();
		System.out.println("2. db연결 성공. <br>");

		String sql = "insert";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);

		System.out.println("3. SQL문을 만들기 성공. <br>");

		// 4. SQL문을 mySQL서버로 전송함.
		System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
	}

}
