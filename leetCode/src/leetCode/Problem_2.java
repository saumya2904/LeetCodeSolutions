package leetCode;

public class Problem_2 {
	class Solution {
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	   
	    	ListNode prev1=null;
	    	ListNode prev2=null;
	    	while (l1!=null) {
	    		ListNode temp = l1.next;
	    		l1.next = prev1;
	    		prev1= l1;
	    		l1 = temp;ii
	    		}
	    	l1 = prev1;
	    	
	    	while (l2!=null) {
	    		ListNode temp1 = l2.next;
	    		l2.next = prev2;
	    		prev2= l2;
	    		l2 = temp1;
	    		}
	    	l2 = prev2;
	    	ListNode add = new ListNode(0);
	    	int carry =0;
	    	int sum =0;
	    	while (l1!=null && l2!=null) {
	    		sum = (l1.val + l2.val+carry) ;
	    		add.next.val = sum%10;
	    		carry = sum/10; 
	    		l1=l1.next;
	    		l2=l2.next;
	    	}
			return l2;
	        
	    }
	}
}
