package dbcp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionMgr {

	static DBConnectionMgr instance;
	
	private DBConnectionMgr() {
		
	}
	
	static DBConnectionMgr getInstance() {
		if (instance == null) {
			instance = new DBConnectionMgr();
		}
		return instance;
	}
	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "1234");
	}
}
