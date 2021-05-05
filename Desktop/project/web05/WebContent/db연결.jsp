<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%
	// 1. 커넥터 사용하겠다고 설정해야 함.
	Class.forName("com.mysql.jdbc.Driver");
	// PrintWriter out = new PrintWriter();
	out.write("1. 커넥터 사용 설정 성공.<br>");
	// out은 브라우저에 찍는 역할.
	// 다운받은 위치(com이라는 폴더 먼저 생성/회사이름으로 된 폴더 생성/그안에 shop폴더 생성/안에 로그인생성)
	// 대문자Driver는 클래스이름을 뜻함.(클래스이름의 첫글자를 대문자로)
	
	// 2. db연결 해보자! -shop, root, 1234 (db이름, 아이디, 비번 알고있어야함.)
	String url ="jdbc:mysql://localhost:3306/shop";
	// jdbc(java database connector):사용하는 db://localhost:mysql포트/연결할 db이름
	Connection con = DriverManager.getConnection(url, "root", "");
	// 참조형으로 주소를 넘겨줌. 주소를 넘기면 거기서 사용하는 메서드를 사용할 수 있다.
	// return이 있는 변수로 연결해달라고 넘김. -> Connection
	
	out.write("2. db연결 성공.<br>");
	// shop db를 연결하겠다.
	// url을 직접 써주어도 괜찮지만 위에서 따로 선언해줌.
	
	// 3. SQL문을 만든다. (mysql은 sql문만 알고있음) => 해당 부품을 사용해서 SQL문으로 인식하게 해야함.
	// String url = "http://www.naver.com";을 그냥 String으로 인식
	// URL url = new URL("http://www.naver.com"); 으로 적어야 url로 인식함.
	
	// String file = "test.hwp"; 이것도 그냥 String으로 인식함.
	String sql = "insert into member values ('win','win','win','win')";
	// ""안에는 ''으로 기입, "을 쓰면 중간에 끝났다고 인식함.
	out.write("3. SQL문 만들기 성공. <br>");
	PreparedStatement ps = con.prepareStatement(sql);
	// PreparedStatement => SQL문을 담당하는 클래스.
	// 위에서 만든 sql을 객체로 만들어서 저장.
	
	// 4. SQL문을 mySQL서버로 전송함.
	ps.executeUpdate();
	// 3에서 ps넣은것을 전송
	out.write("4. SQL문을 mySQL서버로 전송 성공. <br>");
	
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>