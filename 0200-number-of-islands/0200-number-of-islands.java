class Solution {
    int rows;
    int cols;
    public int numIslands(char[][] grid) {
        rows=grid.length;
        cols=grid[0].length;
        int islands=0;
        boolean[][] visited = new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    dfs(i,j,grid,visited);
                    islands++;
                }
            }
        }
        return islands;
    }
    public void dfs(int i,int j, char[][] grid, boolean[][] visited){
        if(i<0 || i>=rows || j<0 || j>=cols || grid[i][j] == '0' || visited[i][j]){
            return;
        }
        int adj[][]={
            {i-1,j},
            {i,j+1},
            {i+1,j},
            {i,j-1}
        };
        visited[i][j]=true;
        for(int[] neighbour : adj){
            dfs(neighbour[0],neighbour[1],grid,visited);
        }
    }
}