package leetcode;

public class removeNthNodeFromList {
	
	class Node {
		String data;
		Node nextNode;
		Node previousNode;
		
		Node(String data)
		{
			this.data = data;
			this.nextNode=this.previousNode =null;
		}
	}
	
	Node head;
	Node tail;
	int size=0;
	
	public Node addNode(String data)
	{
		Node node = new Node(data);
		if(this.head == null)
		{
			this.head = node;
			this.head.nextNode=null;
			this.head.previousNode =null;
			this.tail = this.head; 
			this.size++;
		}
		else
		{
			this.head.previousNode = node;
			node.nextNode = head;
			node.previousNode = null;
			head = node;
			this.size++;
		}
		return node;
	}
	
	public String deleteNode(int n)
	{
		if(this.head !=null)
		{
			int i=1;
			Node node = this.head;
			if(n==1)
			{
				node.previousNode.nextNode = node.nextNode;
				node.nextNode.previousNode = node.previousNode;
				head = node;
				
			}
			
			while(i!=n && n>0)
			{
				node = node.nextNode;
			}
			String data = node.data;
			node.previousNode.nextNode = node.nextNode;
			if(node != tail)
			{
				node.nextNode.previousNode = node.previousNode;
			}
			else if(node ==tail)
			{
				tail = node.previousNode;
			}
			return data;
		}
		return null;
		
	}

}
