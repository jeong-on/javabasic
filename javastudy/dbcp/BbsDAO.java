package dbcp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// DB Access Object(DAO)
public class BbsDAO {

	// 타입 변수명;으로 선언.
	Connection con;
	DBConnectionMgr dbcp;
	
	// DBConnectionMgr클래스 메서드 호출
	public BbsDAO() {
		dbcp = DBConnectionMgr.getInstance();
	}
	
	public BbsVO read(String no) throws Exception{
		con = dbcp.getConnection();
		String sql = "select * from bbs where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, Integer.parseInt(no));
		System.out.println("3. SQL문을 객체로 생성. ok");
		
		ResultSet result = ps.executeQuery();
		System.out.println("4. SQL문을 mySQL서버로 전송. ok");
		BbsVO bag = new BbsVO();
		if (result.next()) {
			String title = result.getString(2);
			String content = result.getString(3);
			String writer = result.getString(4);
			bag.setTitle(title);
			bag.setContent(content);
			bag.setWriter(writer);
		}
		return bag;
	}
}
