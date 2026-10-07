class Solution {
    static int count = 0;
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for(char[] t : board) Arrays.fill(t,'.');
        List<List<String>> ans = new ArrayList<>();
        solve(0,n,board,ans);
        int res = count;
        count = 0;
        return res;
    }
    public static void solve(int row,int n,char[][] board,List<List<String>> ans){
        if(row == n){
            count++;
            List<String> t = new ArrayList<>();
            for(char[] a : board) t.add(new String(a));
            ans.add(t);
            return;
        }
        for(int col = 0;col < n;col++){
            boolean valid = true;
            for(int r = row-1;r >= 0;r--){
                if(board[r][col] == 'Q'){
                    valid = false;
                    break;
                }
            }

            for(int r = row-1,c = col-1;r >= 0 && c >= 0;r--,c--){
                if(board[r][c] == 'Q'){
                    valid= false;
                    break;
                }
            }

            for(int r = row-1,c = col+1;r >= 0 && c < n;r--,c++){
                if(board[r][c] == 'Q'){
                    valid =false;
                    break;
                }
            }
            if(valid){
                board[row][col] = 'Q';
                solve(row+1,n,board,ans);
                board[row][col] = '.';
            }
        }
    }
}