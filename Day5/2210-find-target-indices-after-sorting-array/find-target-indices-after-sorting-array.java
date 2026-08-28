class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int ind = 0;ind < nums.length;ind++){
            if(nums[ind] > target) break;
            if(nums[ind] == target) ans.add(ind);
        }
        return ans;
    }
}