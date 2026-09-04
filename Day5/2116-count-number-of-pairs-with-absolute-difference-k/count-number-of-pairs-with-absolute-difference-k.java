class Solution {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        for(int ind1 = 0;ind1 < nums.length;ind1++){
            for(int ind2 = ind1+1;ind2 < nums.length;ind2++){
                if(Math.abs(nums[ind1]-nums[ind2]) == k) count++;
            }
        }
        return count;
    }
}