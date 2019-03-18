package leetCode;

public class Problem_3 {
    public static int lengthOfLongestSubstring(String s) {
    	if (s==null) {
        		return 0;
        	}
            StringBuffer p1 = new StringBuffer();
        	int max =0;
        	int len =0;
            for (int i =0; i< s.length(); i++) {
            char p2 = s.charAt(i);
            String p3 =Character.toString(p2);
            System.out.println(p3);
            if (p1.indexOf(p3) ==-1) {
            	p1.append(p3);
                System.out.println(p1);
               len = p1.length();
               if(len>max) {
            	   max=len;
               }
            }
            else 
            {   
            	if(s.charAt(i)!=s.charAt(i-1))
                p1.delete(0, p1.length()-1);
            	else
                p1.delete(0, p1.length());
                System.out.println(p1);
                p1.append(p3); 
            }
            }
    		return max;
            }
    	
    	public static void main(String args[]) {
    		String s ="anviaj";
    		int m = lengthOfLongestSubstring(s);
    		System.out.println(m);
    	}
}
