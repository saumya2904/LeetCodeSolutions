package leetCode;

public class Problem_74 {
    public static boolean searchMatrix(int[][] matrix, int target) {
    	int i = matrix.length;
    	int j = matrix[0].length;
    	System.out.println(i + ","+ j);
      for(int k =0; k< i;k++) {  
    	  int low = 0;
      	int high = j;
      	innerloop:
    	while(low<=high) {
    		int mid =  low+(j-low)/2;
    		 if(target == matrix[k][mid]) {
    			 return true;
    		 }
    		 else if(target<matrix[k][mid]) {
    			 if(mid< j-2 && mid>0)
    			 high = mid-1;
    		 }
    		 else if(target>matrix[k][mid]) {
    			 if(mid < j-2 && mid>0) {
    			 low = mid+1;
    			 }
    		
    		 }
    		 
    	}
      }
	return false;
    }
    public static void main(String args[]) {
    	int[][] m = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,50}};
    	boolean m1 = searchMatrix(m, 3);
    	System.out.println(m1);
    }
    
}
