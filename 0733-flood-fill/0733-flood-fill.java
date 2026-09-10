class Solution {
    int rows;
    int cols;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        rows=image.length;
        cols=image[0].length;
        int original=image[sr][sc];
        if(original==color){
            return image;
        }
        dfs(image,sr,sc,color,original);
        return image;
    }
    public void dfs(int[][] image, int i, int j, int color,int original){
        if( i<0 || i>=rows || j<0 || j>=cols || image[i][j]!=original){
            return;
        }
        int[][] adj={
            {i-1,j},
            {i,j+1},
            {i+1,j},
            {i,j-1}
        };
        image[i][j]=color;
        for(int[] neighbour: adj){
            dfs(image,neighbour[0],neighbour[1],color,original);
        }
    }
}