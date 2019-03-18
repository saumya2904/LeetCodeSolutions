package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem_169 {
	    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int len = nums.length/2;
        for(int i =0; i<nums.length;i++) {
        	if(map.containsKey(nums[i])) {
        		int val = map.get(nums[i]);
        		map.put(nums[i], val+1);
        	}
        	else
        		map.put(nums[i], 1);
        }
        
        for (Integer key : map.keySet()) {
        	if(map.get(key) > len) {
        		return key;
        	}
        }
        return 0;
	    }
	    
	    public static void main(String args[]) {
	    	int[] new1 = new int[]{1};
	    	 int k = majorityElement(new1);
	    	 System.out.println(k);

	    }
}
