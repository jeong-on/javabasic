package 생성자;

public class daylist {

	public static void main(String[] args) {
		
		day d1 = new day("자바공부", 10, "강남");
		System.out.println(day.count);
		day d2 = new day("여행", 15, "강원도");
		System.out.println(day.count);
		day d3 = new day("운동", 11, "피트니스");
		System.out.println(day.count);
		
		System.out.println(day.sum);
		System.out.println((double)day.sum/day.count);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}

}
