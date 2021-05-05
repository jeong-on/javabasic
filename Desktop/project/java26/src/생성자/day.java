package 생성자;

public class day {
	// 멤버변수는 객체 생성될 때 마다 다이나믹하게 동적으로 메모리가 할당
	// 객체가 3개 생성되었다면 객체마다 각각 다른 속성값들을 가져야 한다.
	// 실제로 그 객체에 해당하는 실제값들이 구체적으로 저장되는 특징
	// 실제값 : instance(인스턴스)
	// 객체 생성할 때마다 복사되는 변수 : 인스턴스 변수

	String 하는일;
	int 시간;
	String 장소;
	static int count; // 전역변수, 0으로 초기화
	// static 이 없으면 인스턴스 변수로 인식 매번 달라짐.
	// 숫자가 하나씩 늘어나야 하기 때문에 복사되지 않도록 붙여줌.
	// 정적변수
	// static변수는 클래스당 한개만 가지고 있다.
	// 클래스이름.변수명, day.count
	// 객체 생성과는 상관이 없다.
	static int sum;
	
	public day() {
		
	}
	public day(String 하는일, int 시간, String 장소) {
		count++;
		sum = sum+시간;
		this.하는일 = 하는일;
		this.시간 = 시간;
		this.장소 = 장소;
	}
	@Override
	public String toString() {
		return "day [하는일=" + 하는일 + ", 시간=" + 시간 + ", 장소=" + 장소 + "]";
	}
	
}
