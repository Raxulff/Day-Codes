class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        Integer[][] dp = new Integer[n][n];
        return function(0,0,triangle,dp);
    }
    public static int function(int row,int col,List<List<Integer>> triangle,Integer[][] dp){
        if(row == triangle.size()){
            return 0;
        }
        if(dp[row][col] != null) return dp[row][col];
        int st = function(row+1,col,triangle,dp);
        int rn = function(row+1,col+1,triangle,dp);
        return dp[row][col]=triangle.get(row).get(col) + 
        Math.min(st,rn);
    }
}