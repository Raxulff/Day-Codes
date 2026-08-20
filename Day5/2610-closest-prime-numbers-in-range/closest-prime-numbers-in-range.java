class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] arr = new boolean[right+1];
        int sq = (int) Math.sqrt(right);
        for(int itr = 2;itr<=sq;itr++){
            if(!arr[itr]){
                for(int st = itr*itr;st<=right;st = st+itr){
                    arr[st] = true;
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int st = (left == 1) ? 2 : left;st<=right;st++){
            if(!arr[st]){
                list.add(st);
            }
        }
        if(list.size() == 1) return new int[]{-1,-1};
        int min = Integer.MAX_VALUE;
        int[] res = {-1,-1};
        int n = list.size();
        for(int ind = 0;ind < n-1;ind++){
            if(list.get(ind+1) - list.get(ind) < min){
                res[0] = list.get(ind);
                res[1] = list.get(ind+1);
                min = list.get(ind+1) - list.get(ind);
            }
        }
        return res;
        
    }
}