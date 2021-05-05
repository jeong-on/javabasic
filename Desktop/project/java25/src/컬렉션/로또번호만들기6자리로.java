package 컬렉션;

import java.util.HashSet;
import java.util.Random;

public class 로또번호만들기6자리로 {
	public static void main(String[] args) {
		Random r = new Random();
		// 6개 만들어 저장할 공간을 만들자.
//		int[] lotto = new int[6];
//		for (int i = 0; i < lotto.length; i++) {
//			lotto[i] = r.nextInt(45) + 1; // 1~45
//		}
//		for (int i = 0; i < lotto.length; i++) {
//			System.out.print(lotto[i] + " ");
//		}
		
		// 해결책 HashSet
		
		HashSet lotto = new HashSet();
		// for (int i = 0; i < 6; i++) { 중복값이 나오면 제거되어 5개만 출력됨.
		while(lotto.size() < 6 ) {
			int num = r.nextInt(45) + 1;
			System.out.println("랜덤값 : " + num);
			lotto.add(num);
		}
		System.out.println(lotto); 
	}
}
