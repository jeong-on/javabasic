package 생성자;

public class CompanyList {

	public static void main(String[] args) {
		Company member1 = new Company("홍길동", "남", 25);
		Company member2 = new Company("김길동", "여", 26);
		Company member3 = new Company("송길동", "남", 27);
		
		System.out.println("모든 직원의 정보");
		System.out.println(member1);
		System.out.println(member2);
		System.out.println(member3);
		System.out.println("직원의 수는 " + Company.count + "명");
		System.out.println("직원들 나이의 합은 " + Company.sum + "살");
		System.out.println("직원들 나이의 평균은 " + (double)Company.sum/Company.count +"살");

		Company.getAvg(); // 메서드를 정적변수로 선언했기 때문에

	}

}
