class Solution {
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        // MY BRUTEFORCE SOLUTION
        
        ArrayList<Integer> answer = new ArrayList();
        
        for(int i=0; i<puzzles.length; i++) {
            int validWords = 0;
            String puzzle = puzzles[i];
            
            int[] charArray = new int[26];
            for(Character c: puzzle.toCharArray()) {
                charArray[c-'a']++;
            }
            
            for(int j=0; j<words.length; j++) {
                String word = words[j];
                Boolean isValid = true;
                
                if(word.contains(puzzle.charAt(0)+"")) {
                    for(int k=0; k<word.length(); k++) {
                        if(charArray[word.charAt(k) - 'a'] <= 0) {
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