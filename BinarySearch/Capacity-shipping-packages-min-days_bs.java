// Binary Search
// Time Complexity --> O(log n)
class Solution {
    public int shipWithinDays(int[] weights, int days){
        int max = weights[0];
        int sum = 0;
        for(int x = 1; x<weights.length; x++){
            if(weights[x]>max){
                max = weights[x];
            }
        }
        for(int k = 0; k<weights.length; k++){
            sum+=weights[k];
        }

        int s = max;
        int e = sum;

        while(s<e){
            int mid = s+(e-s)/2;
            int d = 1;
            int pack = 0;
            for(int i = 0; i<weights.length; i++){
                if(pack+weights[i]<=mid){
                    pack+=weights[i];
                }
                else{
                    d++;
                    pack = weights[i];
                }
            }
            if(d>days){
                s = mid+1;
            }else{
                e = mid;
            }
        }
        return s;
    }
}
