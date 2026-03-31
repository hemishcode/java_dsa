// Bit Manipulation
// Time Complexity --> O(n)
class Solution {
    public char findTheDifference(String s, String t) {
        char ans = 0;
       for(int i = 0; i<s.length(); i++){
        ans = (char) (ans ^ s.charAt(i));
       }
       for(int j = 0; j<t.length(); j++){
        ans = (char) (ans ^ t.charAt(j));
       }
       return ans;
    }
}