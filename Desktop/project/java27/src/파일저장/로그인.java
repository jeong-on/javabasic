package 파일저장;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 로그인 {
	
	private static JTextField t1; // 전역변수, 메서드(지금은 main)가 스태틱이면 전역변수도 스태틱이 되어야함.
	private static JTextField t2;

	public static void main(String[] args) {
		
		JFrame f = new JFrame("로그인 화면"); // f는 참조형 주소
		// static 변수 : 객체생성하지 않아도 언제든 클래스 이름으로 접근해서
		//				바로 그 변수의 값을 가져다 쓸 수 있는 변수
		//				그래픽 프로그램에서는 font의 속성, color의 값 등을
		//				자주 쓰므로 static 변수로 만들어두어서 편하게
		// 언제든 쓸 수 있
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(350, 500); // 주소가 있어야 일반 메서드 사용 가능
		f.getContentPane().setLayout(null);
		
		JLabel top = new JLabel("");
		top.setBounds(34, 31, 270, 134); // 절대위치를 내가 넣어주는것.(x축, y축 자리에, 가로크기, 세로크기)
		f.getContentPane().add(top);
		
		ImageIcon icon = new ImageIcon("1.png");
		top.setIcon(icon);
		
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(34, 206, 95, 35);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("패스워드");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(34, 267, 95, 35);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t1 = new JTextField();
		t1.setHorizontalAlignment(SwingConstants.RIGHT);
		t1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		t1.setBackground(Color.LIGHT_GRAY);
		t1.setBounds(174, 201, 130, 40);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setHorizontalAlignment(SwingConstants.RIGHT);
		t2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		t2.setColumns(10);
		t2.setBackground(Color.LIGHT_GRAY);
		t2.setBounds(174, 262, 130, 40);
		f.getContentPane().add(t2);
		
		JButton login = new JButton("");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 로그인 처리, 입력한 값을 가져와야함.
				String s1 = t1.getText(); // 아이디 입력한 값.
				String s2 = t2.getText(); // 비밀번호 입력한 값.
				// root, 1234 동일하면 "로그인 성공", 동일하지 않으면 "로그인 실패"
				if (s1.equals("root") && s2.equals("1234")){ // pw를 String으로 받았기 때문에 ""으로 받음.
					JOptionPane.showMessageDialog(f, "로그인 성공");
					Diary diary = new Diary();
					diary.open();
					f.dispose();
				} else {
					JOptionPane.showMessageDialog(f, "로그인 실패");					
				}
			}
		});
		login.setBounds(34, 333, 117, 97);
		f.getContentPane().add(login);
		
		ImageIcon icon2 = new ImageIcon("login.jpg");
		login.setIcon(icon2);
		
		JButton reset = new JButton("");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // 버튼을 더블클릭하면 자동생성되는 메서드, 인터페이스라는 문법
				// 버튼을 클릭했을때 처리 내용
				// t1, t2 입력한 내용을 지워라.
				t1.setText(""); // 공백을 넣었기 때문에 지워지는 효과처럼 보여짐
				t2.setText("");
			}
		});
		reset.setBounds(187, 333, 117, 97);
		f.getContentPane().add(reset);
		f.setVisible(true);
		
		reset.setIcon(new ImageIcon("reset.jpg"));

		//항상 마지막 줄.!!
		f.setVisible(true);
		

	}
}
