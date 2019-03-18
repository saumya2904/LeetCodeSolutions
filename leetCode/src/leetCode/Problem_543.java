package leetCode;

public class Problem_543 {
	int ans;
    public int diameterOfBinaryTree(TreeNode root) {
    	   ans =1;
    	   helper(root);
    	   return ans-1;
    }
           
       public int helper(TreeNode root) {
    	   if (root==null)
    		{
         	   return 0;
            }
            int leftDepth = diameterOfBinaryTree(root.left);
            int rightDepth = diameterOfBinaryTree(root.right);
            int ans =  Math.max(ans, leftDepth+rightDepth+1);
            return Math.max(leftDepth,rightDepth)+1;
         }  
		
}
