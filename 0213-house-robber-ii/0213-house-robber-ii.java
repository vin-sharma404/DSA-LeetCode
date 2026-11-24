class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        
        int[] nums1= new int[n-1];
        int[] nums2 = new int[n-1];
        for(int i=0;i<n-1;i++){
            nums1[i]=nums[i+1];
            nums2[i]=nums[i];
        }
        return Math.max(HouseRobber(nums1),HouseRobber(nums2));
    }
    public int HouseRobber(int[] nums){
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int prev1=nums[0];
        int prev2=0;
        int ans=0;
        for(int state=2;state<n+1;state++){
            int pick=nums[state-1]+prev2;
            int noPick=0+prev1;
            ans=Math.max(pick,noPick);
            prev2=prev1;
            prev1=ans;
        }
        
        return ans;
    }
}