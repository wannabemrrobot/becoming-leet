class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        // BRUTEFORCE SOLUTION
        
        // find the length of the input matrix, and check if the resultant matrix is possible using 'r' & 'c'
        int matLength = mat.length * mat[0].length;
        if(matLength != r*c) {
            return mat;
        }
        
        // result array formed using given 'r' and 'c'
        int[][] resultMatrix = new int[r][c];
        // variables to keep track of the indices of the given input matrix
        int row = 0;
        int col = 0;
        
        // iterate the result matrix, and place the elements in the input matrix
        for(int i=0; i<resultMatrix.length; i++) {
            for(int j=0; j<resultMatrix[0].length; j++) {
                // to keep track of the index of the input array,
                // the row pointer will increment only if all the elements in the row are done placing.
                if(col == mat[0].length) {
                    row++;
                    col = 0;
                }
                resultMatrix[i][j] = mat[row][col];
                col++;
            }
        }
        
        return resultMatrix;
    }
}

// Runtime: 1 ms, faster than 55.70% of Java online submissions for Reshape the Matrix.
// Memory Usage: 47.9 MB, less than 30.31% of Java online submissions for Reshape the Matrix.