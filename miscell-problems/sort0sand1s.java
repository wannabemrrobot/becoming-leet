/******************************************************************************

                            Online Java Debugger.
                Code, Run and Debug Java program online.
Write your code in this editor and press "Debug" button to debug program.

*******************************************************************************/

public class sort0sand1s
{
	public static void main(String[] args) {
		int[] array = new int[]{0,0,0,0,0,1,1,1,1,0,0,1,0,1,0,1,0,1,1,1,0};
		
		int traversingPointer = 0;
		int insertionPointer = array.length-1;
		
		// loop continues until they intersect
		while(insertionPointer > traversingPointer) {
		    // if TP contains 1 & IP contains 0
            if(array[traversingPointer] > array[insertionPointer]) {
                // swap the elements
                int temp = array[traversingPointer];
                array[traversingPointer] = array[insertionPointer];
                array[insertionPointer] = temp;
                // after swapping, increment TP and decrement IP
                traversingPointer++;
                insertionPointer--;
            // if both the elements are equal and it's 0
            } else if(array[traversingPointer] == array[insertionPointer] && array[traversingPointer]==0) {
                // increment only the TP and not IP, as the element in IP will be replaced in next iteration
                traversingPointer++;
            // if both the elements are equal and it's 1
            } else if(array[traversingPointer] == array[insertionPointer] && array[traversingPointer]==1) {
                // increment only the IP and not TP, as the element in TP will be replaced in next iteration
                insertionPointer--;
            // when element in TP < IP, which is sorted, actually
            } else {
                traversingPointer++;
                insertionPointer--;
            }
		}
		
		System.out.print("[ ");
	    for(int i=0; i<array.length; i++) {
	        System.out.print(array[i] + " ");
	    }
	    System.out.print("]");
	}
}
