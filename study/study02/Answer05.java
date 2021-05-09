package study02;

import java.util.Scanner;

public class Answer05 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("입력할 횟수를 입력하세요 : ");
		int T = in.nextInt();
		
		for (int i = 0; i < T; i++) {
			System.out.print("반복할 횟수를 입력하세요 : ");
			int R = in.nextInt();
			System.out.println("문자를 입력하세요 : ");
			String S = in.next(); // nextLine() 을 쓰면 error!
			for (int j = 0; j < S.length(); j++) {
				for (int k = 0; k < R; k++) { // R 만큼 반복 출력
					System.out.print(S.charAt(j)); // charAt 인덱스로 주어진 값에 해당하는 문자를 return
				}
			}
			System.out.println();
		}
	}
}
