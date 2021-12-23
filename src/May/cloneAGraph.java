package May;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class GraphNode
{
	int val;
	List<GraphNode> neighbours;
	GraphNode(int val)
	{
		this.val=val;
		neighbours = new ArrayList<GraphNode>();
	}
	
}
public class cloneAGraph {
	public static void main(String[] args)
	{
		GraphNode one = new GraphNode(1);
		GraphNode two = new GraphNode(2);
		GraphNode three = new GraphNode(3);
		GraphNode four = new GraphNode(4);
		one.neighbours.add(two);
		two.neighbours.add(three);
		three.neighbours.add(four);
		four.neighbours.add(one);
	
		GraphNode clone =cloneGraph(one,new HashMap<GraphNode,GraphNode>());
		for(GraphNode n : clone.neighbours)
		{
			System.out.println(n.val);
		}
	}
	
	public static GraphNode cloneGraph(GraphNode n,HashMap<GraphNode ,GraphNode> map)
	{
		if(map.containsKey(n)) return map.get(n);
		GraphNode newGraphNode = new GraphNode(n.val);
		map.put(n, newGraphNode);
		for(GraphNode neigh : n.neighbours)
		{
			newGraphNode.neighbours.add(cloneGraph(neigh,map));
		}
		
		return map.get(n);
	}
	
	

}
