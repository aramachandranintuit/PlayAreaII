package quizAmz;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

class Node
{
	String value;
	Integer priority;
}

public class PriorityQueue {
	
	TreeMap<Integer ,List<Node>> map = new TreeMap<Integer,List<Node>>();
	
	public void insert(Node node)
	{ 
		List<Node> nodeList = new ArrayList<Node>();
		if(!map.containsKey(node.priority))
		{
			nodeList.add(node);
			map.put(node.priority,nodeList);			
		}
		else
		{
			nodeList = map.get(node.priority);
			nodeList.add(node);
		}
		
	}
 
	 public Node getHighestPriority()
	 {
		return map.lastEntry().getValue().get(0);
		 
	 }
	 
	 public Node removeHighestPriority()
	 {
		 List<Node> nodeList = null;
		 nodeList = map.lastEntry().getValue();
		 
		 if(nodeList!=null)
			 {
				 Node node = nodeList.get(0);
				 nodeList.remove(0);
				 if(nodeList.size() == 0)
				 {
					 map.remove(node.priority);
				 }
				 return node;
			 }
		 return null;
	 }
	
	 public static void main(String[] args)
	 {
		 PriorityQueue pq = new PriorityQueue();
		 Node node = new Node();
		 node.priority =1;
		 node.value= "one";
		 pq.insert(node);
		 
		 Node node2 = new Node();
		 node2.priority=2;
		 node2.value="two";
		 pq.insert(node2);
		 
		 Node node3 = new Node();
		 node3.priority=3;
		 node3.value="three";
		 pq.insert(node3);
		 
		 Node node4 = new Node();
		 node4.priority=3;
		 node4.value="three";
		 pq.insert(node3);

		 System.out.println(pq.getHighestPriority().value);
		 System.out.println(pq.removeHighestPriority().value);
		 System.out.println(pq.removeHighestPriority().value);
		 System.out.println(pq.getHighestPriority().value);
				 
	 }
	 	 

}


















