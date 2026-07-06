class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int val : nums){
            set.add(val);
        }
        int ans = 0;
        for(int itr = 1;itr <= 100001;itr++){
            if(!set.contains(itr)){
                ans = itr;
                break;
            }
        }
        return ans;
    }
}