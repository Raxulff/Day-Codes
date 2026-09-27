class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int val : nums){
            set.add(val);
        }
        return nums.length != set.size();
    }
}