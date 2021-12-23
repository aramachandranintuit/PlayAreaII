package quizAmz;

import java.util.ArrayList;
import java.util.List;

public class NodesAtaDistanceOfKFromRoot {
	
	class Node
	{
		Integer key;
		Node leftNode;
		Node rightNode;
		
		
		Node(int value)
		{
			this.key = value;
			this.leftNode = null;
			this.rightNode = null ;
		}
		public int hashcode()
		{
			return this.key.hashCode();
		}
		
		public boolean equals(Object a)
		{
			if(a instanceof Node)
			{
				if(((Node)a).key == this.key && ((Node)a).leftNode == this.leftNode && ((Node)a).rightNode == this.rightNode )
					return true;
			}
			return false;
		}
	}
	
	Node root =null;
	public Node addNode(Node node,int value)
	{
		if(root ==null )
		{
			root = new Node(value);
			return root;
		}
		if(node == null)
		{
			return new Node(value);
		}
		else if(node.key > value)
		{
			node.leftNode = addNode(node.leftNode ,value);
		}
		else if(node.key < value)
		{
			node.rightNode=addNode(node.rightNode ,value);
		}
		else if (node.key == value)
		{
			return node;
		}
		
		return node;
	}
	
	public List<Node> nodesInaDepth(Node node,int depth,int currentDepth,List<Node> nodeList)
	{
//		List<Node> nodeList = new ArrayList<Node>();
		if(depth==1)
		{
			nodeList.add(this.root);
			return nodeList;
		}
		else if(currentDepth == depth -1)
		{
			nodeList.add(node.leftNode);
			nodeList.add(node.rightNode);
		}
		else if( node != null)
		{
			currentDepth ++;
			 nodesInaDepth(node.leftNode,depth,currentDepth,nodeList);
			 nodesInaDepth(node.rightNode,depth,currentDepth,nodeList);
			 
		}
		
		return nodeList;
	}
	
	public static void main(String[] args)
	{
		NodesAtaDistanceOfKFromRoot tree = new NodesAtaDistanceOfKFromRoot();
		Node root = tree.addNode(null, 100);
		Node leftChild1 = tree.addNode(root,50);
		Node rightChild1 = tree.addNode(root,150);
		Node rightChild2 = tree.addNode(root,160);
		Node leftChild2 = tree.addNode(root,40);
		List<Node> nodesInDepth2 = tree.nodesInaDepth(root, 3,1,new ArrayList<Node>());
		for(Node node : nodesInDepth2)
		{
			if(node !=null)
				System.out.println(node.key);
		}
		
	}

}
