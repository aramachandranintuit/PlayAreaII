package leetcode;

public class printListInReverse {
	class Node
	{
		Node nextNode;
		String data;
		Node(String data)
		{
			this.data=data;
			nextNode=null;
		}
	}
	
	Node head;
	
	public Node addNode(String data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			newNode.nextNode = head;
			head = newNode;
		}
		return head;
	}
	
	public static void main(String[] args)
	{
		printListInReverse list = new printListInReverse();
		list.addNode("1");
		list.addNode("2");
		list.addNode("3");
		list.addNode("4");
		list.addNode("5");
		Node head = list.head;
//		while(head!=null)
//		{
//			System.out.println(head.data);
//			head = head.nextNode;
//		}
		
		System.out.println("=========================");
		list.printListInReverseOrder(head);
	}

	void printListInReverseOrder(Node head)
	{
		if(head!=null)
		{
			printListInReverseOrder(head.nextNode);
			System.out.println(head.data);
		}
	}
}
