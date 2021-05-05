package 크롤링;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Overwatch {

	public static void main(String[] args) throws Exception {
		
			// 1. 사이트 연결
			Connection con = Jsoup.connect("https://overwatch.op.gg/heroes/global");
			
			// 2. 연결한 사이트의 html 받기
			Document doc = con.get();
			
			Elements num = doc.select("td.Id");
			System.out.println(num.size());
			
			Elements hero = doc.select("span.Name");
			System.out.println(hero.size());
			
			Elements val = doc.select("table.HeroesRank span.value");
			System.out.println(val.size());
			
			String[] a = new String[num.size()];
			int i = 0;
			while (i<a.length) {
				for (int j = 0; j < val.size(); j+=4) {
					a[i] = val.get(j).text() + "\t" + val.get(j+1).text() + "\t" + val.get(j+2).text() + "\t" + val.get(j+3).text();
					i++;
				}
			}
		try {	
			FileWriter f = new FileWriter("/Users/joy/Desktop/data/오버워치영웅통계.txt");
			for (int k = 0; k < a.length; k++) {
				f.write(num.get(k).text() + "\t" + hero.get(k).text() + "\t" + a[k] + "\n");
			}
			f.close();
		} catch (Exception e) {
			System.out.println("실패");
		}

	}

}
