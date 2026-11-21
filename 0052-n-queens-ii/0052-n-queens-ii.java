class Solution {
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        List<List<String>> res= new ArrayList<>();
        backtrack(0,res,board);
        return res.size();
    }
    public void backtrack(int col, List<List<String>> res, char[][] board ){
        int n=board.length;
        if(col==n){
            ArrayList<String> curr = new ArrayList<>();
            for(int i=0;i<n;i++){
                String row= new String(board[i]);
                curr.add(row);
            }
            res.add(curr);
            return;
        }
        for(int row=0;row<n;row++){
            if(isSafe(board,row,col)){
                board[row][col]='Q';
                backtrack(col+1,res,board);
                board[row][col]='.';
            }
        }
    }
    public boolean isSafe(char[][] board, int r,int c){
        for(int k=1;k<=c;k++){
            int col=c-k;
            //upper diagonal
            int row=r-k;
            if(row>=0){
                if(board[row][col]=='Q'){
                    return false;
                }
            }
            //lower diagonal
            row=r+k;
            if(row<board.length){
                if(board[row][col]=='Q'){
                    return false;
                }
            }
            //same row
            if(board[r][col]=='Q'){
                return false;
            }
        }
        return true;
    }
}