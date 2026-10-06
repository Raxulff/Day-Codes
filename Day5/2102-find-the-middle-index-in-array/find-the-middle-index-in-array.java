class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = nums[0];
        suffix[n-1] = nums[n-1];

        for(int ind = 1;ind < n;ind++){
            prefix[ind] = prefix[ind-1] + nums[ind];
        }

        for(int ind = n-2;ind >= 0;ind--){
            suffix[ind] = suffix[ind+1] + nums[ind];
        }

        for(int ind = 0;ind < n;ind++){
            int left = 0;
            int right = 0;
            if(ind != 0){
                left = prefix[ind-1];
            }
            if(ind != n-1){
                right = suffix[ind+1];
            }
            if(left == right){
                return ind;
            }
        }
        return -1;
    }
}