package leetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem_102 {
    public static List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> al = new ArrayList<List<Integer>>();
    	ArrayList<Integer> nodeValues = new ArrayList<Integer>();
    	if(root == null)
    	return al;
    	LinkedList<TreeNode> current = new LinkedList<TreeNode>();
    	LinkedList<TreeNode> next = new LinkedList<TreeNode>();
    	current.add(root);
    	while(!current.isEmpty()){
    	TreeNode node = current.remove();
    	if(node.left != null)
    	next.add(node.left);
    	if(node.right != null)
    	next.add(node.right);
    	nodeValues.add(node.val);
    	if(current.isEmpty()){
    	current = next;
    	next = new LinkedList<TreeNode>();
    	al.add(nodeValues);
    	nodeValues = new ArrayList<Integer>();
    	}
    	}
    	return al;
}
    public static void main(String args[]) {
    	TreeNode a = new TreeNode(3);
    	TreeNode b = new TreeNode(9);
    	TreeNode c = new TreeNode(20);
    	TreeNode d = null;
    	TreeNode e = null;
    	TreeNode f = new TreeNode(15);
    	TreeNode g = new TreeNode(7);
    	a.left = b;
    	a.right = c;
    	b.left = d;
        b.right = e;
        c.left = f;
        c.right =g; 
       List<List<Integer>> m = levelOrder(a);
    	System.out.println(m);
    }
}
