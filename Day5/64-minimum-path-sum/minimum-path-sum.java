class Solution {
    public int minPathSum(int[][] grid) {
        int R = grid.length;
        int C = grid[0].length;
        Integer[][] dp = new Integer[R][C];
        return solve(0,0,R,C,grid,dp);
    }
    public static int solve(int row,int col,int R,int C,int[][] grid,Integer[][] dp){
        if(row >= R || col >= C)
            return (int) 1e9;
        if(row == R-1 && col == C-1)
            return grid[row][col];
        if(dp[row][col] != null)
            return dp[row][col];
        int down = solve(row+1,col,R,C,grid,dp);
        int downRight = solve(row,col+1,R,C,grid,dp);
        return dp[row][col] = grid[row][col] + Math.min(down,downRight);
    }
}