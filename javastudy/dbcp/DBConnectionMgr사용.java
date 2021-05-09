package dbcp;

public class DBConnectionMgr사용 {

	public static void main(String[] args) {
		// DBCP dbcp = new DBCP();
		DBConnectionMgr mgr1 = DBConnectionMgr.getInstance();
		DBConnectionMgr mgr2 = DBConnectionMgr.getInstance();
		
		System.out.println(mgr1);
		System.out.println(mgr2);
		// 여러개의 dbcp를 생성하여도 모두 같은 주소값을 가지고 있어 같은 값을 가지게 된다.
		
		BbsDAO dao = new BbsDAO();
		BbsVO vo = new BbsVO();
		
		System.out.println(vo.getTitle());
		System.out.println(vo.getContent());
		System.out.println(vo.getTitle());
	}
}
