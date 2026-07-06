class Solution {
    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int curr = 0;
        for(int ind = 1;ind < nums.length;ind++){
            if(nums[curr] == nums[ind]){
                continue;
            }else{
                ++curr;
                nums[curr] = nums[ind];
            }
        }
        return curr+1;
    }
}