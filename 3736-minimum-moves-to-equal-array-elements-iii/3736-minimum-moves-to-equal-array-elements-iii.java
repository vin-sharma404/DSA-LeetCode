class Solution {
    public int minMoves(int[] nums) {
        int max=0;
        for(int num:nums){
            max=Math.max(max,num);
        }
        int moves=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=max){
                nums[i]++;
                moves++;
                i--;
            }
        }
        return moves;
    }
}