class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] freq = new int[51];
        int n = nums.length;//2
        if (k == n) {
            int answer = 0;

            for (int x : nums) {
                answer = Math.max(answer, x);
            }

            return answer;
        }
        for(int ind = 0;(ind+k-1) < n;ind++){
            for(int st = ind;st < (ind +k) && st < n;st++){
                freq[nums[st]]++;
            }
        }
        System.out.print(Arrays.toString(freq));
        int max = -1;
        for(int ind = 0;ind < 51;ind++){
            if(freq[ind] == 1){
                max = Math.max(max,ind);
            }
        }
        return max;
    }
}