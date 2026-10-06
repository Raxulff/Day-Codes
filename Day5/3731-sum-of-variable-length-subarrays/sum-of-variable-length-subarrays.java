class Solution {
    public int subarraySum(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n+1];
        prefix[1] = nums[0];
        
        for(int ind = 1;ind < n;ind++){
            prefix[ind+1] = prefix[ind] + nums[ind];
        }
        for(int val : prefix){
            System.out.print(val+" ");
        }
        int sum = 0;
        for(int ind = 0;ind < n;ind++){
            int st = ind+1;
            int end = Math.max(0,ind-nums[ind]);
            sum = sum + (prefix[st]-prefix[end]);
            //System.out.print(sum+" ");
        }
        return sum;
    }
}