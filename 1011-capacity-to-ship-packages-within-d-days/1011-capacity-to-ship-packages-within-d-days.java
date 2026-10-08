class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int weight:weights){
            low=Math.max(low,weight);
            high+=weight;
        }
        int ans=0;
        while(low<=high){
            int cap=low+(high-low)/2;
            if(canShip(weights,days,cap)){
                ans=cap;
                high=cap-1;
            }
            else{
                low=cap+1;
            }
        }
        return ans;
    }

    private boolean canShip(int[] weights,int days,int cap){
        int day=1;
        int sum=0;
        for(int weight:weights){
            sum+=weight;
            if(sum>cap){
                day++;
                sum=weight;
            }
        }
        if(day<=days){
            return true;
        }
        return false;
    }
}