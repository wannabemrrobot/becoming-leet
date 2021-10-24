class Solution {
    public List<List<Integer>> generate(int numRows) {
        // MY BRUTEFORCE SOLUTION
        
        // Array list to store the final pascal triangle row as lists
        List<List<Integer>> pascalsTriangle = new ArrayList();
        // print 'n' lines of pascal's triangle series
        int n=0;
        while(n < numRows) {
            // list to store the row of the pascal's triangle elements
            List<Integer> row = new ArrayList();
            
            // starting of the pascal's triangle
            if(n==0) {
                row.add(1);
            } else {
                // the 'previous-row' of the pascal's triangle
                List<Integer> lastArray = pascalsTriangle.get(pascalsTriangle.size() -1);
                
                // append 1 first to the list(next row)
                row.add(1);
                for(int i=1; i<lastArray.size(); i++) {
                    // append the sum of the previous element and the current element to the list(new row)
                    row.add(lastArray.get(i) + lastArray.get(i-1));
                }
                // append 1 last to the list(next row)
                row.add(1);
            }
            
            // add every row as a separate list to the resultant list
            pascalsTriangle.add(row);
            n++;
        }
        
        return pascalsTriangle;
    }
}

// Runtime: 1 ms, faster than 42.48% of Java online submissions for Pascal's Triangle.
// Memory Usage: 38.2 MB, less than 43.08% of Java online submissions for Pascal's Triangle.