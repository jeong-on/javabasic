package 크롤링;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class OverwatchHearo {
	private static JTextField t1;

	public static void main(String[] args) {
		
		JFrame f = new JFrame("영웅 통계 확인하기");
		
		f.setSize(350,500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("영웅이름 검색하기");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(32, 89, 277, 44);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBounds(32, 160, 277, 50);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton b1 = new JButton("저장하기");
		b1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		b1.setBounds(32, 264, 277, 50);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("재입력하기");
		b2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		b2.setBounds(32, 352, 277, 50);
		f.getContentPane().add(b2);
		f.setVisible(true);
	}
}
