class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int R = 0;
        int L = 0;

        for(int ind = 0;ind < s.length();ind++){
            if(s.charAt(ind) == 'R'){
                R++;
            }else{
                L++;
            }
            if(R == L) count++;
        }
        return count;
    }
}