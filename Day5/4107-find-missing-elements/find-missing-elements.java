class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int low = nums[0];
        int high = nums[0];
        for(int val : nums){
            low= Math.min(low,val);
            high = Math.max(high,val);
        }
        boolean[] vis = new boolean[high+1];
        for(int val : nums){
            vis[val] = true;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int ind = low;ind <= high;ind++){
            if(!vis[ind]) ans.add(ind);
        }
        return ans;
    }
}