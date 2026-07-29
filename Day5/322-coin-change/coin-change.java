class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount < 0)
            return -1;
        int n = coins.length;
        Integer[][] dp = new Integer[n][amount+1];
        int ans = solve(n-1,amount,coins,dp);
        return (ans == (int) 1e9 ? -1 : ans);
    }
    public static int solve(int ind,int target,int[] coins,
    Integer[][] dp){
        if(ind == 0){
            if(target%coins[ind] == 0)
                return target/coins[ind];
            return (int) 1e9;
        }
        if(dp[ind][target] != null)
            return dp[ind][target];
        int notTake = solve(ind-1,target,coins,dp);
        int take = (int) 1e9;
        if(coins[ind] <= target){
            take = 1 + solve(ind,target-coins[ind],coins,dp);
        }
        return dp[ind][target] = Math.min(take,notTake);
    }
}