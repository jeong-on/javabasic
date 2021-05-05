package 그래픽;

public class Count extends Thread {

	@Override
	public void run() {
		for (int i = 500; i >= 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(500); // 1초가 1000
			} catch (InterruptedException e) { // 인터럽트 (방해, 중단), 실행을 하려다 중단하려는것 (예 esc, ctrl+c, alt+f4, 전원 off)
				e.printStackTrace();
			} 
		}
	}
}
