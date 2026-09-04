class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int ind1 = 0;ind1 < nums.length;ind1++){
            for(int ind2 = ind1+1;ind2 < nums.length;ind2++){
                if(nums[ind1] == nums[ind2]) count++;
            }
        }
        return count;
    }
}