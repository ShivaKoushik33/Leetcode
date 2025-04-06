class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int k = climbStairsHelper(n,dp);
        return k;
    }
    public int climbStairsHelper(int n, int[] dp){
        if(n <= 1) return 1;
        if(dp[n] != -1) return dp[n];
        dp[n] = climbStairsHelper(n-1,dp) + 
                climbStairsHelper(n-2,dp);
        return dp[n];
    }
}
