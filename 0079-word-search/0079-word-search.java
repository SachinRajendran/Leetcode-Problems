class Solution {
    public boolean solve(char[][] board,int n,int m,int row,int col,String word,int ind){
        if(ind==word.length())
        {
              return true;
        }
        if(row==n || col==m || row==-1 || col==-1 ||board[row][col]!=word.charAt(ind))
        {
            return false;
        }
        else{
             char safe = board[row][col];
             board[row][col] ='*';
            boolean a = solve(board,n,m,row-1,col,word,ind+1);
            boolean b = solve(board,n,m,row+1,col,word,ind+1);
            boolean c = solve(board,n,m,row,col-1,word,ind+1);
            boolean d = solve(board,n,m,row,col+1,word,ind+1);
            board[row][col]=safe;
             return(a||b||c||d);
        }
    }
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        int row,col;
        for(row = 0;row<=n-1;row++){
            for(col=0;col<=m-1;col++){
                if(board[row][col]==word.charAt(0)){
                    if(solve(board,n,m,row,col,word,0)==true)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}