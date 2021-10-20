class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        // BRUTEFORCE SOLUTION
        
        // find the length of the input matrix, and check if the resultant matrix is possible using 'r' & 'c'
        int matLength = mat.length * mat[0].length;
        if(matLength != r*c) {
            return mat;
        }
        
        // temp matrix to store all the elements in the input matrix
        int[] tempMatrix = new int[r * c];
        int index = 0;
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[0].length; j++) {
                tempMatrix[index++] = mat[i][j];
            }
        }
        
        // resultant array using the given r*c dimension
        int[][] resultMatrix = new int[r][c];
        index = 0;
        // iterate the array and insert the temp array elements
        for(int i=0; i<resultMatrix.length; i++) {
            for(int j=0; j<resultMatrix[0].length; j++) {
                resultMatrix[i][j] = tempMatrix[index++];
            }
        }
        
        return resultMatrix;
    }
}

// Runtime: 2 ms, faster than 22.76% of Java online submissions for Reshape the Matrix.
// Memory Usage: 47.9 MB, less than 24.26% of Java online submissions for Reshape the Matrix.