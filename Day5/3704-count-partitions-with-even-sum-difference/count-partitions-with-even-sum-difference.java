class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = nums[0];
        suffix[n-1] = nums[n-1];

        for(int ind =1;ind<n;ind++){
            prefix[ind] = prefix[ind-1] + nums[ind];
        }
        for(int ind = n-2;ind >=0;ind--){
            suffix[ind] = suffix[ind+1]+nums[ind];
        }
        
        int count =0;
        for(int ind = 0;ind < n-1;ind++){
            if((prefix[ind] - suffix[ind+1])%2 == 0){
                count++;
            }
        }
        return count;
    }
}