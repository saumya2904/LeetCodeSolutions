package leetCode;

public class Problem_160 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	 ListNode cur = headA;
         int lenA = 0;
         while(cur != null){
             lenA ++;
             cur = cur.next;
         }

         cur = headB;
         int lenB = 0;
         while(cur != null){
             lenB ++;
             cur = cur.next;
         }
         ListNode curA = headA;
         ListNode curB = headB;
         if(lenA > lenB) {
             for(int i=0; i<lenA-lenB; i++){
                 curA = curA.next;
             }
         }
         if(lenA < lenB)  {
             for(int i=0; i<lenB-lenA; i++){
                 curB = curB.next;
             }
         }
         while(curA!=null){
             if(curA == curB) return curA;
             curA = curA.next;
             curB = curB.next;
         }
         return null;
     }
	public static void main(String args[]) {
		ListNode a = new ListNode(4);
		ListNode b = new ListNode(5);
		ListNode c = new ListNode(6);	
		ListNode d = new ListNode(2);
		ListNode e = new ListNode(3);
		
		a.next = b;
		b.next = c;
		d.next = e;
		e.next = c;
		ListNode m = getIntersectionNode(a, d);
		System.out.println(m.val);
	}
}
