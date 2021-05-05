package Review04;

public class Main4 {

	public static void main(String[] args) {
		증가스레드 up = new 증가스레드();
		감소스레드 down = new 감소스레드();
		
		up.start();
		down.start();
	}
}
