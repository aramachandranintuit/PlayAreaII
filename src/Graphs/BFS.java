package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node
{
	int val;
	List<Node> neighbours;
	Node(int val)
	{
		this.val=val;
	}
}

class edge
{
	Node source;
	Node dest;
	int weight;
}
class Graph
{
	List<Node> nodes;
	List<edge> edges;
	public Graph(List<Node> nodes ,List<edge> edges)
	{
		this.nodes=nodes ;
		this.edges=edges;
	}
	
	
}
public class BFS {
	public static void main(String[] args)
	{
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		edge e1 = new edge();
		e1.source = node1;
		e1.dest = node2;
		edge e2 = new edge();
		e2.source = node2;
		e2.dest=node3;
		edge e3 = new edge();
		e3.source=node3;
		e3.dest=node4;
		edge e4 = new edge();
		e4.source=node4;
		e4.dest=node1;
		
		List<edge> edgeList = new ArrayList<edge>();
		edgeList.add(e1);
		edgeList.add(e2);
		edgeList.add(e3);
		
		List<Node> nodeList = new ArrayList<Node>();
		nodeList.add(node1);
		nodeList.add(node2);
		nodeList.add(node3);
		nodeList.add(node4);
		
		List<Node> node1_neighbour = new ArrayList<Node>();
		node1_neighbour.add(node2);
		node1.neighbours =node1_neighbour;
		
		List<Node> node2_neighbour = new ArrayList<Node>();
		node2_neighbour.add(node3);
		node2.neighbours =node2_neighbour;
		
		List<Node> node3_neighbour = new ArrayList<Node>();
		node3_neighbour.add(node4);
		node3.neighbours =node3_neighbour;
		
		List<Node> node4_neighbour = new ArrayList<Node>();
		node4_neighbour.add(node1);
		node4.neighbours =node4_neighbour;
		Graph g = new Graph(nodeList,edgeList);
		BFSUtil(g);
		
	}
	
	public static void BFSUtil(Graph g)
	{
		Queue<Node> q = new LinkedList<Node>();
		List<Node> nodeList= g.nodes;
		q.add(nodeList.get(0));
		HashMap<Node,Boolean> map  = new HashMap<Node, Boolean>();
		while(!q.isEmpty())
		{
			Node n = q.poll();
			map.put(n, true);
			if(n!=null) System.out.println(n.val);
			List<Node> neighbours = n.neighbours;
			if(neighbours==null) return;
			for(Node node : neighbours)
			{
				if(!map.containsKey(node))q.add(node);
			}
		}
	}
	
	public static Node CopyGraphUtil(Graph g)
	{
		Queue<Node> q = new LinkedList<Node>();
		List<Node> nodeList= g.nodes;
		Node root = new Node(nodeList.get(0).val);
		q.add(nodeList.get(0));
		HashMap<Node,Node> map = new HashMap<Node,Node>();
		map.put(nodeList.get(0),root);
		System.out.println(root.val);
		while(!q.isEmpty())
		{
			Node n = q.poll();
			if(map.get(n)==null)
			{
				Node newNode = new Node(n.val);
				map.put(n,newNode);
			}
		}
	}
	
	

}
