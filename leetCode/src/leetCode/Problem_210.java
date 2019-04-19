package leetCode;

import java.util.Stack;

public class Problem_210 {
    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        Graph g = new Graph(numCourses);
        int r = prerequisites.length-1;
        for(int i =0; i<r ;i++) {
        	g.addEdge(prerequisites[r][1],prerequisites[r][0]);
        }
        Stack<Integer> stack = g.topologicalsort();
        int[] res = new int[numCourses];
        int i =0;
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        while(!stack.isEmpty()) {
        	//System.out.println("stack:" + stack.pop());
        	res[i] = stack.pop();
        	i++;
        }
        return res;
    }
    public static void main(String args[]) 
    { 
       int m= 2;
       int[][] n = {{2,3}};
       int[] res = findOrder(m, n);
       for (int i=0; i<res.length;i++) {
    	   System.out.println(res[i]);
       }
 
    }
}
