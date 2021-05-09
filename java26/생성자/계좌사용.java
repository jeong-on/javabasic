package 생성자;

public class 계좌사용 {

	public static void main(String[] args) {
		계좌 c1 = new 계좌("후추","용돈",30000);
		System.out.println(c1);
		계좌 c2 = new 계좌("소금","용돈",35000);
		System.out.println(c2);
		계좌 c3 = new 계좌("후추&소금","생활비",14000);
		System.out.println(c3);
	}
}
