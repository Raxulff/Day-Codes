class Solution {
    public int minOperations(String s) {
        int res = Integer.MAX_VALUE;
        int n = s.length();
        for(int shift = 0;shift < n;shift++){
            int opt = shift;
            for(int ind = 0;ind < n/2;ind++){
                int left = (ind + shift)%n;
                int right = (n - 1- ind + shift)%n;
                int a = s.charAt(left) - 'a';
                int b = s.charAt(right) - 'a';
                int aToB = (b - a + 26) % 26;
                int bToA = (a - b + 26) % 26;
                opt += Math.min(aToB, bToA);
            }
            res = Math.min(res,opt);
        }
        return res;
    }
}