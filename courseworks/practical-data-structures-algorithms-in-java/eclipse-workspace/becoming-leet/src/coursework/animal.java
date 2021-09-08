package coursework;

public class animal {
	int age;
	String origin;
	String type;
	
	public animal(int age, String origin, String type) {
		this.age = age;
		this.origin = origin;
		this.type = type;
	}
	
	public void sleep(String animal) {
		System.out.println("Name: " + animal);
		System.out.println("Age: " + this.age);
		System.out.println("Origin: " + this.origin);
		System.out.println("Type: " + this.type);
		System.out.println(animal + " sleeps..z..zz...zzz...");
	}
	
	public void eats(String animal) {
		System.out.println(animal + " eats..yum...yumm....yummm...");
	}
}
