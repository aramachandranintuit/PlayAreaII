package DS;

class lNode
{
	lNode nextNode;
	int value;
	lNode(int value)
	{
		nextNode = null;
		this.value = value;
	}
}
public class LinkedListReversal {
	
	lNode head = null;
	lNode tail = null;
	
	public lNode addtoList(int val)
	{
		lNode newNode = new lNode(val);
		if(head==null)
		{
			head=newNode;
			tail = head;
		}
		else
		{
			tail.nextNode = newNode;
			tail=newNode;
		}
		return head;
	}
	
	public static void main(String[] args)
	{
		LinkedListReversal lr = new LinkedListReversal();
		lr.addtoList(1);
		lr.addtoList(2);
		lr.addtoList(3);
		lr.addtoList(4);
		lr.addtoList(5);
//		System.out.println(lr.head.value);
//		System.out.println(lr.head.nextNode.value);
//		System.out.println(lr.head.nextNode.nextNode.value);
//		System.out.println(lr.head.nextNode.nextNode.nextNode.value);
//		lNode newHead = reverseLinkedList(lr.head);
		lNode newHead= reverseLinkedListR(lr.head);
		while(newHead!=null)
		{
			System.out.println(newHead.value);
			newHead = newHead.nextNode;
		}
		
		
	}
	
	public static lNode reverseLinkedList(lNode node)
	{
		lNode current=node ;
		lNode previous=null;
		lNode next=null;
		while(current!=null)
		{
			next = current.nextNode;
			current.nextNode = previous;
			previous=current;
			current =next;
		}
		return previous;
	}
	public static lNode reverseLinkedListR(lNode node)
	{
		if(node==null)
			return node;
		if(node.nextNode==null)
			return node;
		lNode temp = node.nextNode;
		lNode newNode = reverseLinkedListR(node.nextNode);
		temp.nextNode = node;
		node.nextNode=null;
		return newNode;
	}
	

}
