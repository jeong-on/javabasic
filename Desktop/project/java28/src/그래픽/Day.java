package 그래픽;

import java.util.Date;

public class Day extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			Date date = new Date();
			System.out.println(date);
			try {
				Thread.sleep(500); // 1초가 1000
			} catch (InterruptedException e) { // 인터럽트 (방해, 중단), 실행을 하려다 중단하려는것 (예 esc, ctrl+c, alt+f4, 전원 off)
				e.printStackTrace();
			} 
		}
	}
}
