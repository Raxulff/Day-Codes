class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        
        Integer[] dp1 = new Integer[n];
        Integer[] dp2 = new Integer[n];

        return Math.max(function1(0,n-1,nums,dp1), function1(1, n,nums,dp2));

    }

    public static int function1(int ind,int end,int[] nums,
     Integer[] dp) {
        // 1-> base case
        if (ind >= end)
            return 0;

        if(dp[ind] != null)
            return dp[ind];
        int pick = nums[ind] + function1(ind + 2,end,nums,dp);
        int notPick = 0 + function1(ind + 1,end,nums,dp);

        //4-> update the dp
        return dp[ind] = Math.max(pick, notPick);
        
    }
}
