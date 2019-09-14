package leetCode;

public class Problem_130 {
    public void solve(char[][] board) {
       int r = board.length;
       int c = board[0].length;
       for(int i=0; i<r;i++) {
    	   for(int j=0; j<c;j++) {
    		   if(board[i][j] == 'O')
    			   helper(i, j, r, c, board);
    	   }
       }
    }

	private boolean helper(int i, int j, int r, int c, char[][] board ) {
		boolean m;
		if(i<r-1 && j<c-1) {
			if(board[i][j+1] == 'X')
				m = true;
			else if (board[i][j+1] == 'O') {
				m =	helper(i, j+1 , r, c, board) ;	
				if (m==false) {
					return m;
				}
			if(board[i+1][j] =='X')
				m = true;
			if(board[i][j-1] == 'X')
				continue;
			if(board[i-1][j] == 'X')
				continue;
		}
		return true;
		
		
	}

}
