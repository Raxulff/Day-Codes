class Solution {

    public int numDecodings(String s) {

        int n = s.length();
        if (s.charAt(0) == '0')
    return 0;
        int prev2 = 1;   // Empty string
        int prev1 = 1; 
        int curr = 0;
          // First character is already checked
        for (int i = 2; i <= n; i++) {
            curr = 0;
            // One digit
            if (s.charAt(i - 1) != '0')
                curr = curr +  prev1;

            // Two digits
            int num = (s.charAt(i - 2) - '0') * 10
                    + (s.charAt(i - 1) - '0');

            if (num >= 10 && num <= 26)
                curr+= prev2;

            prev2 = prev1;
            prev1 = curr;
            
        }
        return prev1;
    }
}