class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int fixed = 0;
        int goesRight = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        //List<Integer> ans = new ArrayList<>();
        int ans = Integer.MIN_VALUE;
        while(fixed < nums.length && goesRight < nums.length){
            map.put(nums[goesRight],map.getOrDefault(nums[goesRight],0)+1);
            //ans = Math.max(ans,(goesRight-fixed+1));
            while(map.get(nums[goesRight]) > k){
                map.put(nums[fixed],map.get(nums[fixed])-1);
                fixed++;
            }
            ans = Math.max(ans,(goesRight-fixed));
            goesRight++;
            
        }
        return ans+1;
    }
}
