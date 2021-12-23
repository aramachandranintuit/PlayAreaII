package leetcode;

import leetcode.addNumbers.ListNode.Solution;

public class addNumbers {
	
	ListNode head =null;
    ListNode tail =null;
	public static void main(String[] args)
	{
		ListNode a1 = new addNumbers().new ListNode(3);
		ListNode a2 = new addNumbers().new ListNode(4);
		ListNode a3 = new addNumbers().new ListNode(5);
		a1.next = a2;
		a2.next =a3;
		a3.next=null;
		
		ListNode n4 = new addNumbers().new ListNode(6);
		ListNode n5 = new addNumbers().new ListNode(7);
		ListNode n6 = new addNumbers().new ListNode(8);
		n4.next=n5;
		n5.next=n6;
		n6.next=null;
		Solution sol = new addNumbers().new ListNode().new Solution();
		ListNode head = sol.addTwoNumbers(a1,n4);
		while(head!=null )
		{
			System.out.println(head.val);
			head=head.next;
		}
	}

	
	
	  class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	
	class Solution {
	        
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        String n1="" ,n2="";
	        ListNode temp =l1;
	        while( temp!=null)
	        {
	            n1 = n1 + String.valueOf(temp.val);
	            temp=temp.next;
	        }
	        
	        int K1 = Integer.parseInt(n1);
	        
	        temp = l2;
	        while( temp!=null)
	        {
	            n2= n2 + String.valueOf(temp.val);
	            temp=temp.next;
	        }
	        
	        int K2 = Integer.parseInt(n2);
	        
	        int l3 = K1 +K2;
	        String rev = reverseString(String.valueOf(l3));
	      
	        for(int i =0;i<rev.length();i++)
	        {
	            head = addNodesToList(new ListNode(Integer.parseInt(rev.charAt(i)+"")),head);
	        }
	        return head;
	        
	    }
	    
	    ListNode addNodesToList(ListNode node,ListNode head)
	    {
	        if(head == null && node!=null)
	        {
	            head =node ;
	            tail = node;
	            node.next=null;
	            return head;
	        }
	        else if(head !=null && node!=null)
	        {
	            node.next=head;
	            head = node;
	            return head;
	        }
	        return null;
	        
	    }
	    
	    String reverseString(String str)
	    {
	    		if(str!=null && str.length() >0)
	    		{
	    			return reverseString(str.substring(1,str.length())) +str.charAt(0);
	    		}
	    		return "";
	    }
	}
	  }
}
