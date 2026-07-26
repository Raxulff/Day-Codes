class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        
        int prev2 = nums[0];
        int prev1 = Math.max(nums[0],nums[1]);
        int curr = 0;
        int max = Integer.MIN_VALUE;
        for(int ind = 2;ind < n-1;ind++){
            curr = Math.max(prev1,nums[ind]+prev2);
            prev2 = prev1;
            prev1 = curr;
        }
        max = Math.max(max,prev1);

        if(n >= 3){
            prev2 = nums[1];
            prev1 = Math.max(nums[1],nums[2]);
            for(int ind = 3;ind < n;ind++){
                curr = Math.max(prev1,nums[ind]+prev2);
                prev2 = prev1;
                prev1 = curr;
            }
        }
        return max = Math.max(max,prev1);
    }
}
