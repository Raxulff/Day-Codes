class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for(int ind = 0;ind < nums.length-1;ind++){
            int left = ind+1;
            int right = nums.length-1;

            while(left < right){
                if(nums[left]-nums[ind] == diff &&nums[right] -nums[left] == diff){
                    count++;
                    left++;
                }
                else if(nums[left] - nums[ind] < diff){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return count;
    }
}