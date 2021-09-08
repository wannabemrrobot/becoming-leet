package coursework;

public class zoo {
	public static void main(String[] args) {
		animal elephant = new animal(10, "african", "herbivorous");
		animal crocodile = new animal(5, "indian", "carnivorous");
		
		elephant.sleep("elephant");
		crocodile.sleep("crocodile");
		
		elephant.eats("elephant");
		crocodile.eats("crocodile");
	}
}
