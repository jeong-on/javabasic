package Review01;

public class Truck extends Car {

	int ver;
	
	public void use() {
		System.out.println("화물차량");
	}

	@Override
	public String toString() {
		return "Truck [ver=" + ver + ", brand=" + brand + ", color=" + color + "]";
	}
	
}
