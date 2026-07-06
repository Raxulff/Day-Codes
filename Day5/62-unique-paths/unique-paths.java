class Solution {
    public int uniquePaths(int m, int n) {
        int grid[][] = new int[m][n];

        for(int[] temp : grid){
            Arrays.fill(temp,-1);
        }
        int way = function(grid,0,0,m,n,grid);
        return way;
    }
    public static int function(int[][] grid,int row,int col,int rowEnd,int colEnd,int[][] dp){
        
        if(row >= rowEnd || col >= colEnd){
            return 0;
        }
        if(row == grid.length -1 && col == grid[0].length -1){
            return 1;
        }
        if(dp[row][col] != -1) return dp[row][col];
        int down = function(grid,row+1,col,rowEnd,colEnd,dp);
        int right = function(grid,row,col+1,rowEnd,colEnd,dp);

        return dp[row][col] = down + right;
    }
}