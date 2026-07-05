class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int result = 0;
        for(int val : nums){
            map.put(val,map.getOrDefault(val,0)+1);
            if(map.get(val) > 1){
                result = val;
                break;
            }
        }
        return result;
        
    }
}