class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=firstElement(nums,target);
        int last=lastElement(nums,target);
        return new int[]{first,last};
    }

    private int firstElement(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int ans=-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                ans=mid;
                right=mid-1;
            }
            else if(target>nums[mid]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return ans;
    }

    private int lastElement(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int ans=-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                ans=mid;
                left=mid+1;
            }
            else if(target>nums[mid]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return ans;
    }
}