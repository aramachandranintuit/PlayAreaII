	package DS;

import java.util.Comparator;
import java.util.TreeMap;

public class Queue  {

	class Node implements Comparable<Node> {
		Node next;
		Node previous;
		String value;

		Node(String value) {
			this.value = value;
			this.previous = null;;
			this.next = null;

		}

		@Override
		public int compareTo(Node o) {
			if (Integer.parseInt(this.value) > Integer.parseInt(o.value)) {
				return 1;
			} else if (Integer.parseInt(this.value) == Integer.parseInt(o.value)) {
				return 0;
			} else {
				return -1;
			}
		}

	}
	
	Node head;
	Node tail;
	TreeMap<Node,String> map = new TreeMap<Node,String>();
	Node addToQueue(String value)
	{
		Node newNode = new Node(value);
		if(head !=null)
		{
			newNode.next = head;
			newNode.previous = null;
			head.previous = newNode;
			head = newNode;
		}
		if(head==null)
		{
			head = newNode;
			tail = newNode ;
		}
		return newNode;
	}
	
	Node removeFromQueue()
	{
		if(tail!=null)
		{
			Node newTail = tail.previous;
			newTail.next = null;
			Node oldTail = tail;
			tail = newTail;
			return oldTail;
		}
		return null;
	}
	
	public static void main (String[] args)
	{
		Queue queue = new Queue();
		queue.addToQueue("4");
		queue.addToQueue("5");
		queue.addToQueue("6");
		queue.addToQueue("7");
		queue.addToQueue("8");
		queue.addToQueue("9");
		System.out.println(queue.removeFromQueue().value);
		System.out.println(queue.removeFromQueue().value);
	}
}
