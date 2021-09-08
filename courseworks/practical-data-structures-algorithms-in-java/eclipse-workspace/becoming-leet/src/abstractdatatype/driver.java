package abstractdatatype;

public class driver {
	public static void main(String[] args) {
		counter counter = new counter("2");
		
		int t = 0;
		while(t < 5) {
			counter.increment();
			t++;
		}
		
		System.out.println("Counter after incrementing to 5 times: "+ counter.toString());
	}
}
