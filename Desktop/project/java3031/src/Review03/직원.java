package Review03;

public class 직원 {
	
	String name;
	int age;
	String cell_phone;
	
	public 직원 (String name, int age, String cell_phone) {
		this.name = name;
		this.age = age;
		this.cell_phone = cell_phone;
	}

	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", cell_phone=" + cell_phone + "]";
	}
	
}
