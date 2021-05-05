package 네트워크;

import java.net.*;
import java.io.*;
import java.util.*;

public class TCP날짜시간클라이언트 {

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 500; i++) {
			Socket socket = new Socket("localhost",9000);
			System.out.println(i + "번 : 클라이언트가 9000포트 서버에 연결을 요청함.");

			
			BufferedReader buffer2 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// buffer : 임시 기억장치, 장소
			String data = buffer2.readLine(); // buffer2에 있는것중 한줄만 읽어라
			System.out.println("서버로부터 받은 데이터 >> " + data);
		}
		
	}
}

