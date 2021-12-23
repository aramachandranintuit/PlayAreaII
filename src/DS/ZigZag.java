package DS;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import org.omg.CORBA.portable.ValueBase;

import DS.AVLTree.Node;

public class ZigZag {
	
	public static void main(String[] args)
	{
		ZigZag tree = new ZigZag();
		tree.addNode(100);
		System.out.println(tree.root.value);
		tree.addNode(150);
		tree.addNode(160);
		tree.addNode(140);
		tree.addNode(40);
		tree.addNode(50);
		tree.addNode(30);
//		System.out.println("root . leftNode . "+tree.root.value);
//		System.out.println("root . leftNode . "+tree.root.leftNode.value);
//		System.out.println("root . rightNode . "+tree.root.rightNode.value);
//		System.out.println("root . leftNode  . leftNode "+ tree.root.leftNode.leftNode.value);
//		System.out.println("root . leftNode  . rightNode . "+ tree.root.leftNode.rightNode.value);
		
		System.out.println("===========================");
//		tree.printBFS(tree.root);
		List<Integer> level2List= tree.printALevel(tree.root,2);
//		System.out.println(level2List.get(0));
//		System.out.println(level2List.get(1));
//		System.out.println(level2List.get(3));
//		System.out.println(level2List.get(4));
		
		printBFS(tree.root);
		
	}
	
	private static void printBFS(Node root)
	{
		Deque<Node> queue = new LinkedList<Node>();
		queue.add(root);
//		System.out.println(root.value);
		boolean flag = true;
		int i =0;
		while(queue.size()!=0)
		{
			
			Node node  = queue.remove();
			if(node!=null)
			{
				i++;
				System.out.println(node.value);
				if(flag)
				{
					queue.add(node.leftNode);
					queue.add(node.rightNode);
				}
				else
				{
					queue.add(node.rightNode);
					queue.add(node.leftNode);
					
					
				}				
			}
			else
			{
				i++;
			}
			if(!isPowerOf2(i) && i%2==0)
			{
			flag = !flag;
			}
		}
	}

	private List<Integer> printALevel(Node root , int level)
	{
		int startIndex = (int)Math.pow(2, level-1);
		int endIndex = startIndex + (int)Math.pow(2, level);
		List<Integer> nodeList = new ArrayList<Integer>();
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		int i=1;
		while(queue.size()>0)
		{
			Node node = queue.remove();
			
			if(node!=null)
			{
				Node leftNode = node.leftNode;
				Node rightNode = node.rightNode;
				if(i>startIndex && i<=endIndex)
				{
					nodeList.add( Integer.valueOf(node.value));
				}
				queue.add(node.leftNode);
				queue.add(node.rightNode);				
				i=i+2;
				
			}
			else
			{
				i=i+2;
				
			}
			
		}
		return nodeList;	
	}
	
	static boolean  isPowerOf2(int n)
	{
		for(int i =0;i<2;i++)
		{
			if ( n == (int)Math.pow(2, i))
				return true;
		}
		return false;
	}
	
	public  void printNodeValues(Node node)
	{
		
			System.out.println(node.rightNode.value);
			System.out.println(node.leftNode.value);
	}

	
	class Node
	{
		
		Node rightNode;
		Node leftNode;
		int value;
		Node(int value)
		{
			this.value=value;
			this.leftNode = this.rightNode = null;
		}
		@Override
		public int hashCode()
		{
			return Integer.valueOf(this.value).hashCode();
		}
		
		@Override
		public boolean equals(Object o)
		{
			if(!(o instanceof Node))
					return false;
			else if(((Node)o).value == (this.value))
				return true;
			else
				return false;
			
		}
	}
	
	Node root ;
	
	
	public Node addNode(int value)
	{
		return addNode(value,this.root);
	}
	
	private Node addNode(int value , Node node)
	{
		if(node == null)
		{
			Node newNode = new Node(value);
			if(root == null)
			{
				root=newNode;
				return root;
			}
			else
				return newNode;
		}
		else if(value <= node.value)
			node.leftNode = addNode(value,node.leftNode);
		else
			node.rightNode = addNode(value,node.rightNode);
		
		return node;
		
	}
}
