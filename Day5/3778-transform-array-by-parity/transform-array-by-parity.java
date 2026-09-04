class Solution {
    public int[] transformArray(int[] nums) {
        int even = 0;
        int odd = 0;
        for(int val : nums){
            if(val%2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.print(even+" "+odd);
        int[] res = new int[even + odd];
        for(int ind = 0;ind < even;ind++){
            res[ind] = 0;
        }
        for(int ind = even;ind < (even+odd);ind++){
            res[ind] = 1;
        }
        return res;
    }
}