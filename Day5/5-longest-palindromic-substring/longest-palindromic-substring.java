class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int[][] memo = new int[n][n];
        int startIndex = 0;
        int maxLength = 0;
        for(int ind1 = 0;ind1 < n;ind1++){
            for(int ind2 = ind1;ind2 < n;ind2++){
                if(isPalindrome(s,ind1,ind2,memo)){
                    if(maxLength < ind2 - ind1 + 1){
                        maxLength = ind2 - ind1  + 1;
                        startIndex = ind1;
                    }
                }
            }
        }
        return s.substring(startIndex,startIndex + maxLength);
    }
    public static boolean isPalindrome(String s,int st,int end,int[][] memo){

        // base case
        if(st >= end) return true;
        //check already exits
        if(memo[st][end] != 0) return memo[st][end] == 1;

        boolean match = (s.charAt(st) == s.charAt(end)) && (isPalindrome(s,st+1,end-1,memo));

        memo[st][end] = match ? 1 : 2;
        
        return match;
    }
}