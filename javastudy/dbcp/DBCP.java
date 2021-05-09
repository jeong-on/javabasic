package dbcp;

public class DBCP {

	static DBCP instance;
	// 객체생성되기 전에 클래스 이름으로 특정한 사용하는 방법
	// 외부에서 DBCP객체를 만들 수 없음. 생성자를 외부클래스에서 접근할 수 없도록
	// private으로 접근제어 지정
	
	private DBCP() {
		// 생성자를 private로 설정 new로 생성되는 것을 방지.
	}
	
	// 싱글턴 인스턴스는 static변수로 전역에서 사용이 가능.
	// 생성자는 private 형태로 싱글턴 내부에서만 인스턴스를 생성할 수 있으며
	// getInstance() 메서드를 통해 외부에서 인스턴스를 얻을수있다
	public static DBCP getInstance() {
		// DBCP객체가 만들어져 있으면 그것을 return
		// DBCP객체가 만들어져 있지 않으면
		// 그것을 객체를 만들어서 return
		if (instance == null) {
			// 객체가 null인지를 판별에 null일 경우에만 객체를 생성.
			instance = new DBCP();
		}
		return instance;
	}
}
