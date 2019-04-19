package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) 
            return null;
         Map<String, ArrayList<String>> res = new HashMap<String, ArrayList<String>>();
         List<List<String>> res1 = new ArrayList<List<String>>();
          for(int i =0; i< strs.length ;i++){
            char[] c = strs[i].toCharArray();
             Arrays.sort(c);
             String string = new String(c);
             if(res.containsKey(string)) {
            	ArrayList<String> rs = res.get(string);
            	rs.add(strs[i]);
             }
             else {
            	ArrayList<String> rs1 = new ArrayList<String>();
            	rs1.add(strs[i]);
            	res.put(string, rs1);
             }
            	 
          }
          for(String key : res.keySet()) {
        	  res1.add(res.get(key));
          }
          return res1;
          
      }
}
