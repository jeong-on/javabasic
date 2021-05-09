package study03;

import java.util.Scanner;

class Answer01 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("단어를 입력하세요 : ");
		String str = sc.nextLine();
		
	
		if (str.length() % 2 == 0) { // 단어의 길이가 짝수라면
			str = str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
		} else {
			str = str.substring(str.length() / 2, str.length() / 2 + 1);
		}
		sc.close();	
	}
}