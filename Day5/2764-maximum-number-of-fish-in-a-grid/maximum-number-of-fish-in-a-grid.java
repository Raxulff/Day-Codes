class Solution {
    public int findMaxFish(int[][] grid) {
        int R = grid.length;
        int C = grid[0].length;
        int max = 0;
        boolean[][] vis = new boolean[R][C];
        for(int row=  0;row < R;row++){
            for(int col = 0;col < C;col++){
                if(grid[row][col] != 0 && vis[row][col] == false){
                    max = Math.max(max,dfs(row,col,grid,R,C,vis));
                }
            }
        }
        return max;
    }
    public static int dfs(int row,int col,int[][] grid,int R,int C,boolean[][] vis){
        if(row < 0 || row == R || col < 0 || col == C || grid[row][col] == 0 || vis[row][col]) return 0;
        vis[row][col] = true;
        return grid[row][col] +
        dfs(row+1,col,grid,R,C,vis)+
        dfs(row,col-1,grid,R,C,vis)+
        dfs(row-1,col,grid,R,C,vis)+
        dfs(row,col+1,grid,R,C,vis);
    
    }
}