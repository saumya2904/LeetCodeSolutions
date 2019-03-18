package leetCode;

public class ListNodeLength {
	public static int ListLength(ListNode headNode)
	{
		int length =0;
		ListNode currentNode= headNode;
		while (currentNode!=null) {
			length++;
			currentNode = currentNode.next;
		}
		return length;
	}

	public static void main(String args[]) {
		ListNode a = new ListNode(4);
		ListNode b = new ListNode(5);
		ListNode c = new ListNode(6);
		
		a.next = b;
		b.next = c;
		int m = ListLength(a);
		System.out.println(m);
	}
}
