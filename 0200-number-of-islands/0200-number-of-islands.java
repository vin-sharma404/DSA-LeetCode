class Solution {
    int rows;
    int cols;

    public int numIslands(char[][] grid) {
        rows = grid.length;
        cols = grid[0].length;

        int islands = 0;
        boolean[][] visited = new boolean[rows][cols];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {

                if(grid[i][j] == '1' && !visited[i][j]) {
                    bfs(i, j, grid, visited);
                    islands++;
                }
            }
        }

        return islands;
    }

    public void bfs(int row, int col, char[][] grid, boolean[][] visited) {

        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{row, col});
        visited[row][col] = true;

        int[][] directions = {
            {-1, 0},
            {0, 1},
            {1, 0},
            {0, -1}
        };

        while(!q.isEmpty()) {

            int[] current = q.poll();

            int currRow = current[0];
            int currCol = current[1];

            for(int[] dir : directions) {

                int newRow = currRow + dir[0];
                int newCol = currCol + dir[1];

                if(newRow >= 0 && newRow < rows &&
                   newCol >= 0 && newCol < cols &&
                   grid[newRow][newCol] == '1' &&
                   !visited[newRow][newCol]) {

                    visited[newRow][newCol] = true;
                    q.offer(new int[]{newRow, newCol});
                }
            }
        }
    }
}