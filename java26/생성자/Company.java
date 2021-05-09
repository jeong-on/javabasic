package 생성자;

public class Company {

	String name;
	String gender;
	int age;
	
	static int count;
	static int sum;
	
	public Company () {
		
	}
	public Company (String name, String gender, int age) {
		this.name = name ;
		this.gender = gender ;
		this.age = age;
		count++;
		sum = sum+age;
	}
	public static void getAvg() { // static 메서드 안에서는 static 변수만 사용 가능 name, gender, age사용 불가
		System.out.println(sum/(double)count);
	}
	@Override
	public String toString() {
		return "Company [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
}
