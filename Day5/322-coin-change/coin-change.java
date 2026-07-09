class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[] dp = new int[amount+1];
        Arrays.fill(dp,-1);
        int ans = solve(coins,amount,dp);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
    public static int solve(int[] coins,int amt,int[] dp){
        if(amt == 0) return 0;
        if(amt < 0) return Integer.MAX_VALUE;

        if(dp[amt] != -1) return dp[amt];
        int minCoin = Integer.MAX_VALUE;
        for(int c : coins){
            int res = solve(coins,amt - c,dp);
            if(res != Integer.MAX_VALUE){
                minCoin = Math.min(minCoin,res+1);
            }
        }
        dp[amt] = minCoin;
        return dp[amt];
    }
}