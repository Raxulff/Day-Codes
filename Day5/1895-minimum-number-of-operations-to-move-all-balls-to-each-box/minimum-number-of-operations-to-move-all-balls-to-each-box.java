class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ans = new int[n];
        for(int ind = 0;ind < n;ind++){
            char curr = boxes.charAt(ind);
            int right = ind-1;
            int left = ind+1;
            int sum = 0;
            while(right >= 0){
                char rightChar = boxes.charAt(right);
                if(rightChar == '1'){
                    sum = sum + Math.abs(ind-right);
                }
                right--;
            }
            while(left < n){
                char leftChar = boxes.charAt(left);
                if(leftChar == '1'){
                    sum = sum + Math.abs(ind-left);
                }
                left++;
            }
            ans[ind] = sum;
        }
        return ans;
    }
}