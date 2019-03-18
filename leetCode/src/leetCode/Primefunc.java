package leetCode;

public class Primefunc {
	static boolean  isPrime(int n) {
	    for(int i=2;2*i<n;i++) {
	    	System.out.println(n);
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	public static void main(String args[]) {
		boolean m = isPrime(5);
		System.out.println(m);
	}
}
