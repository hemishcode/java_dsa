// Bit Manipulation
// Time Complexity --> O(n)
class Solution {
    public int missingNumber(int[] nums) {
        int x = 0;
       for(int i =0; i<nums.length; i++){
        x = x ^ i ^ nums[i];
       }
       return x ^ nums.length;
    }
}
