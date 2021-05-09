package 그래픽;

import 스레드.달러스레드;
import 스레드.앤드스레드;
import 스레드.엣스레드;

public class 동시프로그램실행3 {

	public static void main(String[] args) {
		Count and = new Count();
		Image at = new Image();
		Day doll = new Day();
		
		// cpu한테 스레드 2개 만든것을 스레드로 등록
		and.start();
		at.start();
		doll.start();
	}
}
