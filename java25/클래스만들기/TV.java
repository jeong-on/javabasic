package 클래스만들기;

public class TV {
	// 멤버변수
	// 선언 : ram에 변수가 생성되는 것.
	//       선언의 위치가 변수를 사용할 수 있는 범위를 결정하기 때문에 중요함.
	// public 접근 제어자를 써야 다른 패키지에서도 사용 가능
	public int ch; // -> 멤버 변수, 변수 선언
	public int vol; // -> 다른 패키지에서 사용하기위해 앞에 public 을 붙여줌
	public boolean onOff;

	public void on() {
		System.out.println("TV를 켜다");
	}
	public void off() {
		System.out.println("TV를 끄다");
	}
	// 기능을 정의, 메서드 정
	public void changeCh() {
		System.out.println("채널을 바꾸다");
	}
	// 기존에 있던 메서드를 덮어쓰고 싶으면, 기존에 있던 메서드를 똑같이 써주면 된다.
	// 오버라이딩(재정의), override
	// -> 원래 가지고 있던 object인데 바꾸기 위해 재정의를 해줌.
	//	public String toString() {
	//		return "채널은" + ch + ", 볼륨은" + vol + ", 켜져있는지 유무는 " + onOff;
	//	}
	// Source -> Generate toString 
	@Override
	public String toString() {
		return "TV [ch=" + ch + ", vol=" + vol + ", onOff=" + onOff + "]";
	}
}
