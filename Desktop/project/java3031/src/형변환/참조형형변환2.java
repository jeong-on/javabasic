package 형변환;

import java.util.ArrayList;
import java.util.Random;

public class 참조형형변환2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(); // object이면 다 가능.(가장큰 부모), 여러가지 타입의 목록을 넣고싶어서 사용
		// 자동형변환 Object
		// 자동형변환의 단점 : 부가적으로 추가된 기능들을 쓸 수 없다.
		list.add("홍길동"); // index[0]
		list.add(new 맨());
		list.add(new Random());
		list.add(new 수퍼맨());
		
		System.out.println(list);
		// list.get(0).charAt(0);
		// list.get(1).run();
		// String에서 추가된 메서드들은 바로 쓸 수 없다.
		// list.get(0); 은 Object
		// String의 추가 기능을 사용하고 싶으면 다시 String으로 형변환해주면 된다.
		// String(작은) <-- Object(큰), (String)변수
		String name = (String)list.get(0); // Object이 더 큰타입이기 때문에 강제형변환해주어야 함
		System.out.println(list.get(0));
		
		맨 man = (맨)list.get(1);
		System.out.println(list.get(1));
		
	}
}
