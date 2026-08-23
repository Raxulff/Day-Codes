class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        boolean[] vis = new boolean[nums.length+1];
        for(int n : nums){
            vis[n] = true;
        }
        for(int ind = 1;ind < vis.length;ind++){
            if(!vis[ind]){
                list.add(ind);
            }
        }
        return list;
    }
}