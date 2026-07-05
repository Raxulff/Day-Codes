class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        //      | |
        //      k,v  [k->key,val];
        int sum = 0;
        int count = 0;
        for(int val : nums){
            sum+=val;
            int key = sum - k;
            if(map.containsKey(key)){
                count+=map.get(key);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}