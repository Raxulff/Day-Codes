class Solution {
    static int max = 0;
    public int maxAreaOfIsland(int[][] grid) {
        //int max = 0;
        int R = grid.length;
        int C = grid[0].length;
    int t=0;
        for(int row = 0;row < R;row++){
            for(int col = 0;col < C;col++){
                if(grid[row][col] == 1){
                    t=Math.max(t,dfs(row,col,grid,R,C,1));
                }
            }
        }
       
        return t;
    }
    public static int dfs(int row,int col,int[][] grid,int R,int C,int count){
        if(row < 0 || row == R || col < 0 || col == C || grid[row][col] != 1) return 0;
        grid[row][col]=2;
        return 1 + dfs(row+1,col,grid,R,C,count)+dfs(row-1,col,grid,R,C,count)+dfs(row,col+1,grid,R,C,count)+dfs(row,col-1,grid,R,C,count);
        
    }
}