package zoho;

public class minimumOperationsGFG {
 
    static final int N = 5;
    static final int M = 5;
 
// Return minimum operation required to make all 1s.
    static int minOperation(boolean arr[][])
    {
        int ans = 0;
        for (int i = N - 1; i >= 0; i--)
        {
            for (int j = M - 1; j >= 0; j--)
            {
                // check if this cell equals 0
                if (arr[i][j] == false)
                {
                    // increase the number of moves
                    ans++;
 
                    // flip from this cell to the start point
                    for (int k = 0; k <= i; k++)
                    {
                        for (int h = 0; h <= j; h++)
                        {
                            // flip the cell
                            if (arr[k][h] == true)
                            {
                                arr[k][h] = false;
                            } else {
                                arr[k][h] = true;
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }
 
// Driven Program
    public static void main(String[] args) {
 
        boolean mat[][]
                = {
                    {false, false, false, true, false},
                    {true, false, true, true, true},
                    {false, false, true, false, false},
                    {true, true, true, false, true},
                    {true, false, true, true, false}
                };
 
        System.out.println("Answer: " + minOperation(mat));
    }
}