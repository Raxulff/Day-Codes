class Solution {
    public String longestPrefix(String s) {
        int len = 0;
        int ind = 1;
        int n = s.length();
        int[] lps = new int[n];
        while(ind < n){
            if(s.charAt(ind) == s.charAt(len)){
                lps[ind++] = ++len;
            }else if(len > 0){
                len = lps[len-1];
            }else{
                lps[ind++] = 0;
            }
        }

        return s.substring(0,lps[n-1]);
    }
}