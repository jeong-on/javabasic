package 네트워크;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;

public class TCPServerDate extends Object {

	static Socket socket = null;
	static BufferedReader buffer2 = null;
	static String data = null;
	public TCPServerDate() throws Exception {
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
	public static void main(String[] args) {
		
	}
	public class TCP날짜시간클라이언트 extends Thread {

		@Override
		public void run() {
			for (int i = 0; i < 500; i++) {
				try {
					socket = new Socket("localhost",9000);
				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i + "번 : 클라이언트가 9000포트 서버에 연결을 요청함.");

				
				try {
					buffer2 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// buffer : 임시 기억장치, 장소
				try {
					data = buffer2.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // buffer2에 있는것중 한줄만 읽어라
				System.out.println("서버로부터 받은 데이터 >> " + data);
			}
		}
			
		
	}
	
}
