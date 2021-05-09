package 생성자;

public class 계좌 {

	String name;
	String count;
	int money;
	
	public 계좌 () {
		
	}
	public 계좌 (String name, String count, int money) {
      this.name = name;
      this.count = count;
      this.money = money;
   }
   public void deposit() {
      System.out.println("입금하다.");
   }
   public void withdraw() {
      System.out.println("출금하다.");
   }
	@Override
	public String toString() {
		return "계좌 [name=" + name + ", count=" + count + ", money=" + money + "]";
	}
	   
	   
}
