class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        long sum = 0;
        long prev = 0;
        for (int ind = 0; ind < n; ind++) {
            sum = sum + nums[ind];
            prev = prev + ((long) ind * nums[ind]);
        }
        long ans = prev;
        for (int ind = n - 1; ind >= 1; ind--) {
            prev = prev + sum - n * (long) nums[ind];
            ans = Math.max(ans, prev);
        }
        return (int) ans;
    }
}