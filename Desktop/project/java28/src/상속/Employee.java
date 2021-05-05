package 상속;

public class Employee extends Object {
	public String name;
	String address;
	protected int salary;
	private int rrn; // 다른클래스에서 사용가능하나 상속할때만 다른패키지에서 사용 가능?
	
	private void al() {
		System.out.println("우리회사만의 암호화 뭐야");
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}
	
}
