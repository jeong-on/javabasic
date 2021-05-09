package 컬렉션;

import java.util.ArrayList;

public class 리스트형 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		// 순서가 의미있는 데이터들의 모음
		list.add("먹기");
		list.add("마시기");
		list.add("운동");
		System.out.println(list.get(0));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
		for (Object o : list) { // foreach
			System.out.println(o);
		}
		System.out.println(list); // toString
		list.remove(0); // 0을 지움.
		System.out.println(list);
		list.add(1, "쉬기"); // index[1] 앞에 추가
		System.out.println(list);
		System.out.println(list.size());
		list.set(0, "진짜 놀기");
		System.out.println(list);
	}
}
