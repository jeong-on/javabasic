package 파일저장;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 파일에저장 { // eclipse-workspace/java27/안에 test.txt를 만들어 저

	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("날짜입력");
		String s2 = JOptionPane.showInputDialog("제목입력");
		String s3 = JOptionPane.showInputDialog("내용입력");
		try {
			// 해당 폴더와 스트림(연결통로)을 만든다.
			// 스트림의 특징은 한방향! (자바->폴더)
			// 해당 파일의 경로 복사 커맨드+옵션+c
			FileWriter f = new FileWriter("/Users/joy/Desktop/data/test.txt"); // 문자를 저장할때, Writer가 붙은 애들은 문자만 취급.
			// FileWriter f = new FileWriter("/Users/joy/Desktop/data/" + s1 + ".txt"); // 파일 이름 변경가능
			f.write(s1 + "\n");
			f.write(s2 + "\n");
			f.write(s3 + "\n");
			f.close(); // *************폴더로 연결된 stream은 사용하고 나면 무조건 끊어주어야함.************
		} catch (IOException e) {
			System.out.println("파일로 저장 중 에러발생");
			System.out.println("에러 정보는 " + e.getMessage());
		} 
	}
}
