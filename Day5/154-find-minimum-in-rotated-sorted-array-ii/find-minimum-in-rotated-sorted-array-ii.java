class Solution {
    public int findMin(int[] nums) {
        int high = nums.length-1;
        int min = Integer.MAX_VALUE;
        for(int low = 0;low <= high;low++){
            if(nums[low] == nums[high] ) {
                min = Math.min(min,nums[low]);
                continue;
            }
            if(nums[low] <= nums[high]){
                min = Math.min(min,nums[low]);
                return min;
            }
        }
        return min;
    }
}