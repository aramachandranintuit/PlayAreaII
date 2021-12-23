package feb;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/*
 *   get(int key)
 *   {
 *   }
 * 
 * 
 * 
 */

class Node
{
	int key ;
	int val;
	int freq;
	Node nextNode;
	Node preNode;
	Node(int key , int val)
	{
		this.key=key;
		this.val=val;
		this.freq=1;
	}
}

class DLL
{
	
	Node head;
	Node tail;
	Node addNode(Node node)
	{
		if(head==null) {
			head = node;
			tail = head;
		}
		else
		{
			tail.nextNode = node;
			tail = node;
		}
		return head;
	}
	
	void removeNode(Node node)
	{
		if(node==tail) tail = node.preNode;
		else
		{
			node.preNode.nextNode = node.nextNode;
			node.nextNode.preNode = node.preNode;
		}
	}
}

public class LFU {
	
	Map<Integer,Node> keyValMap = new ConcurrentHashMap<Integer,Node>();
	Map<Integer,DLL> frequencyKeyListMap = new ConcurrentHashMap<Integer,DLL>();
	int capacity =0;
	
	public LFU(int capacity)
	{
		this.capacity=capacity;
	}
	
	public static void main(String[] args)
	{
		
	}
	
	public int get(Integer key)
	{
		if(!keyValMap.containsKey(key)) return -1;
		/*
		 * if keyValMap containskey 
		 *  get Node,update freq and put the node in the keyValMap
		 * remove node from the existing freq list map (remove entry  if the list is empty)
		 * put the node in the update freq list
		 * 
		 */
		
		
	}
	
	public void put(int key,int val)
	{
		/*
		 * if(keyValues map size<capacity)
		 * {
		 * put(key,new Node(val)) with freq =1
		 * add node to the freq 1 list , if list is empty create a new list and then add the node
		 * else
		 * if 
		 * 
		 */
	}

}
