// Bit Manipulation
// Time Complexity --> O(n)
class Solution {
    public int[] countBits(int n) {
       int[] x = new int[n+1];
       for(int i = 0; i<=n; i++){
        int count = 0;
        for(int j = 0; j<32; j++){
            if((i & (1<<j)) != 0){
                count ++;
            }
        }
        x[i] = count;
       }
       return x;
    }
}
