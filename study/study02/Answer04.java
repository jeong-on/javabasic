package study02;

import java.util.ArrayList;
import java.util.Collections;

public class Answer04 {

	public static void main(String[] args) {
		
		// 1~100까지의 임의의 숫자
		ArrayList<Integer> num = new ArrayList<Integer>();
		for (int i = 1; i < 101; i++) {
			num.add(i);
		}
		Collections.shuffle(num);
		
		int[] pick = new int[1];
		// pick = num.get(i);

	}

}
