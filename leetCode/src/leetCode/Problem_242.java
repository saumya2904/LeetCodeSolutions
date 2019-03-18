package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem_242 {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
        
        		}
	public static void main(String args[])
	{
		String m ="saumya";
		String n = "samuya";
		boolean k;
		k = isAnagram(m, n);
		System.out.println(k);
		
		
	}
}
