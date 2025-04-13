class Solution {
    private static final int MOD = 1000000007;

    public int countGoodNumbers(long n) {
        long evenCount = (n + 1) / 2;  // even indices
        long oddCount = n / 2;         // odd indices

        long evenWays = modPow(5, evenCount);
        long oddWays = modPow(4, oddCount);

        return (int)((evenWays * oddWays) % MOD);
    }

    // Modular exponentiation: calculates (base^exp) % MOD
    private long modPow(long base, long exp) {
        long result = 1;
        base %= MOD;

        while (exp > 0) {
            if ((exp & 1) == 1) {         // if exponent is odd
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;   // square the base
            exp >>= 1;                    // divide exponent by 2
        }

        return result;
    }
}
