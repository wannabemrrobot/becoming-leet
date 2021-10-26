import java.util.*;

public class charCountPrinting
{
	public static void main(String[] args) {
		String s = "a10b20c12";
		ArrayList<Integer> nums = new ArrayList();
		String chars = "";
		String tempNum = "";
		
		for(Character c: s.toCharArray()) {
		    if(!Character.isDigit(c)) {
		        chars = chars + c;
		        try {
		         nums.add(Integer.parseInt(tempNum));
		         tempNum = "";
		        } catch(Exception e) {
		            
		        }
		    } else {
		        tempNum = tempNum + c;
		    }
		}
		nums.add(Integer.parseInt(tempNum));
		
		System.out.println(chars);
		for(int num: nums) {
		    System.out.println(num);
		}
		
		for(int i=0; i<chars.length(); i++) {
		    for(int j=0; j<nums.get(i); j++) {
		       System.out.print(chars.charAt(i)); 
		    }
		    System.out.println();
		}
	}
}
