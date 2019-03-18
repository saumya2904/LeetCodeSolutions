package leetCode;

import java.util.HashMap;
import java.util.HashSet;

public class Problem_395 {
	   public int longestSubstring(String s, int k) {
	         HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	         char[] str = s.toCharArray();
	         for(int i =0; i<str.length;i++) {
	        	 if(map.containsKey(str[i])) {
	        		 map.put(str[i],map.get(str[i])+1);
	        	 }
	        	 else
	        		 map.put(str[i], 1);	        			 
	         }
	         HashSet<Character> set = new HashSet<Character>();
	         for(int i=0; i<str.length;i++) {
	        	 if(map.get(str[i]) > k) {
	        		 set.add(str[i]);
	        	 }
	         }
	         
	         int i=0, j=0;
	         int max =0;
	         while (j<str.length) {
	        	 char c = str[j];
	        	 if(set.contains(c)) {
	        	 if(j!=i) {
	        	 max = Math.max(max,  longestSubstring(s.substring(i, j), k));	        	 
	         }
	        	 i = j+1;
	         }
	         j++;
	         }
	   
	         if(i!=j) {
	        	 max = Math.max(max, longestSubstring(s.substring(i, j), k));
	         }
			return max;
	         
	         
	         }
}
