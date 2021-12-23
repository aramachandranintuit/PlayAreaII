package Test;

import java.util.LinkedList;
import java.util.Queue;

public class linkedList {
	
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
	
	Node head = null;
	Node tail = null;
	Node addNode(String data)
	{
		if(data!=null)
		{
			Node newNode  = new Node(data);
			if(head==null)
			{
				head = newNode;
				tail = head;
			}
			else
			{
				tail.nextNode =  newNode;
				tail = newNode;
			}
			newNode.nextNode = null;
		}
		return  tail;
	}
	
	Node deleteNode(String data)
	{
		Node currentNode = null;
		if(head!=null)
		{
			currentNode = head.nextNode;
			if(head.data == data)
			{
				head = currentNode;
				return head;
			}
			else if(currentNode.data == data)
			{
				head.nextNode = currentNode.nextNode;
				return currentNode;
			}
		}
		else if (head==null || data !=null)
		{
			return null;
		}
		while(currentNode!=null)
		{
			Node nextNode = currentNode.nextNode;
			if(nextNode.data == data)
			{
				currentNode.nextNode = nextNode.nextNode;
				return nextNode;
			}
			else {
				currentNode = nextNode;
			}
		}
		 return null;
	}
	
	public static void main(String[] args)
	{
		linkedList list = new linkedList();
		list.addNode("1");
		list.addNode("2");
		list.addNode("3");
		list.addNode("4");
//		list.deleteNode("3");
		Node node = list.head;
		Queue<Integer> queue = new LinkedList<Integer>();
		while(node!=null)
		{
			System.out.println(node.data);
			queue.add(Integer.parseInt(node.data));
			node=node.nextNode;
		}
		int n=0;
		while(queue.peek()!=null)
		{
			 n += queue.poll();
		}
		
		System.out.println(n);
	}

}
