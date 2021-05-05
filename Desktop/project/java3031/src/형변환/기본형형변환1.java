package 형변환;

public class 기본형형변환1 {

	public static void main(String[] args) {
		// 정수 :
		// byte (1바이트, -128 ~ 127)
		// short (2바이트, -3만 ~ 3만)
		// int (4바이트, -21억 ~ 21억)
		// long (8바이트,21억 이상 ~ -21억이하)
		byte x = 100; // 확실히 127이 넘어가지 않는 경우에만 사용, 127이 넘어갈것같다면 int를 쓰는것이 낫다.
		int y = x; // 기본형 복사(배열을 사용하지 않는 이상 한개만 들어감.)
		// x에 들어있던 100이라는 값이 y에 들어갈 수 있도록
		// 자동으로 int타입으로 변환되어 들어감.(1바이트->4바이트)
		// 자동형변환(int(큰)<--byte(작은))
		// 크고 작은 값이 있을때만 형변환이 가능(배열은 불가능) 예시 -> byte[] a = {1,2,3} int b = a
		// *******************참조형변환은 상속 관계에 있을때만 가능하다*******************
		
		byte z = (byte) y; // byte z = y; 는 불가능
		// y에 들어있던 100이라는 값이 z에 들어갈수 있도록
		// 강제로 byte타입으로 변환시켜 들어가야 한다.
		// 강제형변환(byte(작은)<--int(큰))
		
		// 강제형변환은 잘라서 집어넣을 작은 범위에서 허용한 값만 가능하다.
		// int x1 = 1000;
		// byte y1 = (byte) x1; (불가능)
	}
}
