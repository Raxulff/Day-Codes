class Solution {
    public int shipWithinDays(int[] arr, int days) {
        int low = 0;
        int high = 0;
        for(int ind = 0;ind < arr.length;ind++){
            low = Math.max(low,arr[ind]);
            high = high + arr[ind];
        }
        int ans = 0;
        for(;low<=high;){
            int mid = low + (high-low)/2;
            int wei = 0;
            int d = 1;
            for(int val : arr){
                if(wei + val > mid){
                    d++;
                    wei = val;
                }else{
                    wei = wei + val;
                }
            }
            if(d <= days){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}