package leetCode;

public class Problem_215 {
    public static int findKthLargest(int[] nums, int k) {
    	int n = nums.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (nums[j] > nums[j+1])
                {
                    // swap temp and nums[i]
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
        
		return nums[nums.length-k];
		
        
    }
    public static void main(String args[]) {
    	int[] new1 = new int[]{1,2,3,3,3};
   	 int k = findKthLargest(new1, 5);
   	 System.out.println(k);

   }

}
