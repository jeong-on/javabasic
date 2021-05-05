package Review01;

public class Car {
	
	String brand;
	String color;
	
	public void speedup() {
		System.out.println("속도를 높이다.");
	}
	public void stop() {
		System.out.println("멈추다.");
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + "]";
	}
	
	

}
