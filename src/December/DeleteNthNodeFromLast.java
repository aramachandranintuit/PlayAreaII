package December;

class Node {
	
	String data;
	Node nextNode;
	Node(String data)
	{
		if (data!=null)
		{
			this.data = data;
			this.nextNode = null;
		}
	}
	
}

public class DeleteNthNodeFromLast {
	


Node head= null;
Node tail = null;
 private Node addToList(String val)
 {
	 if(head==null)
	 {
		 head = new Node(val);
		 tail = head;
	 }
	 else
	 {
		 Node newNode = new Node(val);
		 tail.nextNode = newNode;
		 tail =newNode;	
	 }
	 return head;  
 }
 
	 private Node delete(String data)
	 {
		 Node temp =head;
		 while(temp!=null)
		 {
			 if(temp.data.equals(data) && temp!=head)
			 {
				 temp.nextNode = temp.nextNode.nextNode;
			 }
			 else if (temp.data.equals(data) && temp==head)
			 {
				 head=head.nextNode;
				 return head;
			 }
			 temp =temp.nextNode;
		 }
		 return head;
		     
	 }
	 private Node deleteNNodeFromEnd(int n)
	 {
		 Node dummy = new Node("0");
		 dummy.nextNode = head;
		 Node first = dummy;
		 Node second =dummy;
		 int i=1;
		 while(i<=n)
		 {
			 second=second.nextNode;
			 i++;
		 }
		 while( second!=null )
		 {
			 first=first.nextNode;
			 second=second.nextNode;
		 }
		 
			 first.nextNode = first.nextNode.nextNode;
		return dummy.nextNode;
	 }
	 
	 public static void main(String[] args)
	 {
		 DeleteNthNodeFromLast list = new DeleteNthNodeFromLast();
		 list.addToList("1");
		 list.addToList("2");
		 Node head = list.head;
		 head=list.deleteNNodeFromEnd(1);
		 while(head!=null)
		 {
			 System.out.println(head.data);
			 head=head.nextNode;
		 }
		 
	 }

}
