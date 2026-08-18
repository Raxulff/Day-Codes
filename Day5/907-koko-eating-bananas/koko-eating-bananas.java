class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long high = piles[0];

        for(int val : piles){
            high = Math.max(high,val);
        }
        long ans = 0;
        for(long low = 1;low <= high;){
            long mid = low + (high - low)/2;
            long hour = 0;
            for(int pile : piles){
                hour = hour + (long)(pile + mid -1)/mid;
            }
            if(hour <= h){
                ans = mid;
                high = mid-1;
            }else{
                low = mid + 1;
            }
        }
        return (int) ans;
    }
}