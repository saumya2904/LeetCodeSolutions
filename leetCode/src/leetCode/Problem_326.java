package leetCode;

public class Problem_326 {
    public static boolean isPowerOfThree(int n) {
    	if (n == 0) {
    		return false;
    	}
    	if (n==1) {
    		return true;
    	}
        while(n%3 ==0 ) {
        	n = n/3;
        	if (n ==1)
        		return true;
        }
		return false;
        
    }
    public static void main(String args[]) {
    	boolean b = isPowerOfThree(3);
    	System.out.println(b);
    }
}
