package 상속;

public class 수퍼맨 extends 맨 {
	// 멤버변수3, 멤버메서드2
	
	boolean fly;
	
	public void 우주를날다() {
		System.out.println("이름이" + name + "수퍼맨인 지구밖인 우주를 날다."); // 상속받은것은 다 사용 가능
	}

	@Override
	// 상속받았던 메서드 중에서 메서드의 기능을 재정의해서 사용할 수 있음.
	// 오버라이딩(메서드 재정의)
	
	public String toString() {
		return "수퍼맨 [fly=" + fly + ", speed=" + speed + ", name=" + name + ", age=" + age + "]";
	}
	 

}
