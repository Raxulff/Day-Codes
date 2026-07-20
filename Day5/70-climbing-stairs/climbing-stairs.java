class Solution {
    public int climbStairs(int n) {
        if(n<=3){
            return n;
        }
        Integer[] dp= new Integer[n+1];
        return fun(dp,n);
    }
    public static int fun(Integer[] dp,int n){
        if(n <= 3)
            return n;
        if(dp[n]!= null){
            return dp[n];
        }
        return dp[n] = fun(dp,n-1) + fun(dp,n-2);
    }
}