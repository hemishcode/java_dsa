// Binary Search
// Complexity --> O(log n)
class Solution {
    public int search(int[] nums, int target) {
        int pivot = pivot(nums);
        if(pivot==-1){
            return res(nums, target, 0, nums.length-1);
        }
        else if(nums[pivot]==target){
            return pivot;
        }
        else if(target>=nums[0]){
            return res(nums, target, 0, pivot-1);
        }else{
            return res(nums, target, pivot+1, nums.length-1);
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
            }else if(nums[s]>nums[mid]){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
         return -1;
    }
        public int res(int[] nums, int target, int s, int e){
            int ans = -1;
            while(s<=e){
                int mid = s+(e-s)/2;
                if(target>nums[mid]){
                    s = mid+1;
                }else if(target<nums[mid]){
                    e = mid-1;
                }else{
                    ans = mid;
                    return ans;
                }
            }
            return ans;
        }
    }
