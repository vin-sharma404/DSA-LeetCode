class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int sum=0;
            while(nums[i]>0){
                int digit=nums[i]%10;
                nums[i]=nums[i]/10;
                sum+=digit;
            }
            if(i==sum){
                return i;
            }   
        }
         return -1;
    }
}