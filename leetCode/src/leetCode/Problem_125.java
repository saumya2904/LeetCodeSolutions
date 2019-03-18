package leetCode;

public class Problem_125 {
	    public static boolean isPalindrome(String s) {
	    String result = s.replaceAll("[^a-zA-Z0-9]", "");
	    result = result.toLowerCase();
	    char[] str1 = result.toCharArray();
	    int len = str1.length;
	    System.out.println(len);
	    if (len==0 || len==1) {
	    	return true;
	    }
	   if (len % 2 ==0) {
   	 for(int start=0,end = len-1; start<len/2 && end>=len/2; start++, end--){
	          if (str1[start]!=str1[end]) 
	        	  return false;
	    }
	   }
	   else if (len % 2 !=0) {
		   	 for(int start=0,end = len-1; start<len/2+1 && end>=len/2+1; start++, end--){
			          if (str1[start]!=str1[end]) 
			        	  return false;
			    }
			   }

	   return true;
	    }
	    
	    public static void main(String args[]) {
	    	boolean x = isPalindrome("A man@, a plan, a canal: panama"); 
	    	System.out.println(x);
	    }
}
