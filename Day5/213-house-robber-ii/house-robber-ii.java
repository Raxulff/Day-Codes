class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        
        Integer[] dp1 = new Integer[n];
        Integer[] dp2 = new Integer[n];

        dp1[0] = nums[0];
        dp1[1] = Math.max(nums[0],nums[1]);
        if(n == 2)
            return Math.max(dp1[0],dp1[1]);
        int max = Integer.MIN_VALUE;
        for(int ind = 2;ind < n-1;ind++){
            dp1[ind] = Math.max(dp1[ind-1],nums[ind]+dp1[ind-2]);
        }
        max = Math.max(max,dp1[n-2]);

        if(n >= 3){
            dp2[1] = nums[1];
            dp2[2] = Math.max(nums[1],nums[2]);
            for(int ind = 3;ind < n;ind++){
                dp2[ind] = Math.max(dp2[ind-1],nums[ind]+dp2[ind-2]);
            }
            return max = Math.max(max,dp2[n-1]);
        }
        return max;
    }
}
