import java.util.*;

class Solution {
    public int idealArrays(int n, int maxValue) {
        int MOD = 1_000_000_007;
        int maxLog = (int)(Math.log(maxValue) / Math.log(2)) + 1;
        int[][] dp = new int[maxLog + 1][maxValue + 1];

        for (int j = 1; j <= maxValue; j++) {
            dp[1][j] = 1;
        }

        for (int i = 2; i <= maxLog; i++) {
            for (int j = 1; j <= maxValue; j++) {
                for (int k = j * 2; k <= maxValue; k += j) {
                    dp[i][k] = (dp[i][k] + dp[i-1][j]) % MOD;
                }
            }
        }

        long[] factorial = new long[n + maxLog + 1];
        long[] inverse = new long[n + maxLog + 1];
        factorial[0] = 1;
        for (int i = 1; i < factorial.length; i++) {
            factorial[i] = factorial[i-1] * i % MOD;
        }
        inverse[factorial.length - 1] = pow(factorial[factorial.length - 1], MOD - 2, MOD);
        for (int i = factorial.length - 2; i >= 0; i--) {
            inverse[i] = inverse[i+1] * (i+1) % MOD;
        }

        long res = 0;
        for (int j = 1; j <= maxValue; j++) {
            for (int len = 1; len <= maxLog; len++) {
                if (dp[len][j] > 0) {
                    res = (res + dp[len][j] * comb(n-1, len-1, factorial, inverse, MOD)) % MOD;
                }
            }
        }

        return (int)res;
    }

    private long pow(long a, long b, int mod) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) res = res * a % mod;
            a = a * a % mod;
            b >>= 1;
        }
        return res;
    }

    private long comb(int n, int k, long[] fact, long[] inv, int mod) {
        if (n < k) return 0;
        return fact[n] * inv[k] % mod * inv[n-k] % mod;
    }
}
