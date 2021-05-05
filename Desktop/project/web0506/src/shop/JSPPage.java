package shop;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JSPPage extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("내가 요청을 받는 메서드");
	}
	
	@Override
	public void init() throws ServletException {
	}
	
	@Override
	public void destroy() {
	}
	
	public static void main(String[] args) {
		System.out.println("i am d2...!!");
	}
}
