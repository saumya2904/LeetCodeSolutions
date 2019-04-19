package leetCode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {

	public int V;
	public LinkedList<Integer> adj[];
	Graph(int v){
		V = v;
		adj = new LinkedList[v];
		for(int i=0; i<v;i++) {
			adj[i] = new LinkedList();
		}
	}
	
	void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	Stack topologicalsort() {
		Stack<Integer> stack = new Stack();
		boolean[] visited = new boolean[V];
		for(int i=0;i<V;i++) {
			visited[i] = false;
		}
		for(int i =0;i<V;i++) {
			if(visited[i] == false) 
				helper(visited, i , stack );
		}
	    System.out.println(stack);
		return stack;
		
	}

	private void helper(boolean[] visited, int v, Stack stack) {
		// TODO Auto-generated method stub
		visited[v] = true;
		int i;
		Iterator<Integer> it = adj[v].iterator();
		while(it.hasNext()) {
			i = it.next();
			if(!visited[i]) {
				helper(visited, i , stack);
			}
		}
		stack.push(v);
		
	}
}
