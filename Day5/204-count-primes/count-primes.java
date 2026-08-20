class Solution {
    public int countPrimes(int n) {
        boolean[] arr = new boolean[n+1];
        int sq = (int) Math.sqrt(n);
        for(int itr = 2;itr <= sq;itr++){
            if(!arr[itr]){
                for(int st = itr*itr;st <= n;st = st+itr){
                    arr[st] = true;
                }
            }
        }
        int count = 0;
        for(int st = 2;st < n;st++){
            if(!arr[st]){
                count++;
            }
        }
    return count;
    }
}