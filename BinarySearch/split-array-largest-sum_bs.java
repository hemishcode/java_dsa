// Binary Search
// Complexity --> O(log n)
class Solution {
    public int splitArray(int[] nums, int k) {
        int max = 0;
        int tot = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        for(int x = 0; x<nums.length; x++){
            tot+=nums[x];
        }
        int s = max;
        int e = tot;
        while(s<e){
            int mid = s+(e-s)/2;
            int splits = 1;
            int add = 0;
            for(int j = 0; j<nums.length; j++){
                if((add+nums[j])<=mid){
                    add+=nums[j];
                }else{
                    splits++;
                    add = nums[j];
                }
            }
            if(splits>k){
                s = mid+1;
            }else{
                e = mid;
            }
        }
        return s;
    }
}