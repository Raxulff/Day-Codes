class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(char[] temp : board){
            Arrays.fill(temp,'.');
        }
        int count = 0;
        List<List<String>> ans = new ArrayList<>();
        solve(0,n,count,board,ans);
        return ans;
    }
    public static void solve(int row,int n,int count,char[][] board,List<List<String>> ans){
        if(row == n){
            count++;
            List<String> t = new ArrayList<>();
            for(char[] temp : board){
                //ans.add(new ArrayList<>(new String(temp)));
                
                t.add(new String(temp));
                
            }
            ans.add(t);
            return;
        }
        for(int col = 0;col < n;col++){
            boolean valid = true;
            for(int i = row-1;i>=0;i--){
                if(board[i][col] == 'Q'){
                    valid = false;
                    break;
                }
            }
            for(int i = row-1,j = col-1;i >=0 && j>=0;i--,j--){
                if(board[i][j] == 'Q'){
                    valid = false;
                    break;
                }
            }
            for(int i = row-1,j = col+1;i>=0 && j < n;i--,j++){
                if(board[i][j] == 'Q'){
                    valid = false;
                    break;
                }
            }
            if(valid){
                board[row][col] = 'Q';
                solve(row+1,n,count,board,ans);
                board[row][col] = '.';
            }
        }
    }
}