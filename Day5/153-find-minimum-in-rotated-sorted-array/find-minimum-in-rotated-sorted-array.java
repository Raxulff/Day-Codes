class Solution {
    public int findMin(int[] nums) {
        int high = nums.length-1;
        int low = 0;
        int min = Integer.MAX_VALUE;
        while(low <= high){
            if(nums[low] <= nums[high]){
                min = Math.min(min,nums[low]);
                return min;
            }
            low++;
        }
        return 0;
    }
}