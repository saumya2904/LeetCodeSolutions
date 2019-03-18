package leetCode;

public class Problem_234 {
    public static boolean isPalindrome(ListNode head) {
    	if(head == null)
    		return true;
    		ListNode p = head;
    		ListNode prev = new ListNode(head.val);
    		while(p.next != null){
    		ListNode temp = new ListNode(p.next.val);
    		temp.next = prev;
    		prev = temp;
    		p = p.next;
    		}
    		ListNode p1 = head;
    		ListNode p2 = prev;
    		while(p1!=null){
    		if(p1.val != p2.val)
    		return false;
    		p1 = p1.next;
    		p2 = p2.next;
    		}
    		return true;
	
}
	public static void main(String args[]) {
		ListNode a = new ListNode(0);
		ListNode b = new ListNode(0);
		//ListNode c = new ListNode(3);
		//ListNode d = new ListNode(1);
		a.next = b;
		//b.next = c;
		//c.next = d;
		boolean m = isPalindrome(a);
		System.out.println(m);
	}
    
}

