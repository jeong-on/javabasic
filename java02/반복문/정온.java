package 반복문;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 정온 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t4;
	private static JTextField t3;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(600, 600);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("먹고 싶은 음식");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblNewLabel.setBounds(48, 39, 217, 50);
		f.getContentPane().add(lblNewLabel);

		t1 = new JTextField();
		t1.setBackground(Color.YELLOW);
		t1.setBounds(313, 39, 230, 50);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		JButton b1 = new JButton("어디로 갈까?");
		b1.setBounds(58, 101, 484, 50);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String s1 = t1.getText();
				if (s1.equals("짬뽕")) {
					JOptionPane.showMessageDialog(f, "중국집으로");
				} else {
					JOptionPane.showInternalMessageDialog(f,"어디로갈래");
				}
			}
		});
		f.getContentPane().add(b1);

		JLabel lblNewLabel_1 = new JLabel("당신의 나이는");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(48, 188, 217, 50);
		f.getContentPane().add(lblNewLabel_1);

		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBackground(Color.PINK);
		t2.setBounds(313, 188, 230, 50);
		f.getContentPane().add(t2);

		JButton b2 = new JButton("나의 내년 나이는?");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s2 = t2.getText();
				int age = Integer.parseInt(s2);
				JOptionPane.showMessageDialog(f, age+1);
			}
		});
		b2.setBounds(58, 250, 484, 50);
		f.getContentPane().add(b2);

		JLabel lblNewLabel_2 = new JLabel("수학점수");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(48, 413, 217, 50);
		f.getContentPane().add(lblNewLabel_2);

		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBackground(Color.CYAN);
		t4.setBounds(313, 413, 230, 50);
		f.getContentPane().add(t4);

		JButton b3 = new JButton("두과목 점수의 평균은?");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s3 = t3.getName();
				String s4 = t4.getName();
				int kor = Integer.parseInt(s3);
				int math = Integer.parseInt(s4);
				int avg = (kor+math)/2 ;
				JOptionPane.showConfirmDialog(f, "두 과목의 평균은"+avg);
			}
		});
		b3.setBounds(58, 475, 484, 50);
		f.getContentPane().add(b3);

		JLabel lblNewLabel_2_1 = new JLabel("국어점수");
		lblNewLabel_2_1.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblNewLabel_2_1.setBounds(48, 336, 217, 50);
		f.getContentPane().add(lblNewLabel_2_1);

		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBackground(Color.CYAN);
		t3.setBounds(313, 336, 230, 50);
		f.getContentPane().add(t3);
		f.setVisible(true);

	}
}