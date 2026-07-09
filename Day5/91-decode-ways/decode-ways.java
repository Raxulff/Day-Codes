class Solution {
    public int numDecodings(String s) {
        int[] dp = new int[s.length()+1];
        Arrays.fill(dp,-1);
        return function(s,dp,0);
    }
    public static int function(String s,int[] dp,int ind){
        if(ind >= s.length()) return 1;
        if(s.charAt(ind) == '0') return 0;
        if(dp[ind] != -1) return dp[ind];
        int way = function(s,dp,ind+1);

        if(ind+1 < s.length() && Integer.parseInt(s.substring(ind,ind+2)) <= 26){
            way = way + function(s,dp,ind+2);
        }
        dp[ind] = way;
        return dp[ind];
    }
}