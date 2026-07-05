class Solution {
    public int pivotIndex(int[] nums) {
        int leftToRightSum = 0;
        int rightToLeftSum = 0;
        int n = nums.length;
        int[] leftToRight = new int[n];
        int[] rightToLeft = new int[n];
        for(int ind = 0;ind < n;ind++){
            leftToRightSum+=nums[ind];
            leftToRight[ind] = leftToRightSum;
            rightToLeftSum+=nums[n-ind-1];
            rightToLeft[n-ind-1] = rightToLeftSum;
        }

        for(int ind = 0;ind < n;ind++){
            int leftToRightVal = (ind == 0) ? 0 : leftToRight[ind-1];
            int rightToLeftVal = (ind == n-1) ? 0 : rightToLeft[ind+1];
            if(leftToRightVal == rightToLeftVal){
                return ind;
            }
        }
        return -1;
        
    }
}