package 상속;

public class Manager extends Employee {

	private int bonus = 100; // private 은 외부 다른 클래스에서 접근 불가.
	
	public void test() {
		System.out.println(bonus + "만원 보너스 받으며 관리 감독하다.");
	}

	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + ", name=" + name + ", address=" + address + ", salary=" + salary + ", rrn="
				+ "]";
	}

	
	
}
