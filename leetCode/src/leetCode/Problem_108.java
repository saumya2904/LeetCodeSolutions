package leetCode;

public class Problem_108 {
	   public static TreeNode sortedArrayToBST(int[] num) {
	if (num.length == 0)
		return null;
		return sortedArrayToBST(num, 0, num.length - 1);
		}
		public static TreeNode sortedArrayToBST(int[] num, int start, int end) {
		if (start > end)
		return null;
		int mid = (start + end) / 2;
		TreeNode root = new TreeNode(num[mid]);
		root.left = sortedArrayToBST(num, start, mid - 1);
		root.right = sortedArrayToBST(num, mid + 1, end);
		return root;
}
	    public static void main(String args[]) {
	    	int[] new1 = new int[]{-10,-3,0,5,9};
	    	 TreeNode m = sortedArrayToBST(new1);
	    	 System.out.println(m.val);
	    	 System.out.println(m.left.val);
	    	 System.out.println(m.right.val);
	    	 System.out.println(m.left.right.val);
	    	 System.out.println(m.right.right.val);

	    }
}

