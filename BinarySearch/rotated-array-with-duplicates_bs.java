// Binary Search
// Complexity --> O(log n)
class Solution {
    public boolean search(int[] nums, int target) {
        int pivot = pivot(nums);
        int k=-1;
        if(pivot == -1){
            k = res(nums, target, 0, nums.length-1);
        }else if(target == nums[pivot]){
             k = pivot;
        }else if(target>=nums[0]){
             k = res(nums, target, 0, pivot-1);
        }else{
             k = res(nums, target, pivot+1, nums.length-1);
        }
    if(k==-1){
        return false;
    }else{
        return true;
    }
    }
    public int pivot(int[] nums){
        int s = 0;
        int e = nums.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(mid<e && nums[mid]>nums[mid+1]){
                return mid;
            }else if(mid>s && nums[mid-1]>nums[mid]){
                return mid-1;
            }else if(nums[mid]==nums[s] && nums[mid]==nums[e]){
                if(s<e && nums[s]>nums[s+1]){
                    return s;
                }
                s++;
                if(e>s && nums[e-1]>nums[e]){
                    return e-1;
                }
                e--;
            }
            else if((nums[s]<nums[mid]) || (nums[mid]==nums[s] && nums[mid]>nums[e])){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return -1;
    }
    public int res(int[] nums, int target, int s, int e){
        while(s<=e){
            int mid = s+(e-s)/2;
            if(target>nums[mid]){
                s = mid+1;
            }else if(target<nums[mid]){
                e = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}