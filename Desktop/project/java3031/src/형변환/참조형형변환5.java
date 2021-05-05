package 형변환;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class 참조형형변환5 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("홍길동");
		list.add(100); // int가 들어가게됨.
		// 	int(기본형) -->Integer(참조형) 이 두개는 자동으로 왔다갔다 하게되어잇음.
		list.add(11.22);
		
		int num = (Integer)list.get(1);
		// int(기본형) --- auto-unboxing --> Integer(참조형) --- upcasting --> Object
		System.out.println(list);
	}
}