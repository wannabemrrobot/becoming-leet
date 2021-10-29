package zoho;

public class minimumOperations {
	public static void main(String[] args) {
		int mat[][] = {{0,0,0,1,0},{1,0,1,1,1},{0,0,1,0,0},{1,1,1,0,1},{1,0,1,1,0}};
		int count = 0;
		
		// printing the initial binary matrix
		System.out.println("Initial Matrix: ");
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("=================");

		// find the last occurring zero, the starting point and toggle the operation
		for(int i=mat.length-1; i>=0; i--) {
			for(int j=mat[0].length-1; j>=0; j--) {
				if(mat[i][j] == 0) {
					System.out.println("Toggling: " + "(" + i + "," + j + ")");
					count = toggle(mat, i, j, count);
					break;
				}
			}
		}
		
		// print the resultant matrix
		System.out.println("Resultant Matrix:");
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		// print the final minimum number of operations
		System.out.println("\nMinimum Operations: " + count);
	}

	public static int toggle(int[][] mat, int row, int col, int count) {
		// increment count on every toggle
		count = count +1;
		// toggle operation - change 1's to 0's and vice versa
		for(int i=0; i<=row; i++) {
			for(int j=0; j<=col; j++) {
				if(mat[i][j] == 0)
					mat[i][j] = 1;
				else
					mat[i][j] = 0;
			}
		}
		
		System.out.println("Matrix after toggling: ");
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("=================");
		
		// check the last toggle-updated matrix, for the last occurring zero recursively
		for(int i=mat.length-1; i>=0; i--) {
			for(int j=mat[0].length-1; j>=0; j--) {
				if(mat[i][j] == 0) {
					System.out.println("Toggling: " + "(" + i + "," + j + ")");
					count = toggle(mat, i, j, count);
				}
			}
		}
		
		return count;
	}
}
