package 클래스만들기;

public class MemberDAO {
	// 전역변수, 자동초기화 됨.
	// 참조형 변수는 무조건 null로 초기화!
	// null -> 아직 주소가 없다 ->
	// url : 멤버변수, 전역변수(<->지역변수), 참조형변수(<->기본형변수)
	String url = "jdbc:mysql://localhost:3306/shop" ;
	String user = "root" ;
	String password = "1234" ; // 전역변수라서 어디에서나 사용가능
	
	public void create(String id, String pw, String name) {
		// id, pw, name : 지역변수(create 메서드 안에서 만들어졌기 때문에(local변수),{}안에서만 사용가능)
		System.out.println("당신이 입력한 id는 " + id);
		System.out.println("당신이 입력한 pw는 " + pw);
		System.out.println("당신이 입력한 name는 " + name);
	}
	public void delete(String id) {
		// System.out.println(name);
		// 지역변수라서 다른 메서드에서 접근 불가
		System.out.println("당신이 입력한 id는 " + id);
	}
}
