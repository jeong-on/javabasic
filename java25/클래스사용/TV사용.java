package 클래스사용;

import 클래스만들기.TV;

public class TV사용 {

	public static void main(String[] args) {
		// 마우스 올려서 import(f2)선택
		// 자동완성
		// 컨트롤+쉬프트+o
		TV myTv = new TV(); // ->자동완성으로 클래스를 찾아주어야 함. or 마우스를 올려서 import선택(f2)
		// yourTv.on(); -> 아직 생성되지 않은 yourTv변수를 사용해서 error!
		myTv.ch = 7; // myTv에는 주소가 들어가있다.
		myTv.vol = 9;
		myTv.onOff = true;
		System.out.println(myTv);
		
		TV yourTv = new TV(); // ->자동완성으로 클래스를 찾아주어야 함. or 마우스를 올려서 import선택(f2)
		// yourTv.on(); -> 아직 생성되지 않은 yourTv변수를 사용해서 error!
		yourTv.ch = 9; // myTv에는 주소가 들어가있다.
		yourTv.vol = 12;
		yourTv.onOff = true;
		System.out.println(yourTv);
	
	}
	
	

}
