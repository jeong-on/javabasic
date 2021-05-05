package 그래픽;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class 스레드연습 extends JFrame { // 1번. 내 자신이 jframe이 되도록 상속
	// 객체 생성하지 않아도 언제든지 static메서드에서 접근해서
	// 사용하려면 멤버변수도 반드시 static되어야 한다.
	// static이 아닌 일반 변수는 반드시 객체 생성해야 접근가능하다.(*TV*)
	static JLabel count, image, day;
	// main안에 변수를 선언하면 이 클래스에서는 사용할 수 없기 때문에 main위에서 선언해준다.
	// static으로 선언해줌.
	
	public 스레드연습() { // 생성자 메서드(일반 메서드처럼 작업 가능)
		System.out.println("win");
		getContentPane().setBackground(Color.GREEN);
		setSize(800, 300);

		count = new JLabel("count: 500");
		count.setFont(new Font("Dialog", Font.BOLD, 55));
		getContentPane().add(count, BorderLayout.WEST);

		image = new JLabel();
		getContentPane().add(image, BorderLayout.CENTER);
		ImageIcon icon = new ImageIcon("1.jpg");
		image.setIcon(icon);

		day = new JLabel();
		day.setFont(new Font("Dialog", Font.BOLD, 40));
		getContentPane().add(day, BorderLayout.SOUTH);
		Date date = new Date();
		day.setText(date + "");
		
		// Count thread
		Count2 c = new Count2();
		c.start();
		
		// Day thread
		Day2 d = new Day2();
		d.start();
		
		// img thread
		Image2 i = new Image2();
		i.start();

		setVisible(true);
	}

	public static void main(String[] args) { 
		스레드연습 t = new 스레드연습(); // 자기 자신에 대한 객체 생성
	} // main
	
	// 변수를 공유할 목적으로 두 크래스를 사용해야 한다면 
	// 변수를 공유해야하는 두 클래스가 있다면, 클래스 안에 클래스를 낄 수 있다.
	// inner class, 내부클래스
	// 내부클래스는 독립적으로 쓸 수 없다. (다른 곳에서 new로 부를 수 없다.)
	public class Count2 extends Thread {

		@Override
		public void run() {
			for (int i = 500; i >= 0; i--) {
				count.setText("count : " + i); // main안에 변수를 선언하면 이 클래스에서는 사용할 수 없기 때문에 main위에서 선언해준다.
				try {
					Thread.sleep(500); // 1초가 1000
				} catch (InterruptedException e) { // 인터럽트 (방해, 중단), 실행을 하려다 중단하려는것 (예 esc, ctrl+c, alt+f4, 전원 off)
					e.printStackTrace();
				} // catch
			} // for
		} // run
	} // inner class
	public class Day2 extends Thread {

		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				Date date = new Date();
				day.setText(date + "");
				try {
					Thread.sleep(500); // 1초가 1000
				} catch (InterruptedException e) { // 인터럽트 (방해, 중단), 실행을 하려다 중단하려는것 (예 esc, ctrl+c, alt+f4, 전원 off)
					e.printStackTrace();
				} // catch
			} // for
		} // run
	} // inner class
	public class Image2 extends Thread {

		@Override
		public void run() {
			String[] list = {"1.jpg","2.jpg","3.jpg","4.jpg","5.jpg"};
			for (int i = 0; i < list.length; i++) {
				ImageIcon icon = new ImageIcon(list[i]);
				image.setIcon(icon);
				if (i == 4) { 
					i = -1; // i++ 로 5로 끝나기에 다시 초기화 시켜줌.
				}
				try {
					// 초를 설정할 때는 밀리세컨즈,
					Thread.sleep(5000); // 1초가 1000
				} catch (InterruptedException e) { // 인터럽트 (방해, 중단), 실행을 하려다 중단하려는것 (예 esc, ctrl+c, alt+f4, 전원 off)
					e.printStackTrace();
				} // catch
			} // for
		} // run
	} // inner class

	
	
	

} // class
