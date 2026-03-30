// Bit Manipulation
// Time Complexity --> O(n)
class Solution {
    public int hammingDistance(int x, int y) {
        int xor1 = -1;
        int xor2 = -1;
        int count = 0;
        for(int i=0; i<32; i++){
            xor1 = ((x &(1<<i)));
            xor2 = ((y & (1<<i)));
            if(xor1!=xor2){
                count++;
            }
        }
        return count;
        }
    }
