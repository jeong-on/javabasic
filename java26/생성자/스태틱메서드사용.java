package 생성자;

import javax.swing.JOptionPane;

public class 스태틱메서드사용 {

	public static void main(String[] args) {
		// 자바 전체에서 아주 많이 사용되는 기능을 사용하고자 하는경우
		// new를 사용해서 객체를 생성한 후에 메서드를 사용하면
		// 인스턴스 변수들 모두 복사가 되고, 참조형 변수가 생성되는 등
		// 그 기능을 쓰기 위해서 너무 많은 불필요한 작업들이 이루어짐.
		// static메서드로 만들어놓으면, 객체 생성하지 않아도
		// 바로 클래스 이름으로만 그 기능을 쓸 수 있다.
		String s = JOptionPane.showInputDialog("숫자입력");
		int n = Integer.parseInt(s); // 이미 static으로 만들어져있다(대문자)
		
	}
}
