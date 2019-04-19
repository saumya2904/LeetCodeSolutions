package practicsQues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PredatorTree {
	public static int makeGraph(int arr[]) {
	List<Node> graphs = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == -1) {
            graphs.add(new Node(i));
        }
    }
    Queue<Node> q = new LinkedList<>();
    for (Node node : graphs) {
        q.add(node);
    }

    while (!q.isEmpty()) {
        Queue<Node> q2 = new LinkedList<>();
        while (!q.isEmpty()) {
            Node node = q.poll();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == node.val) {
                    Node child = new Node(i);
                    node.children.add(child);
                    q2.add(child);
                }
            }
        }
        q = q2;
    }
    List<Integer> depths = new ArrayList<>();
    for (Node node : graphs) {
    	   	depths.add(getDepth(node));
    }
    return Collections.max(depths);
	}
private static class Node {
    List<Node> children = new ArrayList<>();
    int val;

    Node(int val) {
        this.val = val;
    }
}
private static int getDepth(Node node) {
    if (node.children.isEmpty()) {
        return 1;
    }
    List<Integer> depths = new ArrayList<>();
    for (Node child : node.children) {
        depths.add(1 + getDepth(child));
    }
    return Collections.max(depths);
}

public static void main(String args[]) {
	int[] arr = {-1,0,1};
	int m = makeGraph(arr);
	System.out.println(m);
}
}
