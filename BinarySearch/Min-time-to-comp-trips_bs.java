// Binary Search
// Complexity --> O(log n)
class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long min = time[0];
        int add = 0;
        for(int x = 1; x<time.length; x++){
            if(time[x]<min){
                min = time[x];
            }
        }
    
        long s = 1;
        long e = (long) min*totalTrips;

        while(s<e){
            long mid = s+(e-s)/2;
            long trips = 0;
            for(int i = 0; i<time.length; i++){
                trips+=(mid/time[i]);
            }
            if(trips >= totalTrips){
                e = mid;
            }else{
                s = mid+1;
            }
        }
        return s;
    }
}