package 스태틱;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버주가코드 {

	public static void main(String[] args) throws Exception {
		// 1. 사이트에 연결하세요.
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=005930");
		// System.out.println(con); // toString처럼 가져올수있음

		//  2. 연결한 사이트에 html문서를 받아오세요.
		Document doc = con.get();
		// System.out.println(doc);
		Elements anav = doc.select("span.code");
		System.out.println(anav.size());
		for (Element e : anav) {
			System.out.println(e.text());
		}
		for (int i = 0; i < anav.size(); i++) {
			System.out.println(anav.get(i).text());
		}
		
		Elements money = doc.select("p.no_today");
		System.out.println(money.size());
		for (Element m : money) {
			System.out.println(m.text());
		}
		for (int i = 0; i < money.size(); i++) {
			System.out.println(money.get(i).text());
		}
		
	}
}
