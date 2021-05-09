package dbcp;

public class DBCP사용 {

	public static void main(String[] args) {
		// DBCP dbcp = new DBCP();
		DBCP dbcp1 = DBCP.getInstance();
		DBCP dbcp2 = DBCP.getInstance();
		
		System.out.println(dbcp1);
		System.out.println(dbcp2);
		// 여러개의 dbcp를 생성하여도 모두 같은 주소값을 가지고 있어 같은 값을 가지게 된다.
	}
}
