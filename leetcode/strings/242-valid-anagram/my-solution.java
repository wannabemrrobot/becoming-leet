class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        // iterate through the string and insert characters into the hashmap with their count
        for(int i=0; i<s.length(); i++) {
            if(!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
        }
        
        // for every string t's character in the string s, decrement the count
        // return false, if a character in string 't' is not present
        for(int i=0; i<t.length(); i++) {
            if(!map.containsKey(t.charAt(i)))
                return false;
            
            map.put(t.charAt(i), map.get(t.charAt(i))-1);
        }
        
        // return false, if any hashmap entry has value greater than one
        for(Map.Entry entry: map.entrySet()) {
            if((int)entry.getValue() > 0) {
                return false;
            }
        }
        return true;
    }
}

// Runtime: 24 ms, faster than 10.85% of Java online submissions for Valid Anagram.
// Memory Usage: 43.5 MB, less than 6.43% of Java online submissions for Valid Anagram.