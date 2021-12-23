package December;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class node
{
	String name;
	node(String name)
	{
		this.name =name;
	}
}
class edges
{
	node fVertex;
	node tVertex;
	edges(node fVertex,node tVertex)
	{
		this.fVertex=fVertex;
		this.tVertex=tVertex;
	}
}	

class graphNode
{
	List<graphNode> neighbours;
	int val;
	graphNode(int val)
	{
		this.val=val;
		this.neighbours = neighbours;
	}
}

public class graph {
//	List<edges> edges;
//	List<node> nodes;
//	
//	graph(List<edges> edges ,List<node> nodes)
//	{
//		this.edges=edges;
//		this.nodes=nodes;
//	}
	List<graphNode> list ;
	public static void main(String[] args)
	{
		graphNode g1 = new graphNode(1);
		List<graphNode> list1 = new ArrayList<graphNode>();		
		graphNode g2 = new graphNode(2);
		List<graphNode> list2 = new ArrayList<graphNode>();
		graphNode g3 = new graphNode(3);		
		list1.add(g2);
		list2.add(g3);
		g1.neighbours=list1;
		g2.neighbours=list2;
		System.out.println(g1.neighbours.get(0).val);	
	}
	
	public static void clone(graphNode g)
	{
		HashMap<graphNode,graphNode> hm = new HashMap<graphNode,graphNode>(); 
		Queue<graphNode> q = new LinkedList<graphNode>();
		hm.put(g, new graphNode(g.val));
		q.add(g);
		while(!q.isEmpty())
		{
			graphNode clonedGraphNode = q.poll();
			List<graphNode> neighbours = clonedGraphNode.neighbours;
			for(graphNode gN: neighbours)
			{
				graphNode clonedNeighbour = hm.get(gN);
				if(clonedNeighbour==null)
				{
					clonedNeighbour = new graphNode(gN.val);
					hm.put(gN, clonedNeighbour);
				}
				
			}
		}
		
	}

}
