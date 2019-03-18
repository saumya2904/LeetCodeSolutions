package leetCode;

public class Problem_206 {
    public static ListNode reverseList(ListNode head) {
    	ListNode prev = null;
    	ListNode curr = head;
    	while(curr != null) {
    		ListNode nextTemp = curr.next;
    		curr.next = prev;
    		prev = curr;
    		curr = nextTemp;
    	}
    	
		return prev;
        
    }
    
	public static void main(String args[]) {
		ListNode a = new ListNode(4);
		ListNode b = new ListNode(5);
		ListNode c = new ListNode(6);
		
		a.next = b;
		b.next = c;
		ListNode m = reverseList(a);
		System.out.println(m.next.val);
	}
}
