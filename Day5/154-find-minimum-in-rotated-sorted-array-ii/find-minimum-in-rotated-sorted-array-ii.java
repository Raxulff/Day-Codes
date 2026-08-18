class Solution {
    public int findMin(int[] nums) {
        int high = nums.length-1;
        int min = Integer.MAX_VALUE;
        for(int low = 0;low <= high;){
            int mid = low + (high -low)/2;
            if(nums[low] == nums[mid] && nums[mid] == nums[high]) {
                min = Math.min(min,nums[low]);
                high--;
                
                continue;
            }
            if(nums[low] <= nums[mid]){
                min = Math.min(min,nums[low]);
                low = mid + 1;
            }else{
                min = Math.min(min,nums[mid]);
                high = mid-1;
            }
        }
        return min;
    }
}