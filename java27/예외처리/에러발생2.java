package 예외처리;

public class 에러발생2 {

	public void call() {
		try { // 단축키 커맨드 옵션 z
			System.out.println(3 / 0);
		} catch (Exception e) {
			System.out.println("에러 발생함." + e.getMessage());
			e.printStackTrace();
		}
	}
}
