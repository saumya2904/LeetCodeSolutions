package leetCode;

public class Problem_189 {
    public static void rotate(int[] nums, int k) {
    	int l = nums.length;
        for (int i=0; i<k; i++) {
        	int a = nums[l-1];
        for(int j=l-2;j>=0;j--) {
        	if(j==0) {
        		nums[j+1]=nums[j];
        		nums[j] = a;
        	}
        	else {
             nums[j+1]=nums[j];
        	}
        }
        }
        for (int i =0;i<nums.length;i++) {
        	System.out.println(nums[i]);
        }
    }
    
    public static void main(String args[]) {
    	int[] new1 = new int[]{7,1,2,3,8,9,0,7,8};
    	 rotate(new1,4);

    }

}
