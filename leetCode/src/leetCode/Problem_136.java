package leetCode;

import java.util.HashMap;
import java.util.Map;

public class Problem_136 {
    public static int singleNumber(int[] nums) {
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int len = nums.length;
        for (int i =0; i<len;i++) {
        	if (map.containsKey(nums[i])) {
        		int val = map.get(nums[i]);
        		 map.put(nums[i], val+1);
        		 return nums[i];
        	}
        	else 
        		map.put(nums[i], 1);
        }
                for (Integer key : map.keySet()) {
                	if (map.get(key)==1)
                		return key;
                }
        return 0;
        
    }
    public static void main(String args[]) {
    	int[] new1 = new int[]{2,4,1,1,4};
    	 int k = singleNumber(new1);
    	 System.out.println(k);

    }
}
