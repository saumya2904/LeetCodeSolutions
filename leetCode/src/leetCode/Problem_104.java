package leetCode;

public class Problem_104 {
    public static int maxDepth(TreeNode root) {
    	if (root == null)
    		return 0;
    	int leftDepth = maxDepth(root.left);
    	int rightDepth = maxDepth(root.right);
    	return (leftDepth>rightDepth) ? leftDepth+1 : rightDepth+1;
    }
    
    public static void main(String args[]) {
    	TreeNode a = new TreeNode(6);
    	TreeNode b = new TreeNode(7);
    	TreeNode c = new TreeNode(8);
    	a.left = b;
    	a.right = c;
    	int d = maxDepth(a);
    	System.out.println(d);
    }
}
