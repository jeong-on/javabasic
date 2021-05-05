package Review01;

public class Sedan extends Car {

	String country;
	
	public void seater() {
		System.out.println("4-5인승");
	}

	@Override
	public String toString() {
		return "Sedan [country=" + country + ", brand=" + brand + ", color=" + color + "]";
	}

	
}
