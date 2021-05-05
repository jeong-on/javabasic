package Review01;

public class Main1 {

	public static void main(String[] args) {
		Truck t = new Truck();
		t.brand = "volvo";
		t.color = "red";
		t.ver = 2020;
		t.speedup();
		t.stop();
		t.use();
		
		Sedan s = new Sedan();
		s.brand = "bmw";
		s.color = "white";
		s.country = "germany";
		s.speedup();
		s.stop();
		s.seater();
		
		System.out.println(t);
		System.out.println(s);
	}


}
