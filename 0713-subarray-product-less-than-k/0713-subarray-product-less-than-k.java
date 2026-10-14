class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        int count=0;
        int left=0;
        int pro=1;
        for(int r=0;r<nums.length;r++){
            pro*=nums[r];
            while(pro>=k){
                pro/=nums[left];
                left++;
            }
            count+=r-left+1;
        }
        return count;
    }
}