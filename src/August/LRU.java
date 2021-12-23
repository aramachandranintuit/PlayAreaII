package August;

import java.util.HashMap;
class Node
{
	Node next;
	Node prev;
	String content;
	String key;
	Node(String content,String val)
	{
		this.content=val;
		next=prev=null;
		this.key=content;
	}
}

class list
{
	Node head = null;
	Node tail = null;
	int size=0;
	list()
	{
		this.head=null;
		this.tail=null;
		this.size=0;
	}
	Node addNode(String key,String val)
	{
		Node n = new Node(key,val);
		if(head==null)
		{			
			head =n;
			tail=n;
			
		}
		else
		{
			tail.next= n;
			n.prev=tail;
			tail=n;
		}
		size++;
		return tail;
	}
	Node deleteNode(Node n)
	{
		if(n==head) {
			head=head.next;
		}
		else if(n==tail)
		{
			tail=tail.prev;

		}
		else
		{
			n.prev.next= n.next;
			n.next.prev =n.prev;
		}
		size--;
		return head;
		
	}
}

public class LRU {
	
	HashMap<String,Node> map = new HashMap<String,Node>();
	list ls = new list();
	int capacity=5;
	public static void main(String[] args)
	{
		LRU lru = new LRU();
		lru.capacity=3;
		lru.put("1", "one");
		lru.put("2", "two");
		lru.put("3", "three");
		lru.get("1");	
		lru.put("4", "four");
		System.out.println(lru.get("2"));
		System.out.println(lru.map);
		
		
	}
	
	void put(String key ,String val)
	{
		if(map.containsKey(key)) {
			Node n = map.get(key);
			n.content=val;
			map.put(key, n);
			get(key);
			return;
		}
		if(ls.size >= capacity)
		{
			String valToDelete = ls.head.key;
			System.out.println("###"+valToDelete);
			ls.deleteNode(ls.head);
			map.remove(valToDelete);
			System.out.println(map);
		}
		 if(!map.containsKey(key))
		{
			
			Node n = ls.addNode(key,val);
			map.put(key, n);
		}
		return;
	}
	String get(String key)
	{
		if(map.containsKey(key))
		{
			Node n = map.get(key);
			ls.deleteNode(n);
			Node t= ls.addNode(key,n.content);
			map.put(key, t);
			return t.content;
		}
		return null;
	}

}
