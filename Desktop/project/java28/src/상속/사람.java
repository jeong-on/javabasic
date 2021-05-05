package 상속;

public class 사람 extends Object {
	// 사람이라는 클래스, 그룹이 가지는 성질로 틀을 만드는 작업
	// 클래스 : 성질+동작을 가짐
	// 멤버 변수, 성질을 가짐
	String name;
	int age;
	
	// 멤버 메서드,
	public void 먹다() {
		System.out.println("사람이 먹다.");
	}
}
