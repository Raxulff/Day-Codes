class Solution {
    public int findMin(int[] nums) {
        int high = nums.length-1;
        int low = 0;
        int min = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low + (high -low)/2;
            if(nums[low] <= nums[high]){
                min = Math.min(min,nums[low]);
                //return min;
            }
            if(nums[low] <= nums[mid]){
                min = Math.min(min,nums[low]);
                low = mid+1;
            }else{
                high = mid;
            }
            
        }
        return min;
    }
}