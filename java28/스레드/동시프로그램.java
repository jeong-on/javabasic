package 스레드;

public class 동시프로그램 extends Thread { // 무슨말인지 못알아들었으니 검색하기
	// 동시에 처리하고 싶은 프로그램 내용이 있으면
	// Thread 안에 있는 run() 메서드를 override
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("동시에 돌아가요-1");
		}
	}

}
