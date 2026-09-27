class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int ind = 0;ind < nums.length;ind++){
            if(!map.containsKey(nums[ind])){
                map.put(target-nums[ind],ind);
            }else{
                return new int[]{map.get(nums[ind]),ind};
            }
        }
        return new int[]{-1,-1};
    }
}