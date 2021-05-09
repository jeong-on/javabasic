package study02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Answer01 {

	public static void main(String[] args) {
		
		// 공 45개를 만든다.
		int[] a = new int[100];
		
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		for (int i = 1; i < 46; i++) {
			lotto.add(i); // lotto 안에 1~45를 저장 
		}
		
		// 섞는다.
		Collections.shuffle(lotto);
		
		// 섞인것들 중에 앞에서부터 6개 꺼내기
		int[] pick = new int[6];
		for (int i = 0; i < pick.length; i++) {
			pick[i] = lotto.get(i);
		}
		
		// 꺼낸 6개의 값들을 출력
		System.out.println("로또 번호 : " + Arrays.toString(pick));
		
		 
	}
}
