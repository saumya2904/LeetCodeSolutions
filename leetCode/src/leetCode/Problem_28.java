package leetCode;

public class Problem_28 {
    public static int strStr(String haystack, String needle) {
        char[] str1= haystack.toCharArray();
        char[] str2 = needle.toCharArray();
        int count =0;
        int pos=0;
        for (int i =0; i< str1.length; i++) {
        	for (int j =0; j< str2.length; j++) {
        			if() {
        				count++;
                    
        		}
        			if (count ==str2.length-1) {
        				return i-(str2.length-2);
        			}
        	}
        }
		return 0;       
    }
    
    public static void main(String main[]) {
    	int k = strStr("saumya","isaum");
    	System.out.println(k);
    }
}
