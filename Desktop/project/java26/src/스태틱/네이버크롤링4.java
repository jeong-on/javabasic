package 스태틱;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class 네이버크롤링4 {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("http://shop.danawa.com/main/?contro");
		// System.out.println(con);
		
		// 2. 연결한 사이트에 html문서를 받아오세요
		Document doc = con.get();
		System.out.println();
		System.out.println(i + ": " + anav.get(i));

	}

}
