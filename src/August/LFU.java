package August;

import java.util.HashMap;
import java.util.Map;

class LFUNode
{
	LFUNode next;
	LFUNode prev;
	Integer key;
	Integer value;
	Integer frequency;
	LFUNode(Integer key , Integer value)
	{
		this.key=key;
		this.value=value;
		this.prev=next=null;
		this.frequency=1;
	}
}
class List
{
	LFUNode head = null;
	LFUNode tail=null;
	int size;
	
	LFUNode addNode (LFUNode node)
	{
		if(head==null)
		{
			head = node;
			tail =node;
		}
		else
		{
			tail.next = node;
			node.prev=tail;
			tail=node;
		}
		size++;
		return node;
	}
	
	void deleteNode(LFUNode node)
	{
		if(node==head) {
			size--;
			head= head.next;
			return;
		}
		if(node==tail)
		{
			size--;
			tail = tail.prev;
			return;
		}
		else
		{
			size--;
			node.next.prev = node.prev;
			node.prev.next=node.next;
		}
	}
	
	void reverse(LFUNode node)
	{
		LFUNode prev =null;
		LFUNode current = node;
		LFUNode next = null;
		while(current!=null)
		{
			next = current.next;
			current.next=prev;
			prev =current;
			current=next;
			
		}
	}
}
public class LFU {
	
	public static void main(String[] args)
	{
		LFU lfu = new LFU(3);
		lfu.put(1, 1);
		lfu.put(1, 2);
		lfu.put(2, 2);
		lfu.put(3, 3);
//		System.out.println(lfu.get(1));
//		lfu.put(4, 4);
//		System.out.println(lfu.get(1));
//		System.out.println(lfu.get(2));
//		System.out.println(lfu.keyValueMap);
//		System.out.println(lfu.list);
		List ls = new List();

//		lfu.reverse()
		
	}
	Map<Integer,LFUNode> keyValueMap;
	Map<Integer,List> list;
	int size;
	int capacity;
	int min=-1;
	LFU(int capacity)
	{
		this.capacity=capacity;
		keyValueMap = new HashMap<>();
		list = new HashMap<>();
		size=0;
		
	}
	Integer get(Integer key)
	{
		if(!keyValueMap.containsKey(key)) return -1;
		LFUNode node = keyValueMap.get(key);
		int freq = node.frequency;
		node.frequency++;
		keyValueMap.put(key, node);
		// remove node from existing counter list
		List ls = list.get(freq);
		if(ls!=null)ls.deleteNode(node);
		if(ls!=null && ls.size==0) list.remove(freq); 
		// add it to the new counter list;
		if(!list.containsKey(node.frequency)) list.put(node.frequency, new List());
		list.get(node.frequency).addNode(node);
		// update min
		if(min==freq && list.get(freq)==null) min=node.frequency;				
		return keyValueMap.get(key).value;
	}
	void put(Integer key , Integer value)
	{
		if(keyValueMap.containsKey(key))
		{
			LFUNode node = keyValueMap.get(key);
			int freq =node.frequency;
			List ls = list.get(freq);
			ls.deleteNode(node);
			LFUNode newNode = new LFUNode(key,value);
//			newNode.frequency= freq+1;
			ls.addNode(newNode);			
			keyValueMap.put(key, newNode);
			get(key);
		}
		if(size >=capacity)
		{
			LFUNode node = keyValueMap.get(min);
			keyValueMap.remove(min);
			List ls = list.get(node.frequency);
			ls.deleteNode(node);
		}
		if(!keyValueMap.containsKey(key))
		{
			LFUNode node = new LFUNode(key,value);
			min=1;
			keyValueMap.put(key, node);
			List ls = list.get(min);
			if(ls==null) ls = new List();
			ls.addNode(node);
			list.put(min,ls);
			size++;
		}
		
	}
	
	

}
