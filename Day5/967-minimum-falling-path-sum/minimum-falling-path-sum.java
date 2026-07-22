class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        int R = matrix.length;
        int C = matrix[0].length;

        Integer[][] dp = new Integer[R][C];
        for(int col =0;col < C;col++){
            min = Math.min(min,func(0,col,matrix,dp));
        }
        return min;
    }
    public static int func(int row,int col,int[][] mat,Integer[][] dp){
        if(col >= mat[0].length || col < 0)
            return Integer.MAX_VALUE;
        if(row == mat.length)
            return 0;
        if(dp[row][col] != null) return dp[row][col];
        int left = func(row+1,col-1,mat,dp);
        int midl = func(row+1,col,mat,dp);
        int rigt = func(row+1,col+1,mat,dp);

        return dp[row][col] = mat[row][col] + Math.min(left,Math.min(midl,rigt));
    }
}