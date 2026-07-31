class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        Integer[][] dp = new Integer[triangle.size()][triangle.size()];
        int R = triangle.size();
        int C = triangle.size();

        for(int col = 0;col < triangle.size();col++){
            dp[R-1][col] = triangle.get(R-1).get(col);
        }

        for(int row = R-2;row >=0;row--){
            for(int col = 0;col <= row;col++){
                int down = dp[row+1][col];
                int downRight = dp[row+1][col+1];
                dp[row][col] = triangle.get(row).get(col) + Math.min(down,downRight); 
            }
        }
        return dp[0][0];
    }
}