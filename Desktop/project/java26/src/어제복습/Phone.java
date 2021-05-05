package 어제복습;

public class Phone {
	
	String color;
	int size;
	
	public void internet() {
		System.out.println("인터넷하다.");
	}
	public void text() {
		System.out.println("문자하다.");
	}
	@Override // 재정의, 오버라이드 (원래는 오브젝트)
	public String toString() {
		return "Phone [color=" + color + ", size=" + size + "]";
	}
	
}
