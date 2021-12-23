package Test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * depth of a b tree without recursion
 */
public class Depth_B_Tree_without_Recursion implements Iterable {
	
	List<Node> nodes;
	
	class Node  
	{
		String data;
		Node leftNode;
		Node rightNode;
		
		Node(String data)
		{
			if(data!=null)
			{
				this.data=data;
				this.leftNode=this.rightNode=null;
			}
		}

	}
	
	Node root = null;
	
	Node addNode(String data,Node node)
	{
		
		if(data!=null)
		{
			if(node!=null && root!=null)
			{
				if (node.data.hashCode() > data.hashCode())
				{
					if(node.leftNode!=null)
					{
						node.leftNode = addNode(data,node.leftNode);
					}
					else 
					{
						
						Node newNode = new Node(data);
						node.leftNode = newNode;
						nodes.add(newNode);
					}
				}
				else
				{
					if(node.rightNode!=null)
					{
						node.rightNode = addNode(data,node.rightNode);
					}
					else
					{
						Node newNode = new Node(data);
						node.rightNode = newNode;
						nodes.add(newNode);
					}
				}
			}
			else if(root== null)
			{
				this.root = new Node(data);
				nodes.add(this.root);
				return root;
			}
			return node;
		}
		return null;
	}
	
	public static void main(String[] args)
	{
		
		Depth_B_Tree_without_Recursion tree = new Depth_B_Tree_without_Recursion();
		Node root = tree.addNode("100", null);
		Node r1 = tree.addNode("200", root);
		Node l1 = tree.addNode("90", root);
		Node l2 = tree.addNode("80",root);
		Node l3 = tree.addNode("70",root);
		
		int l=0;
		Queue<Node> nodeList = new LinkedList<Node>();
		nodeList.add(root);
		while(nodeList.size()!=0)
		{
			Node node = nodeList.poll();
			if(node!=null)
			{
				l++;
				Node leftNode = node.leftNode;
				Node rightNode = node.rightNode;
				nodeList.add(leftNode);
				nodeList.add(rightNode);
			}	
			
		}
		System.out.println(totallevel(l)+1);
		
		
		
	}
	
	private static int totallevel(int totalNodes)
	{
		for(int i=1;;i++)
		{
			if( Math.pow(2, i) < totalNodes &&  Math.pow(2, i+1) > totalNodes)
			{
				return i+1;
			}
		}
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return this.nodes.iterator();
	}

}
