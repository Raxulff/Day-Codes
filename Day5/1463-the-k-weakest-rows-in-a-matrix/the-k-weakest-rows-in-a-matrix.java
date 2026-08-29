class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        
        int R = mat.length;
        int C = mat[0].length;
        PriorityQueue<int[]> pq= new PriorityQueue<>((x,y)->(x[1] != y[1] ? Integer.compare(x[1],y[1]) : Integer.compare(x[0],y[0]) ) );
        for(int r = 0;r < R;r++){
            int cnt = 0;
            for(int c =0;c<C;c++){
                if(mat[r][c] == 1){
                    cnt++;
                }
            }
            pq.add(new int[] {r,cnt});
        }
        int kCnt = 1;
        int[] ans = new int[k];
        int ind = 0;
        while(!pq.isEmpty() && kCnt <= k){
            int[] res = pq.poll();
            ans[ind] = res[0];
            ind++;
            kCnt++;
        }
        return ans;
    }
}