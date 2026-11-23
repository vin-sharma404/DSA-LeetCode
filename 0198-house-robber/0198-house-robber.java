class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp= new int[n+1];
        Arrays.fill(dp,-1);
        return memo(n-1,dp,nums);
    }
    public int memo(int n, int[] dp, int[] nums){
        if(n==0){
            dp[0]=nums[0];
            return dp[0];
        }
        if(n==-1){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }

        dp[n] = Math.max((nums[n] + memo(n-2,dp,nums)), 0+memo(n-1,dp,nums));
        return dp[n];
    }
}