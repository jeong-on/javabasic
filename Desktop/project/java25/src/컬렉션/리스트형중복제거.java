package 컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class 리스트형중복제거 {

	public static void main(String[] args) {
		Random r = new Random();
		ArrayList list = new ArrayList();
		for (int i = 0; i < 5000; i++) {
			// 5000개의 랜덤한 값을 넣어서
			list.add(r.nextInt(1000));
		}
		// 중복제거해서 프린트
		// 개수가 몇 개인지 세어보세요.
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println("===============================");
		
		String[] food = {"감자", "고구마", "양파", "감자", "고구마"};
		HashSet foodlist = new HashSet();
		for (int i = 0; i < food.length; i++) {
			foodlist.add(food[i]);
		}
		System.out.println(foodlist);
		
		System.out.println("===============================");
		
		int[] num = new int[5000];
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(50000) + 1;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i] + " ");
		}
		HashSet numlist = new HashSet();
		for (int i = 0; i < num.length; i++) {
			numlist.add(num[i]);
		}
		System.out.println(numlist);
		System.out.println(numlist.size());
	}

}
