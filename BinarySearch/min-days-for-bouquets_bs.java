// Binary Search
// Complexity --> O(log n)
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int max = bloomDay[0];
        for(int i = 1; i<bloomDay.length; i++){
            if(bloomDay[i]>max){
                max = bloomDay[i];
            }
            if ((long) m * k > bloomDay.length){
                return -1;
            }
        }
        int s = 1;
        int e = max;
        while(s<e){
            int mid = s+(e-s)/2;
            int flowers = 0;
            int bouquets = 0;
            for(int i = 0; i<bloomDay.length; i++){
                if(bloomDay[i]<=mid){
                    flowers++;
                
                if(flowers==k){
                    bouquets++;
                    flowers = 0;
                }
                }else{
                    flowers = 0;
                }
            }
            if(bouquets>=m){
                e = mid;
            }else{
                s = mid+1;
            }
        }
        return s;
    }
}
        