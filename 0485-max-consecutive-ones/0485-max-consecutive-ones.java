class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount=0;
        int currCount=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                currCount++;
            }
            else{
                maxCount=Math.max(maxCount,currCount);
                currCount=0;
            }
        }
        return Math.max(maxCount,currCount);
    }
}