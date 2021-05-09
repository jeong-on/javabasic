package study01;

import java.util.Scanner;

public class Answer02 {
	
	public static void main(String[] args) {
		
//		//String[] text = new String[] {"나는 사람", "너도 사람", "우리도 사람", "모두다 사람"};
//		String text1 = "나는 사람";
//		String text2 = "너도 사람";
//		String text3 = "우리도 사람";
//		String text4 = "모두다 사람";
//		int count = 0;
//		
//		if (text1.contains("사람")) {
//			count++;
//		} else {
//			System.out.println("없습니다.");
//		}
//		if (text2.contains("사람")) {
//			count++;
//		} else {
//			System.out.println("없습니다.");
//		}
//		if (text3.contains("사람")) {
//			count++;
//		} else {
//			System.out.println("없습니다.");
//		}
//		if (text4.contains("사람")) {
//			count++;
//		} else {
//			System.out.println("없습니다.");
//		}
//		System.out.println("나는(" + count + ")");
//		System.out.println("사람(" + count + ")");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력하세요 : ");
		
		String str = sc.nextLine();
		String str2 = str.replace(","," "); // 제거
		String[] array = str2.split(" "); // 분리
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}

