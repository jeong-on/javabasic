package 상속;

public class 맨 extends 사람 { // extends 상속
	// class대신 final을 붙이면 상속 불가능
	// extends : 확장하다.
	// 사람클래스를 확장해서 맨을 만들겠다.
	// 만들자 마자 멤버변수2, 멤버메서드1 포함
	int speed; // 속도
	
	public void 달리다() {
		System.out.println("빨리 달리다.");
	}

}
