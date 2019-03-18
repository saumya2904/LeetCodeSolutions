package leetCode;

public class Problem_14 {
	 public static String longestCommonPrefix(String[] strs) {
		    if (strs.length == 0) return "";
		    String prefix = strs[0];
		    for (int i = 1; i < strs.length; i++) {
		        while (strs[i].indexOf(prefix) != 0) {
		        	System.out.println(strs[i].indexOf(prefix));
		            prefix = prefix.substring(0, prefix.length() - 1);
		            if (prefix.isEmpty()) {
		            	return "";
		            }
		        }  }      
		    return prefix;	        
	    }
	    public static void main(String args[]) {
	    	String[] new1 = new String[]{"hgh","hghjk","mjkh"};
	   	 String k = longestCommonPrefix(new1);
	   	 System.out.println(k);

	   }
}
