class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n<=1) return nums[0];
        Integer[] dp = new Integer[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int ind = 2;ind < n;ind++){
            dp[ind] = Math.max(dp[ind-1],nums[ind]+dp[ind-2]);
        }
        System.out.print(Arrays.toString(dp));
        return dp[n-1];
    }
}