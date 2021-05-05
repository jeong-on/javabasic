package 그래픽;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadGraphic3 extends JFrame { // 내 자신이 JFrame이 되도록 상
	
	static JLabel count, image, day; // 멤버 변수 추가
	// main에서 선언하면 메인에서밖에 쓸 수 없기 때문에
	// static으로 전역변수로 선언해줌
	
	public ThreadGraphic3() { // 생성자 메서드(일반 메서드처럼 작업)
	// public void open()으로 작업할시
	// main안에서 t.open();으로 메서드를 사용하겠다 불러와야함.
		
	// JFrame이 가지고 있던 메서드, 멤버변수 다 가지고 태어남.
	// ThreadGraphic3에서 JFrame의 변수, 메서드를 다 쓸 수 있음.
	
	// 기본 생성자
	// 객체 생성시 이 부분이 자동 호출되어 실행될 예정임.
		
	setSize(800,300); // 가로, 세로 사이즈 설정
	count = new JLabel("counter들어갈 라벨 부분"); // 텍스트를 입력해서 들어갈 위치 확인
	image= new JLabel("");
	day = new JLabel("day들어갈 라벨 부분");
	
	getContentPane().add(count, BorderLayout.WEST); // 앞에서 만든 라벨이 들어갈 위치 선정
	getContentPane().add(image, BorderLayout.EAST);
	getContentPane().add(day, BorderLayout.SOUTH);
	
	Font font = new Font("궁서", Font.BOLD, 50); // 폰트는 색, 글씨체 크기를 지정해줘야 하기 때문에 기본생성자로 사용할 수 없다.
	count.setFont(font); // 폰트를 사용하겠다고 설정
	day.setFont(font);
	
	// Count2 thread
	Count2 count2 = new Count2();
	count2.start();

	// Day2 thread
	Day2 day2 = new Day2();
	day2.start();
	
	// Image2 thread
	Image2 image2 = new Image2();
	image2.start();
	
	setVisible(true); // 마지막에 필수 작성.
	
	}
	// 파라메터 생성자, 생성자 오버로딩
	public static void main(String[] args) {
		ThreadGraphic3 t = new ThreadGraphic3();
	} // main
	
	// 클래스 안에 전역변수를 공유할 목적으로 내부에 끼워 넣는 클래스 : 내부 클래스
	// inner class (안에 들어와서 만들어진 클래스기 때문에 독립적으로 사용 불가함)
	public class Count2 extends Thread { 

		@Override
		public void run() {
			for (int i = 500; i >= 0; i--) {
				count.setText("count : " + i);
				// main안에 변수를 선언하면 이 클래스에서는 사용할 수 없기 때문에 main위에서 선언해준다.
				try {
					Thread.sleep(500); // 1초가 1000
				} catch (InterruptedException e) { // 인터럽트 (방해, 중단), 실행을 하려다 중단하려는것 (예 esc, ctrl+c, alt+f4, 전원 off)
					e.printStackTrace();
				} // catch
			} // for
		} // run
	} // inner class count2

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
	} // inner class day2
	
	public class Image2 extends Thread {

		@Override
		public void run() {
			String[] list = {"1.jpg","2.jpg","3.jpg","4.jpg","5.jpg"};
			for (int i = 0; i < list.length; i++) {
				ImageIcon icon = new ImageIcon(list[i]);
				image.setIcon(icon);
				try {
					// 초를 설정할 때는 밀리세컨즈,
					Thread.sleep(5000); // 1초가 1000
				} catch (InterruptedException e) { // 인터럽트 (방해, 중단), 실행을 하려다 중단하려는것 (예 esc, ctrl+c, alt+f4, 전원 off)
					e.printStackTrace();
				} // catch
			} // for
		} // run
	} // inner class image2
	
	public void go() {
		// 구현하고 싶은 기능추가 가능
	}
} // class
