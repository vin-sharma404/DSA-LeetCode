class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length; //rows
        int n=matrix[0].length; //cols
        int top=0;
        int bottom=m-1;
        int validRow=-1;
        while(top<=bottom){
            int mid=(top+bottom)/2;
            if(target>=matrix[mid][0] && target<=matrix[mid][n-1]){
                validRow=mid;
                break;
            }
            else if(target<=matrix[mid][0]){
                bottom=mid-1;
            }
            else{
                top=mid+1;
            }
        }
        if(validRow==-1){
            return false;
        }
        int left=0; 
        int right=n-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(matrix[validRow][mid]==target){
                return true;
            }
            else if(matrix[validRow][mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return false;
    }
}