class Solution {
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        // MY BRUTEFORCE SOLUTION
        
        // arraylist to store the valid words count for each puzzle
        ArrayList<Integer> answer = new ArrayList();
        
        // iterate each puzzle
        for(int i=0; i<puzzles.length; i++) {
            // store valid words count for each puzzle
            int validWords = 0;
            String puzzle = puzzles[i];
            
            // iterate the words array to find the valid words
            for(int j=0; j<words.length; j++) {
                String word = words[j];
                Boolean isValid = true;
                
                // check the 1st constraint
                // the word should contain the first letter of the puzzle
                if(word.contains(puzzle.charAt(0)+"")) {
                    // now check if the letters in words are in puzzle
                    for(int k=0; k<word.length(); k++) {
                        if(!puzzle.contains(word.charAt(k)+"")) {
                            isValid = false;
                            break;
                        }
                    }   
                } else {
                    isValid = false;
                }
                
                if(isValid)
                    validWords = validWords + 1;
            }
            
            answer.add(validWords);
        }
        return answer;
    }
}


// 9 / 10 test cases passed.
// Status: Time Limit Exceeded