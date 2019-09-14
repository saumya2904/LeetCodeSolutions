package leetCode;

public class Problem_36 {
    public boolean isValidSudoku(char[][] board) {
    	
    	int r = board.length;
    	int c = board[0].length;
    	for (int i=0; i<r;i++) {
    		boolean[] m= new boolean[9];
    		for(int j=0; j<c; j++) {
    			if(m[Character.getNumericValue(board[i][j])]) {
    				return false;
    			}
    			m[Character.getNumericValue(board[i][j])] = true;
    		}
    	}
    	
    	for (int i=0; i<c;i++) {
    		boolean[] m= new boolean[9];
    		for(int j=0; j<r; j++) {
    			if(m[Character.getNumericValue(board[j][i])]) {
    				return false;
    			}
    			m[Character.getNumericValue(board[j][i])] = true;
    		}
    	}
    	
    	
		return false;
        
    }
}
