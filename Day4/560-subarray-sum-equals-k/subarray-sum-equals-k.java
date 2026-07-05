class Solution {
    public int subarraySum(int[] nums, int k) {
        int subArrayCount = 0;
        for(int ind1 = 0;ind1 < nums.length;ind1++){
            int sum = 0;
            for(int ind2 = ind1;ind2 < nums.length;ind2++){
                sum = sum + nums[ind2];
                if(sum == k){
                    subArrayCount++;
                }
                
            }
        }
        return subArrayCount++;
    }
}