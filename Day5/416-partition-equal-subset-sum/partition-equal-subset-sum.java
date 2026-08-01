class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int val : nums)
            sum+=val;
        if((sum&1) == 1)
            return false;
        int target = sum/2;
        int n = nums.length;
        boolean[][] dp = new boolean[n][target+1];

        for(int ind = 0;ind < n;ind++)
            dp[ind][0] = true;

        if(nums[0] < target)
            dp[0][nums[0]] = true;
        for(int ind  = 1;ind < n;ind++){
            for(int indTarget = 1;indTarget <= target;indTarget++){
                boolean notTake = dp[ind-1][indTarget];
                boolean take = false;
                if(nums[ind] <= indTarget)
                    take = dp[ind-1][indTarget-nums[ind]];
                dp[ind][indTarget] = notTake || take;

            }
        }
        return dp[n-1][target];
    }
}