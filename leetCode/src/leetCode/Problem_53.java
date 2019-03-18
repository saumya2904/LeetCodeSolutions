package leetCode;

public class Problem_53 {
	   public static int maxSubArray(int[] A) {
		    int max = Integer.MIN_VALUE, sum = 0;
		    for (int i = 0; i < A.length; i++) {
		        if (sum < 0) 
		            sum = A[i];
		        else 
		            sum += A[i];
		        if (sum > max)
		            max = sum;
		    }
		    return max;
		}

	   public static void main(String args[]) {
	    	int[] new1 = new int[]{-2,1,-3,4,-1,2,1,-5,4};
	   	 int d = maxSubArray(new1);
	   	 System.out.println(d);

	   }
}
