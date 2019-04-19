package leetCode;

public class Problem_876 {
	 public ListNode middleNode(ListNode head) {
		if(head.next == null) {
			return head;
		}
		ListNode slow = head;
		ListNode fast = head.next; 
		while(fast!= null) {
			f
			if(fast.next != null) {
				slow = slow.next;
				fast = fast.next;
			}
		}
		return slow;
	 
	 }
}
