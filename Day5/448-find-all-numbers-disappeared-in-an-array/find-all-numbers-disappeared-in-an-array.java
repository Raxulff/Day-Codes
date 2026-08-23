class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        boolean[] vis = new boolean[nums.length+1];
        for(int ind = 0;ind < nums.length;ind++){
            vis[nums[ind]] = true;
        }
        for(int ind = 1;ind < vis.length;ind++){
            if(!vis[ind]){
                list.add(ind);
            }
        }
        return list;
    }
}