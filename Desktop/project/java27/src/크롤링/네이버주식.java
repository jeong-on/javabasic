package 크롤링;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버주식 {

	public static void main(String[] args) throws Exception {
		
		// 1. 사이트 연결
		Connection con = Jsoup.connect("https://finance.naver.com/sise/");
		
		// 2. 연결한 사이트의 html 받기
		Document doc = con.get();
		
		Elements div = doc.select("div.rgt ul#popularItemList a"); // 태그입력
		System.out.println(div.size()); // 위 태그의 갯수
		System.out.println(div.text()); // 태그의 내용
		
		for (Element e : div) { // 태그의 내용을 하단으로 한개씩 출력
			System.out.println(e.text());
		}
		
		Elements div2 = doc.select("div.rgt ul#popularItemList span"); // 태그입력
		System.out.println(div2.size()); // 위 태그의 갯수
		System.out.println(div2.text()); // 태그의 내용
		
		String[] a = new String[10]; // String 10개 저장하는 변수 선언
		int i = 0;
		while (i<a.length) { // i가 9까지만 반복
			for (int j = 0; j < div2.size(); j+=2) { // j=0이고 2씩 증가, div2.siz 갯수만큼 반복
				a[i] = div2.get(j).text(); // a[i]에 저장 -> String 배열에 저장됨.
				i++; // while문이 반복된 후 1씩 증가
			}
		}
		try {
			FileWriter f = new FileWriter("/Users/joy/Desktop/data/주식.txt"); // 위치/텍스트 이름으로 저장
			for (int k = 0; k < a.length; k++) {
				f.write(div.get(k).text() + "\t" + a[k] + "\n");
			}
			f.close();
		} catch (IOException e) {
			
		}
		
		
	}

}
