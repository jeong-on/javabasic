package 클래스만들기;

import java.util.Date;

public class 반환값연습 {
	
	public void add2() {
		System.out.println("더하기 기능을 실행합니다.");
	}
	public int add(int x, int y) { // double도 가능하나 return시 .0 이 붙음.
		return x + y;
	}
	public double add(double x, int y) { // int는 올 수 없음. 둘 중 하나가 double이면 무조건 double
		return x + y;
	}
	public String add(String x, String y) {
		return x + y;
	}
	public String add(int x, String y) { // 하나라도 String이면 String, 산술 계산의 의미가 아닌 결합연산자가 됨.
		return x + y;
	}
	public int[] add() { // 배열이기에 앞에 붙은 배열을 써줌.
		int [] x = {1,2,3};
		return x ;
	}
	public Date getDate() {
		Date date = new Date();
		return date;
	}
	
}
