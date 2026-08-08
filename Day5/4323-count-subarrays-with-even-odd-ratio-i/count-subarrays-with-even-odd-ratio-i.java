class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        
        int n = nums.length;
        int count = 0;
        for(int ind1 = 0;ind1 < n;ind1++){
            int x = 0;
            int y = 0;
            for(int ind2 = ind1;ind2 < n;ind2++){

                if((nums[ind2]&1) == 0){
                    x++;
                }else{
                    y++;
                }
                if(y>0 && ((double)x/(double)y <= (double)a/(double)b) ){
                    count++;
                }
            }
        }
        return count;
    }
}