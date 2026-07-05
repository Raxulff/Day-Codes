class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];
        int n = nums.length;
        for(int ind = 1;ind < n;ind++){
            if(nums[ind] < 0){
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(nums[ind],nums[ind]*max);
            min = Math.min(nums[ind],nums[ind]*min);

            result = Math.max(result,max);
        }
        return result;
    }
}