class Solution {
    public long findKthSmallest(int[] coins, int k) {
        int n = coins.length;
        long hi = (long) getMin(coins) * k;

        // Precompute LCM + sign for every valid non-empty subset ONCE
        long[] lcmArr = new long[1 << n];
        int[] signArr = new int[1 << n];
        int validCount = 0;

        for (int mask = 1; mask < (1 << n); mask++) {
            long lcm = 1;
            boolean overflow = false;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    lcm = lcm(lcm, coins[i]);
                    if (lcm > hi) { overflow = true; break; }
                }
            }
            if (overflow) continue; // this subset can never contribute, skip permanently

            lcmArr[validCount] = lcm;
            signArr[validCount] = (Integer.bitCount(mask) % 2 == 1) ? 1 : -1;
            validCount++;
        }

        // Binary search now just sums cached terms — no gcd/lcm work at all
        long lo = 1;
        while (lo < hi) {
            long mid = lo + (hi - lo) / 2;
            long count = 0;
            for (int i = 0; i < validCount; i++) {
                count += signArr[i] * (mid / lcmArr[i]);
            }
            if (count >= k) hi = mid; else lo = mid + 1;
        }
        return lo;
    }

    private int getMin(int[] coins) {
        int min = coins[0];
        for (int c : coins) if (c < min) min = c;
        return min;
    }

    private long gcd(long a, long b) { return b == 0 ? a : gcd(b, a % b); }
    private long lcm(long a, long b) { return a / gcd(a, b) * b; }
}