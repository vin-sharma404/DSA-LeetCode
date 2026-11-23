class Solution {
    public int rob(int[] nums) {
        //Memoization with Shifting logic to store negative index in dp array
        int n=nums.length;
        int[] dp= new int[n+1];
        Arrays.fill(dp,-1);
        return memo(n,dp,nums);
    }
    public int memo(int n, int[] dp, int[] nums){
        if(n==1){
            dp[1]=nums[0];
            return dp[1];
        }
        if(n==0){
            dp[0]=0;
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int pick= nums[n-1] + memo(n-2,dp,nums);
        int noPick= 0 + memo(n-1,dp,nums);
        dp[n] = Math.max(pick,noPick);
        return dp[n];
    }
}