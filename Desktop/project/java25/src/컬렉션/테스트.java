package 컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class 테스트 {
	public static void main(String[] args) {
		HashSet team = new HashSet();
		team.add("디자이너");
		team.add("프로그래");
		team.add("DB관리자");
		
		System.out.println(team);
		
		System.out.println("================================");
		
		ArrayList ski = new ArrayList();
		ski.add("박스키");
		ski.add("송스키");
		ski.add("김스키");
		ski.add("정스키");
		for (int i = 0; i < ski.size(); i++) {
			System.out.println((i+1) + "등 : " + ski.get(i));
		}
		ski.remove(1);
		System.out.println("2등이 반칙하여 탈락함.");
		for (int i = 0; i < ski.size(); i++) {
			System.out.println((i+1) + "등 : " + ski.get(i));
		}

		System.out.println("================================");
		
		HashMap cell = new HashMap();
		cell.put("1번", "엄마");
		cell.put("2번", "아빠");
		cell.put("3번", "친구");
		cell.put("4번", "동생");
		System.out.println(cell);
		System.out.println("휴대폰 2번은 누구입니까? " + cell.get("2번"));

		System.out.println("================================");
		
		ArrayList test = new ArrayList();
		test.add("국어");
		test.add("수학");
		test.add("영어");
		test.add("컴퓨터");
		System.out.println("전체 시험볼 과목 : " + test);
		test.remove(0);
		System.out.println("1일차 시험본 후 남은 과목 : " + test);
		test.remove(0);
		System.out.println("2일차 시험본 후 남은 과목 : " + test);
		test.remove(0);
		System.out.println("3일차 시험본 후 남은 과목 : " + test);
		
	}
}
