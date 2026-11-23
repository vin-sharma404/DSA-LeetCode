class Solution {
    public int minCostClimbingStairs(int[] cost) {
        //Tabulation - without using dp array;
        int n=cost.length;
        int prev1=0;
        int prev2=0;
        int ans=0;
        for(int state=2;state<=n;state++){
            int oneStep= cost[state-1] + prev1;
            int twoStep=cost[state-2]+ prev2;
            ans=Math.min(oneStep,twoStep);
            prev2=prev1;
            prev1=ans;
        }
        return ans;

    }
}