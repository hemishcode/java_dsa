// Bit Manipulation
// Time Complexity --> O(n)
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
        int count = 0;
        int pos = -1;
       for(int i = 0; i<32; i++){
        if((n & (1<<i)) != 0){
            count ++;
            pos = i;
        }
       }
        if(count == 1 && pos%2==0){
            return true;
        }else{
            return false;
        }
       }
    }
