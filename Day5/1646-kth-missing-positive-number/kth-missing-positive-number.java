class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length;
        while(low <= (high-1)){
            int mid = low + ((high-1)-low)/2;
            int miss = arr[mid] - mid - 1;
            if(miss < k){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        return high + k;
    }
}