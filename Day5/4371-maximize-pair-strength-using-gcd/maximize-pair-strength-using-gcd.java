class Solution {
    public long maxPairStrength(int[] nums) {
        
        long max = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 0;i < n;i++){
            for(int j = i + 1;j < n;j++){
                long first = nums[i];
                long second = nums[j];
                long numerator = (first*second);
                long a = first;
                long b = second;
                while(b!= 0){
                    long temp = b;
                    b = a%b;
                    a = temp;
                }
                max = Math.max(max,numerator/(a*a));
            }
        }
        
        return max;

    }
}