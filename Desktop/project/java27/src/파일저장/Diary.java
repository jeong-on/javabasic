package 파일저장;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Diary {
	
	private static JTextField t1;
	private static JTextField t2;
	private static JTextArea t3;

	public void open() {
		JFrame f = new JFrame("일기쓰는 화면");
		f.getContentPane().setBackground(Color.YELLOW);
		f.setSize(350,500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("오늘의 날짜");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(26, 50, 105, 34);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setForeground(Color.BLUE);
		t1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		t1.setBounds(172, 50, 151, 34);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("오늘의 제목");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(26, 121, 105, 34);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("오늘의 내용");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(26, 198, 105, 34);
		f.getContentPane().add(lblNewLabel_2);
		
		t2 = new JTextField();
		t2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		t2.setForeground(Color.BLUE);
		t2.setColumns(10);
		t2.setBounds(172, 121, 151, 34);
		f.getContentPane().add(t2);

		JTextArea t3 = new JTextArea();
		
		JButton button = new JButton("파일에 일기 저장");
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e2) {
				// 제목, 날짜, 내용 저장
				String s1 = t1.getText(); // 날짜
				String s2 = t2.getText(); // 제목
				String s3 = t3.getText(); // 내용
				try {
					FileWriter file = new FileWriter("/Users/joy/Desktop/data/"+ s1 +".txt"); 
					file.write(s1 + "\n");
					file.write(s2 + "\n");
					file.write(s3 + "\n");
					file.close();
					JOptionPane.showMessageDialog(f, "파일에 저장 성공"); // frame에 얹어야 하기 때문에 f로 받아줌
				} catch (IOException e) {
					System.out.println("파일로 저장 중 에러발생");
					System.out.println("에러 정보는 " + e.getMessage());
				} 
				
			}
		});
		button.setBackground(Color.MAGENTA);
		button.setOpaque(true);
		button.setBorderPainted(false);
		button.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		button.setBounds(26, 395, 297, 45);
		f.getContentPane().add(button);
		
		t3.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		t3.setColumns(10);
		t3.setRows(5);
		t3.setBounds(174, 198, 151, 146);
		f.getContentPane().add(t3);
		f.setVisible(true);

	}
}
