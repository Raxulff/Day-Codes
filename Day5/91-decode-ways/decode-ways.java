class Solution {

    public int numDecodings(String s) {

        int n = s.length();

        if (s.charAt(0) == '0')
            return 0;

        int[] dp = new int[n + 1];

        dp[0] = 1;   // Empty string
        dp[1] = 1;   // First character is already checked

        for (int i = 2; i <= n; i++) {

            // One digit
            if (s.charAt(i - 1) != '0')
                dp[i] = dp[i - 1];

            // Two digits
            int num = (s.charAt(i - 2) - '0') * 10
                    + (s.charAt(i - 1) - '0');

            if (num >= 10 && num <= 26)
                dp[i] += dp[i - 2];
        }

        return dp[n];
    }
}