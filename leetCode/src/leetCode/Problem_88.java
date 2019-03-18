package leetCode;

import java.util.Arrays;

public class Problem_88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
     
    	for(int i = 0; i < n; i++)
			nums1[m + i] = nums2[i];
		Arrays.sort(nums1);
		for(int i = 0; i < m+n; i++) {
			System.out.println(nums1[i]);	
		}
    }
    
    public static void main(String args[]) {
    	int[] new1 = new int[]{1,2,3,0,0,0};
    	int[] new2= new int [] {12,3,4};
   	   merge(new1,3,new2,3);
   }
}
