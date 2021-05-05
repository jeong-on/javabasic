package Review04;

public class 감소스레드 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i--) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
