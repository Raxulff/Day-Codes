class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int val : nums)
            sum+=val;
        if((sum&1) == 1)
            return false;
        int target = sum/2;
        int n = nums.length;
        Boolean[][] dp = new Boolean[n][target+1];

        return solve(nums,target,n-1,dp);
    }
    public static boolean solve(int[] nums,int target,int ind,Boolean[][] dp){
        if(target == 0)
            return true;
        if(ind == 0)
            return nums[ind] == target;
        if(dp[ind][target] != null)
            return dp[ind][target];
        boolean notTake = solve(nums,target,ind-1,dp);
        boolean take = false;
        if(nums[ind] <= target)
            take = solve(nums,target-nums[ind],ind-1,dp);
        return dp[ind][target] = notTake || take; 
    }
}