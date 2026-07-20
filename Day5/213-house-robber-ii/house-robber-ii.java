class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];

        int[] arr1 = new int[n - 1];
        int[] arr2 = new int[n - 1];

        for (int ind = 1; ind < n; ind++) {
            arr1[ind - 1] = nums[ind];
        }
        for (int ind = 0; ind < n - 1; ind++) {
            arr2[ind] = nums[ind];
        }

        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        return Math.max(function1(dp1, 0, arr1), function1(dp2, 0, arr2));

    }

    public static int function1(int[] dp, int ind, int[] nums) {
        // 1-> base case
        if (ind >= nums.length)
            return 0;

        //2-> check already exist
        if (dp[ind] != -1)
            return dp[ind];

        //3-> logic
        int pick = nums[ind] + function1(dp, ind + 2, nums);
        int notPick = 0 + function1(dp, ind + 1, nums);

        //4-> update the dp
        dp[ind] = Math.max(pick, notPick);
        return dp[ind];
    }
}
