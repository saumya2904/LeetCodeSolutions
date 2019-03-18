package leetCode;

import java.util.Arrays;

public class Problem_268 {
    public static int missingNumber(int[] nums) {
    	  Arrays.sort(nums); 
    	  if (nums[0] != 0)
     		 return 0;
     	 if (nums[nums.length-1]!=nums.length)
     		 return nums.length;
          for (int i=0; i<nums.length; i++) {
        	if (nums[i+1]-1 != nums[i])
        		return nums[i+1]-1;        		 
          }   	
		return 0;
        
    }
    
    public static void main(String args[]) {
    	int[] new1 = new int[]{0,1,2,3,4,5,7};
   	 int d = missingNumber(new1);
   	 System.out.println(d);

   }

}
