package DS;

import java.util.TreeMap;

public class Stack {
	
	class Node implements Comparable<Node>
	{
		Node next;
		Node previous;
		String value;
		Node(String value)
		{
			this.value = value;
			next = null;
			previous = null;		
		}
		@Override
		public int compareTo(Node toCompare) {
			if (Integer.parseInt(this.value) > Integer.parseInt(toCompare.value))
			{
				return 1;
			}
			else if(Integer.parseInt(this.value) == Integer.parseInt(toCompare.value))
			{
				return 0;
			}
			else
				return -1;
		}
	}
	Node tail;
	TreeMap<Node,String> map = new TreeMap<>();
	Node addNode(String value)
	{
		Node newNode = new Node(value);
		if(tail!=null)
		{
			tail.next = newNode;
		}
		newNode.previous = tail;
		tail = newNode;
		map.put(newNode, newNode.value);
		return newNode;
	}
	Node peek()
	{
		return tail;
	}
	Node pop()
	{
		Node temp = tail;
		temp.next = null;
		tail = temp.previous; 
		return temp;
	}
	Node popMax()
	{
		Node temp = map.lastKey();
		map.remove(temp);
		if(temp.previous !=null)
		{
			temp.previous.next = temp.next;
		}
		if(temp.next != null)
		{
			temp.next.previous = temp.previous;
		}
		return temp;
	}
	public static void main(String[] args)
	{
		Stack stack = new Stack();
		stack.addNode("3");
		stack.addNode("4");
		stack.addNode("15");
		stack.addNode("1");
		stack.addNode("5");
		stack.addNode("1099");
//		System.out.println("popMax for first time" + stack.popMax().value);
//		System.out.println("popMax for the second time" + stack.popMax().value);																																																																																				
		System.out.println(stack.peek().value);

	}
}
