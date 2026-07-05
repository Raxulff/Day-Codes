class Solution {
    public int[] runningSum(int[] nums) {
        for(int ind = 1;ind < nums.length;ind++){
            nums[ind] = nums[ind] + nums[ind-1];
        }
        return nums;
    }
}