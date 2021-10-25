/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// 1
// 3*2
// 4*5*6
// 10*9*8*7

public class Main
{
	public static void main(String[] args) {
	    int count = 1;
	    int tempCount = count;
	    
		for(int i=1; i<=6; i++) {
		    if(i%2 == 0) {
		        // print in reverse direction
		        for(int j=tempCount+(i-1); j>=tempCount; j--) {
		            System.out.print(j);
		            if(j>tempCount)
		                System.out.print("*");
		            count++;
		        }
		        System.out.println();
		    } else {
		        // print in forward direction
		        for(int j=1; j<=i; j++) {
		            System.out.print(count++);
		            if(j<i)
		                System.out.print("*");
		        }
		        System.out.println();
		    }
		    
		    tempCount = count;
		}
	}
}
