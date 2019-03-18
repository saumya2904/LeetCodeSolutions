package leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Problem_103 {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
       // List<Integer> nodes = new ArrayList<Integer>();
        s1.add(root);
        while(!s1.isEmpty() && !s2.isEmpty()){
            ArrayList<Integer> nodes = new ArrayList<Integer>();
            while(!s1.isEmpty()){
           TreeNode root1 = s1.peek();
           s1.pop();
            nodes.add(root1.val);           
            if(root1.left!=null){
                s2.add(root1.left);
            }
            if(root1.right!=null){
                s2.add(root1.right);
            }
            }
            result.add(nodes);
            ArrayList<Integer> nodes1 = new ArrayList<Integer>();
            while(!s2.isEmpty()){
                TreeNode node = s2.peek();
                s2.pop();
                nodes1.add(node.val);
            if(root.right!=null){
                s2.add(root.right);
            }
            if(root.left!=null){
                s2.add(root.left);
            }
            }
            result.add(nodes1);
            
        }
        return result;
        
    }
}
