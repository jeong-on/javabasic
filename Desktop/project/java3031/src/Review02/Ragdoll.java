package Review02;

public class Ragdoll extends Cat {

	String age;
	
	public void brother() {
		System.out.println(age + " 오빠고양이");
	}

	@Override
	public String toString() {
		return "Ragdoll [age=" + age + ", signature=" + signature + "]";
	}
	
}
