package leetCode;

public class Problem_172 {
    public static int trailingZeroes(int n) {
	 int res = 0;
	    while (n >4) {
	        n /= 5;
	        System.out.println(n);
	        res += n;
	    }
	    return res;
    }
    public static void main(String args[]) {
    	int m = trailingZeroes(25);
    	System.out.println(m);
    }
}
