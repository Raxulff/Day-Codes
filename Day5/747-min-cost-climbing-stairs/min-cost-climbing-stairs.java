class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return Math.min(function1(dp,0,cost),function1(dp,1,cost));
    }
    public static int function1(int[] dp,int ind,int[] cost){
        // 1base conditon
        if(ind >= cost.length) return 0;
        
        // 2->check if exist***
        if(dp[ind] != -1) return dp[ind];

        //updating the dp
        int stepOne = cost[ind] + function1(dp,ind+1,cost);
        int stepTwo = cost[ind] + function1(dp,ind+2,cost);

        dp[ind] = Math.min(stepOne,stepTwo);
        return dp[ind];
    }
}

