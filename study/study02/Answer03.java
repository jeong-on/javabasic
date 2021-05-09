package study02;

public class Answer03 {

	public static void main(String[] args) {
		
		
		for (int i = 1; i < 10; i++) {
			if (i%4 == 0) { // 제외할 조건, 4로 나눈 나머지가 0일
				continue; // 제외하고 for 실행, 결과물은 출력되지않음.
			}
			System.out.println(3 + "x" + i + "=" + (3*i));
		}

	}

}
