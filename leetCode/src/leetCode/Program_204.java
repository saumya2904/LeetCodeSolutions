package leetCode;

public class Program_204 {
    public static int countPrimes(int n) {
    	boolean b = true;
    	int count =0;
    	for (int i =2; i<=n;i++) {
    		
    		for (int j=2; j*2< i;j++) {
    			if(i%j == 0) {
    			System.out.println(i);
    			b = false;}
    			else
    				b=true;
    			
    			}    			
    		if (b==true	) {
    			System.out.println(i);
    			count++;
    		}
    	}
		return count;
        
    }
    public static void main(String args[]) {
    	int m = countPrimes(10);
    	System.out.println(m);
    }
}
