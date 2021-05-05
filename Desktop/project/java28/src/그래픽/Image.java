package 그래픽;

public class Image extends Thread {

	@Override
	public void run() {
		String[] list = {"001.png","002.png","003.png","004.png","005.png"};
		for (int i = 0; i < list.length; i++) {
			System.out.println("이미지 : " + list[i]);
			try {
				// 초를 설정할 때는 밀리세컨즈,
				Thread.sleep(5000); // 1초가 1000
			} catch (InterruptedException e) { // 인터럽트 (방해, 중단), 실행을 하려다 중단하려는것 (예 esc, ctrl+c, alt+f4, 전원 off)
				e.printStackTrace();
			} 
		}
	}
}
