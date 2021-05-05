package 예외처리;

public class 예외처리Main2 {

	public static void main(String[] args) {
		에러발생3 error = new 에러발생3(); // 떠넘겨진 에러를 처리해주어야 함.
		try {
			error.call();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("에러발생후 실행될까요?");

	}

}
