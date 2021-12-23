package leetcode;

import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

class Node<K,V> {
	K key;
	V value;
	Node previousNode;
	Node nextNode;
	
	Node(K key , V value)
	{
		this.key = key;
		this.value = value;
		this.previousNode = this.nextNode = null;
	}
}
public class LRUCache<K>{
	int capacity;
	ConcurrentHashMap<K,Node> map ;
	int count=0;
	
	LRUCache(int capacity)
	{
		this.capacity = capacity;
		map= new ConcurrentHashMap<K,Node>();
	}
	
	Node head;
	Node tail;
	public Node addToHead(Node newNode)
	{
		if (head == null)
		{
			head = tail = newNode;
		}
		else
		{
			newNode.nextNode = head;
			head.previousNode = newNode;
			newNode.previousNode = null;
			head = newNode;
		}
		count++;
		return head;	
	}
	
	public void delete(Node node)
	{
		count--;
		node.previousNode.nextNode = node.nextNode;
		if(node.nextNode!=null)
		{
			node.nextNode.previousNode = node.previousNode;
		}
		return ;
		
	}
	
	public void put(Node node)
	{
		if(this.map.containsValue(node))
		{
//			1.delete the node
			this.delete(node);
//			add node to head
			this.addToHead(node);
		}
		else
		{
			if(count < capacity-1)
			{
				this.map.put((K) node.key, node);
				this.addToHead(node);
			}
			else
			{
				this.map.remove(tail.key);
				this.delete(tail);
				this.addToHead(node);	
			}
		}
		
	}
	
	public Node getNode(Node node)
	{
		if(this.map.containsValue(node))
		{
//			1.delete the node
			this.delete(node);
//			add node to head
			this.addToHead(node);
			return node;
		}
		else
			return null;
		
	}
}
