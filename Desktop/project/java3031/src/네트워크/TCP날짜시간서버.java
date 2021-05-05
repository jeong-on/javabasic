package 네트워크;

import java.net.*;
import java.io.*;
import java.util.*;

public class TCP날짜시간서버 {

	public static void main(String[] args) throws Exception {
		int count = 0;
		// 클라이언트의 요청을 승인해주기 위한 소켓
		ServerSocket server = new ServerSocket(9000);
		System.out.println("서버 소켓 시작됨.");
		System.out.println("클라이언트의 요청을 기다리는 중...");
		
		while (true) {
			Socket socket = server.accept();
			count++; // count = count + 1; =>증감연산자
			System.out.println("서버가 " + count + "개의 클라이언트의 요청을 승인함");
			
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			
			Date date = new Date();
			out.print(date);
			out.close();
			socket.close();
		}
	}
	
}
