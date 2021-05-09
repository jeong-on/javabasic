package study02;

import java.util.Random;

public class Answer06 {
	
	public static void main(String[] args) {
		Random r = new Random();
		
		int N = r.nextInt(100) + 1;
		
		int[] num = new int[N];
		int x = r.nextInt(9) + 1;
		int sum = 0;
		
		System.out.println("숫자의 개수는 : " + N);
		for (int i = 0; i < num.length; i++) {
			num[i] = x;
			System.out.print(num[i]);
			sum = sum + x;
			x = r.nextInt(10);
		}
		
		System.out.println("");
		System.out.println("숫자의 합은 : " + sum);
	}



}
