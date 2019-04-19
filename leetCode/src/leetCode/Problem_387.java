package leetCode;

public class Problem_387 {
	    public static int firstUniqChar(String s) {
	    	int ans = -1;
	      for (int i=0; i<s.length();i++) {
	    	  //System.out.println(s.charAt(i));
	    	  System.out.println("i:" + i);
	    	 int index= s.indexOf(s.charAt(i));
	    	 System.out.println("index:"+ index);
	    	if (s.indexOf(s.charAt(i),index+1) == -1) {
	    		System.out.println("index1:"+ index);
	    		return index;
	    	}
	      }
		return ans;
		
	    }
	 public static void main (String args[]) {
		 String m = "ssaauuhhjko";
		 int k = firstUniqChar(m);
		 System.out.println(k);
	 }
	}
