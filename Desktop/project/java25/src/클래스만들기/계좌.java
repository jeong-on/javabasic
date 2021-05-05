package 클래스만들기;

public class 계좌 {
	public String name;
	public String count;
	public int money;
	
	public void deposit(String name, String count, int money) {
		System.out.println(name + "의 " + count + "에 " + money + "원을 예금하다");
	}
	public void deposit(String name, int money) {
		System.out.println(name + "이(가) " + money + "원을 예금하다");
	}
	public void withdraw(int money) {
		System.out.println(money + "원을 출금하다");
	}
	@Override
	public String toString() {
		return "계좌 [name=" + name + ", count=" + count + ", money=" + money + "]";
	}
	
}
