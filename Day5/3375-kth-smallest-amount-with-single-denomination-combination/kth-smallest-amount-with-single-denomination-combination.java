class Solution {
    public long findKthSmallest(int[] coins, int k) {
        long lo = 1;
        long hi = (long) getMin(coins) * k;

        while (lo < hi) {
            long mid = lo + (hi - lo) / 2;
            if (countUpTo(coins, mid) >= k) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
    private long countUpTo(int[] coins, long limit) {
        int n = coins.length;
        long count = 0;

        for (int mask = 1; mask < (1 << n); mask++) {
            long lcm = 1;
            boolean overflow = false;

            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    lcm = lcm(lcm, coins[i]);
                    if (lcm > limit) {
                        overflow = true;
                        break;
                    }
                }
            }
            if (overflow) continue;

            int bits = Integer.bitCount(mask);
            long term = limit / lcm;
            count += (bits % 2 == 1) ? term : -term;
        }
        return count;
    }

    private int getMin(int[] coins) {
        int min = coins[0];
        for (int c : coins) {
            if (c < min) min = c;
        }
        return min;
    }
    private long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
}