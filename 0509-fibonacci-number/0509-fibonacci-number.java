class Solution {
    public int fib(int n) {
        //Tabulation - Bottom Up approach
        //Tc-O(n) withing using extra array
        
        if(n<=1){
            return n;
        }

        int prev1=1;
        int prev2=0;
        int ans=0;
        for(int state=2;state<=n;state++){
            ans=prev1+prev2;
            prev2=prev1;
            prev1=ans;
        }
        return ans;
    }
}