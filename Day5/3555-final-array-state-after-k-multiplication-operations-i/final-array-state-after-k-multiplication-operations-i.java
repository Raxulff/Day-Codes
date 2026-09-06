class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int itr = 1;itr <= k;itr++){
            int[] ans = findSmall(nums);
            int replace = ans[0]*multiplier;
            nums[ans[1]] = replace;
        }
        return nums;
    }
    public static int[] findSmall(int[] nums){
        int small = Integer.MAX_VALUE;
        int index = 0;
        int smallIndex = 0;
        for(int val : nums){
            if(val < small){
                small = val;
                smallIndex = index;
            }
            index++;
        }
        return new int[]{small,smallIndex};
    }
}