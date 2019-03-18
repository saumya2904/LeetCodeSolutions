package leetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem_283 {
    public static void moveZeroes(int[] nums) {
    	int count =0;
    	ArrayList<Integer> a = new ArrayList<Integer>();
    	for (int i =0; i< nums.length; i++) {
    		a.add(nums[i]);
    		if (nums[i]==0)
    			count++;
    	}
    	a.removeAll(Arrays.asList(0));
    	for (int i =0; i<count;i++) {
    		a.add(0);
    	}
    	for (int i =0; i<a.size();i++) {
    		nums[i] = a.get(i);
    	}
    	
    }
    
    public static void main(String args[]) {
    	int[] new1 = new int[]{0,1,0,3,12};
   	 moveZeroes(new1);
   }
}
