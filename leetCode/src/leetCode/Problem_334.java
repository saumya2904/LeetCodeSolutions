package leetCode;

public class Problem_334 {
    public boolean increasingTriplet(int[] nums) {
    	
    	int n = nums.length;
    	int[] smaller = new int[n];
    	int[] greater = new int[n];
    	int min = 0;
    	int max = n-1;
    	smaller[0]= -1;
    	greater[n-1] = -1;
    	for(int i=1; i<n ;i++) {
    		if(nums[i]<=nums[0]) {
    			min=i;
    			smaller[i] = -1;
    		}
    		else
    			smaller[i] = min;
    	}
    	
    	for(int i=n-2; i>=0; i--) {
    		if(nums[i]>=nums[max]) {
    			max= i;
    			greater[i] = -1;
    		}
    		else
    			greater[i] = max;
    	}
    	
    	for(int i=0; i<n ;i++) {
    		if(smaller[i]!=-1 && greater[i]!=-1) {
    			return true;
    		}
    	}
		return false;
     
        
    }
}
