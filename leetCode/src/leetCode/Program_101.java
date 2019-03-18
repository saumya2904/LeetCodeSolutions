package leetCode;

public class Program_101 {
    public static boolean isSymmetric(TreeNode root) {
       if (root == null) 
    	   return true;
    	return isSymmetric1(root.left, root.right);
       
	}
	
	private static boolean isSymmetric1(TreeNode left, TreeNode right) {
		// TODO Auto-generated method stub
		if (left == null && right ==null) {
			return true;
		}
		if (left == null || right ==null) {
			return false;
		}
		if (left.val != right.val) {
			return false;
		}
		if (!isSymmetric1(left.left , right.right)) {
			return false;
		}
		if (!isSymmetric1(left.right, right.left)) {
			return false;
		}
		return true;
	}

	public static void main(String args[]) {
	  	TreeNode a = new TreeNode(1);
    	TreeNode b = new TreeNode(2);
    	TreeNode c = new TreeNode(3);
    	TreeNode d = new TreeNode(3);
    	TreeNode e = new TreeNode(2);
    	a.left = b;
    	a.right = c;
    	b.left = d;
    	c.left = e;
    	
    	boolean g = isSymmetric(a);
    	System.out.println(g);
	}
}
