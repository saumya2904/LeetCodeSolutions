package leetCode;

public class Problem_300 {
    public int lengthOfLIS(int[] nums) {
    	int count =0;
    	int max =0;
     for(int i=0; i< nums.length-1;i++) {
    	 for(int j=i+1; j<nums.length;j++) {
    	 if(nums[i]<nums[i+1]) {
    		 count++;
    	 }
    	 else {
    		 max = Math.max(count, max);
    		 count =0;
    	 }
     }
     return max;
    }
}
