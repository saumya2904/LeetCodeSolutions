package leetCode;

public class Problem_344 {
    public static String reverseString(String s) {
        {
            if(s == null || s.isEmpty())
                return s;
            
            char[] str = s.toCharArray();
            
            for(int start = 0, end = s.length() - 1; start < end; start++, end--)
            {
                char c = str[start];
                str[start] = str[end];
                str[end] = c;
            }
            return new String(str);
        }    
    }
    
  public static void main(String args[]) {
	String m = reverseString("shk, , jkj");
	System.out.println(m);
  }
}
