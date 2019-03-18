package leetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem_896 {
    public static boolean isMonotonic(int[] A) {
    	boolean c = true;
    	int number = 0;
    	int i =0;
    	ArrayList<Integer> a = new ArrayList<Integer>();
    	if (A.length<=1) {
    	   c = true;
    	}
    	else {
    		for (i = 0; i< A.length-1;i++) {
    		    number = A[i]-A[i+1];
    		   a.add(Integer.signum(number));
    		   System.out.println(a.get(i));
    		}
    		    if (a.size()<=1)
    		    {
    		    	c = true;
    		    }
    		    else {
    		    		a.removeAll(Arrays.asList(0));
    		    /*	for (i =0; i<a.size();i++) {
    		    		System.out.println("i:" +i);
    		    		System.out.println(a.get(i));
    		    		if(a.get(i)==0) {
    		    			a.remove(i);
    		    		}*/
    		    	
    		    	for (i=0;i<a.size();i++)
    		    		System.out.println(a.get(i));
    		    	for (i=0; i<a.size()-1;i++) {
    		    		if (a.get(i)!=a.get(i+1))
    		    			c = false;
    		    	}
    		    } 		    
    	}	
        
    	return c;
    }
   public static void main(String args[]) {
    	int[] new1 = new int[]{1,2,3,3,3};
   	 boolean d = isMonotonic(new1);
   	 System.out.println(d);

   }
}
