class Solution {
    public int pivotIndex(int[] nums) {
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
            int leftEd = 0;
            int rightEd = 0;
            if(ind != 0){
                leftEd = prefix[ind-1];
            }
            if(ind != n-1){
                rightEd = suffix[ind+1];
            }
            if(leftEd == rightEd) return ind;
        }
        return -1;
    }
}