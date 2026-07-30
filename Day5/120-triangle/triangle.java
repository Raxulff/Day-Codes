class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        Integer[][] dp = new Integer[triangle.size()][triangle.size()];
        return solve(triangle,0,0,dp);
    }
    public static int solve(List<List<Integer>> tri,int row,int col,Integer[][] dp){

        if(row == tri.size())
            return 0;

        if(dp[row][col] != null)
            return dp[row][col];

        int down = solve(tri,row+1,col,dp);
        int downRight = solve(tri,row+1,col+1,dp);
        return dp[row][col] = tri.get(row).get(col) + Math.min(down,downRight);
        
    }
}