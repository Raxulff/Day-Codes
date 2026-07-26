class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n<=1) return nums[0];
        Integer[] dp = new Integer[n];
        int prev2 = nums[0];
        int prev1 = Math.max(nums[0],nums[1]);
        int curr = 0;
        for(int ind = 2;ind < n;ind++){
            curr = Math.max(prev1,nums[ind]+prev2);
            prev2 = prev1;
            prev1 = curr;
        }
        //System.out.print(Arrays.toString(dp));
        return prev1;
    }
}