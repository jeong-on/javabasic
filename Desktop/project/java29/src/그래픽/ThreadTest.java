package 그래픽;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.util.Date;

public class ThreadTest extends JFrame { // JFrame을 상속받아 Jframe의 변수랑 메서드를 사용할 수 있도록함.
	
	static JLabel day, img, name; // static으로 변수선언

	public ThreadTest() { // 생성자 메서드
		
		setSize(900,900);
		getContentPane().setLayout(null);
		
		day = new JLabel("");
		day.setFont(new Font("Nanum Gothic", Font.PLAIN, 30));
		day.setHorizontalAlignment(SwingConstants.CENTER);
		day.setBounds(30, 20, 834, 40);
		getContentPane().add(day);
		
		img = new JLabel("");
		img.setHorizontalAlignment(SwingConstants.CENTER);
		img.setBounds(86, 88, 712, 712);
		getContentPane().add(img);
		ImageIcon icon = new ImageIcon("감초.png");
		img.setIcon(icon);
		
		name = new JLabel("");
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setFont(new Font("Nanum Gothic", Font.PLAIN, 30));
		name.setBounds(30, 812, 834, 40);
		getContentPane().add(name);
		
		// Day Thread
		Day d = new Day(); // 객체 생성 후 메서드 실행
		d.start();
		
		// Img Thread
		Img i = new Img();
		i.start();
		
		// Name Thread
		Name n = new Name();
		n.start();
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ThreadTest test = new ThreadTest(); 
		// class 자체의 객체 생성
	} // main
	
	public class Day extends Thread { // inner class 생성
		
		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) { // 0~999 
				Date date = new Date();
				day.setText(date + ""); // String 받기 ""
				try {
					Thread.sleep(1000); // 1초
				} catch (InterruptedException e) {
					e.printStackTrace(); // 에러 메세지의 발생 근원지를 찾아서 단계별로 에러를 출력
				} // catch
			} // for
		} // run
	} // Day thread
	
	public class Img extends Thread {
		
		@Override
		public void run() {
			String[] list = { "감초.png", "독버섯.png", "라떼.png", "세인트릴리.png", "아몬드.png", "커스터드.png", "클로버.png", "퓨어바닐라.png", "호밀.png", "홀리베리.png" };
			for (int i = 0; i < list.length; i++) { // list = 10개
				ImageIcon icon = new ImageIcon(list[i]);
				img.setIcon(icon);
				if (i == 9) { // 9에서 끝나 i++ 때문에 list[10]이 됨.
					i = -1; // i를 -1로 초기화
				}
				try {
					Thread.sleep(5000); // 5초
				} catch (InterruptedException e) { 
					e.printStackTrace();
				} // catch
			} // for
		} // run
	} // Img thread
	
	public class Name extends Thread {
		@Override
		public void run() {
			String[] list2 = {"감초","독버섯","라떼","세인트릴리","아몬드","커스터드","클로버","퓨어바닐라","호밀","홀리베리"};
			for (int i = 0; i < list2.length; i++) {
				name.setText(list2[i] + "맛 쿠키");
				if (i == 9) { // 9에서 끝나 i++ 때문에 list[10]이 됨.
					i = -1; // i를 -1로 초기화
				}
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} // catch
			} // for
		} // run
	} // Name thread
	
	
}
