class Solution {
    public int countPairs(List<Integer> list, int target) {
        Collections.sort(list);
        int left = 0;
        int n = list.size();
        int cnt = 0;
        for(int ind1 = 0;ind1 < n;ind1++){
            for(int ind2 = ind1+1;ind2< n;ind2++){
                if(list.get(ind1) + list.get(ind2) < target){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}