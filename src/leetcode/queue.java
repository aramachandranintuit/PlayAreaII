package leetcode;

import java.util.TreeMap;
import java.util.TreeSet;

public class queue {

	class Node implements Comparable {
		String data;
		Node previous;
		Node next;

		Node(String data) {
			this.data = data;
			this.previous = this.next = null;
		}

		@Override
		public int hashCode() {
			return this.data.hashCode();
		}

		@Override
		public boolean equals(Object o) {
			if (o != null) {
				if (o instanceof Node) {
					if (this.data.hashCode() == ((Node) o).data.hashCode())
						return true;
				}
			}
			return false;

		}

		@Override
		public int compareTo(Object o) {
			if(((Node)o).data.hashCode() < this.data.hashCode())
				return 1;
			else if (((Node)o).data.hashCode() > this.data.hashCode())
				return -1;
			return 0;
		}
	}

	class Stack {

		Node head;
		Node tail;
		TreeSet<Node> set = new TreeSet<Node>();

		Node push(String data) {
			if (head == null) {
				head = new Node(data);
				tail = head;
			}
			if (head != null) {
				Node newNode = new Node(data);
				newNode.next = head;
				newNode.previous = null;
				head = newNode;
			}
			set.add(head);
			return head;
		}

		Node pop() {
			Node popNode = head;
			if(head !=null)
			{
				set.remove(popNode);
				head = head.next;
			}
			return popNode;
		}

		Node peek() {
			return set.last();
		}
	}

	public static void main(String[] args) {
		Stack s = new queue().new Stack();
		s.push("1");
		s.push("2");
		s.push("3");
		s.push("4");
		Stack p = new queue().new Stack();
		Node a = s.pop();
		while(a!=null)
		{
			p.push(a.data);
			a =s.pop();			
		}
		a = p.pop();
		while(a!=null)
		{
			System.out.println(a.data);
			a =p.pop();
		}
		
	}

}
