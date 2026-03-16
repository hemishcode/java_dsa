// Binary Search
// Complexity --> O(log n)
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for(int i = 1; i<piles.length; i++){
            if(piles[i]>max){
                max = piles[i];
            }
        }
        int s = 1;
        int e = max;
        while(s<e){
            int mid = s+(e-s)/2;
            int hours = 0;
            for(int j = 0; j<piles.length; j++){
                hours+=(piles[j]+(mid-1))/mid;
            }
            if(h<hours){
                s = mid+1;
            }else{
                e = mid;
            }
        }
        return s;
    }
}