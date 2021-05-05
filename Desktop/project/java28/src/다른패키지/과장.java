package 다른패키지;

import 상속.Employee;

public class 과장 extends Employee {
	public void println() {
		System.out.println(name + " " + salary + " "); // 상속을 받을때만 가
	}
}
