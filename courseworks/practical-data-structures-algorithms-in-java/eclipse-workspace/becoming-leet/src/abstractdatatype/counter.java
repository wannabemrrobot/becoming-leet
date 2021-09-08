package abstractdatatype;

public class counter {
	private int num = 0;
	
	public counter(String num) {
		this.num = Integer.parseInt(num);
	}
	
	public void increment() {
		this.num++;
	}
	
	public int getCurrentValue() {
		return this.num;
	}
	
	public String toString() {
		return this.num+"";
	}
}
