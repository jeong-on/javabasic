package 클래스사용;

import 클래스만들기.계좌;

public class 계좌사용 {

	public static void main(String[] args) {
		계좌 c1 = new 계좌();
		c1.name = "후추";
		c1.count = "월급";
		c1.money = 5000;
		
		c1.deposit(c1.name, c1.count, c1.money);
		c1.deposit(c1.name, c1.money);
		c1.withdraw(2000);
		
		System.out.println("===============================");
		
		계좌 c2 = new 계좌();
		c2.name = "소금";
		c2.count = "용돈";
		c2.money = 3000;
		
		c2.deposit(c2.name, c2.count, c2.money);
		c2.deposit(c2.name, c2.money);
		c2.withdraw(500);
		
		System.out.println("===============================");

		계좌 c3 = new 계좌();
		c3.name = "후추&소금";
		c3.count = "생활비";
		c3.money = 8000;
		
		c3.deposit(c3.name, c3.count, c3.money);
		c3.deposit(c3.name, c3.money);
		c3.withdraw(3000);

	}

}
