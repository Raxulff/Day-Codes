class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length-1;
        // while(low <= high){
        //     int mid = low + (high-low)/2;
        //     int miss = arr[mid] - mid - 1;
        //     if(miss < k){
        //         low = mid+1;
        //     }else{
        //         high = mid-1;
        //     }
        // }
        int ans = high+1;
        for(;low <= high;low++){
            int miss = arr[low] -low - 1;
            if(miss >=k){
                ans = low;
                break;
            }   
        }
        return ans + k ;
        //ans = arr[high] + k - (missing);
        //ans = arr[high] + k - (arr[high] - high - 1);
        //ans = arr[high] + k - arr[high] + high + 1;
        //ans = high + 1;
        //return high + k + 1;
    }
}