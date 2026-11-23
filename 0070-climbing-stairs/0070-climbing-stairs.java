class Solution {
    public int climbStairs(int n) {
        //Memoization
        //TC-o(n) SC-O(N)+O(N) 
        int[] dp =new int[n+1];
        Arrays.fill(dp,-1);
        return memo(dp,n);
    }
    public int memo(int[] dp, int n){
        if(n<=2){
            dp[n]=n;
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]= memo(dp,n-1) + memo(dp,n-2);
        return dp[n];
    }
}