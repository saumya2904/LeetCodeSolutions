package leetCode;

public class Problem_237 {
    public static void deleteNode(ListNode node) {
         node.val = node.next.val;
         node.next = node.next.next;
         
    }
    
    public static void main(String args[]) {
    ListNode a = new ListNode(5);
    ListNode b = new ListNode(6);
    ListNode c = new ListNode(7);
    a.next=b;
    c.next=c;
    deleteNode(a);
    
    }

}
