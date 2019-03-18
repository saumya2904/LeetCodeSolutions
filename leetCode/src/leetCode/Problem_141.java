package leetCode;


public class Problem_141 {
    public static ListNode hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next!= null) {
        	slow = slow.next;
        	fast = fast.next.next;
        	if (slow == fast) {
        		break;
        	}
    }
        if (fast ==null || fast.next == null) {
        	return null;
        }
        

        slow = head;
        while(slow!=null && fast !=null) {
        	if(slow == fast) {
        		return slow;
        	}
        	slow= slow.next;
        	fast= fast.next;
        }
        return null;
        /*If you want to find the collision point, move slow to head, keep fast as it is.
        Each are at same steps from the collision point. Iterate both till equal, you will 
        find the meeting point */
        
        
        
    }    

public static void main(String args[]) {
	ListNode b = new ListNode(5);
	ListNode c = new ListNode(6);
	ListNode a = new ListNode(7);
	ListNode d = new ListNode(8);
	ListNode e = new ListNode(9);
	ListNode f = new ListNode(0);
	b.next = c;
	c.next = a;
	a.next = d;
	d.next =e;
	e.next = d;
	ListNode m = hasCycle(a);
	System.out.println(m.val);
}
}
