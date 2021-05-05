package shop;

import java.util.Date;

public class 계산기 {

	private int getHour() {
		Date date = new Date();
		int result = date.getHours();
		return result;
	}
	
	// add(200,100)
	public int add(int x, int y) {
		// 메서드 안에서 선언된 변수는 메서드 안에서만 사용 가능
		// 메서드 범위 지역안에서만 사용가능
		// 지역변수, 로컬변수 <--> 전역변수, 글로벌변수
		return x + y;
	}
	
	//public int mul(int x, int y) {
		// return;
	//}
}
