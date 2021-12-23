package DS;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AVLTree {
	
	class Node implements Comparable<Node>
	{
		Node rightNode;
		Node leftNode;
		int value;
		
		Node(int value)
		{
			this.value = value;
			this.leftNode = this.rightNode = null;
		}
		
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
	
	Node root;
	
	public List<Integer> nthSmallestNode(int k,Node node,List<Integer> values)
	{
		if(node!=null)
		{
				if(node.leftNode!=null)
				{
					nthSmallestNode(k,node.leftNode,values);
				}
				if(values.size()==k)
					return values;
				values.add(node.value);
				if(node.rightNode!=null)
				{
				 nthSmallestNode(k,node.rightNode,values);
				}
		}
		
		return values;
	}
	
	public static void inOrder(Node node)
	{
		Stack<Node> stack = new Stack<Node>();
		while(stack.size()!=0 )
		{				
			while(node!=null)
			{
				stack.add(node);
				node=node.leftNode;
			}
			node =stack.pop();
			
			System.out.println(node.value);
			node=node.rightNode;
			
		}
	}
	
	public static void preOrder(Node node)
	{
		Stack<Node> stack = new Stack<Node>();
		stack.add(node);
		while(stack.size()!=0)
		{
			node = stack.pop();
			if(node!=null)
				System.out.println(node.value);
			Node right = node.rightNode;
			if(right!=null)
			{
				stack.add(right);
				
			}
			if(node.leftNode!=null)
			{
				node=node.leftNode;
				stack.add(node);
				
			}
		}
	}

	public Node addNode(int value,Node node)
	{
		if(this.root== null)
		{
			root = new Node(value);
			return root;
		}
		if(node == null)
		{
			return new Node(value);
		}
		else if(value < node.value)
		{
			node.leftNode= addNode(value,node.leftNode);
		}
		else
		{
			node.rightNode = addNode(value,node.rightNode);
		}
		return node;
	}
	
	public int height(Node node)
	{
		if(node == null)
		{
			return 0;
		}
		else 
		{
			return 1 + Math.max(height(node.leftNode), height(node.rightNode));
		}
	}
	
	public int checkImBalance(Node node)
	{
		if(node !=null)
		{
			int leftNodeHeight = height(node.leftNode);
			int rightNodeHeight = height(node.rightNode);
			return leftNodeHeight - rightNodeHeight;
		}
		return 0;
	}
	
	public Node rightRotate(Node node)
	{
		Node pivot = node.leftNode;
		Node t2 = pivot.rightNode;
		pivot.rightNode = node;
		node.leftNode = t2;
		return pivot;	
	}
	
	public Node leftRotate(Node node)
	{
		Node pivot = node.rightNode;
		Node t2 = pivot.leftNode;
		pivot.leftNode = node;
		node.rightNode = t2;
		return pivot;
	}
	
	public static void main(String[] args)
	{
		AVLTree tree = new AVLTree();
		Node root = tree.addNode(100, null);
		Node leftChild = tree.addNode(50, root);
		Node rightChild = tree.addNode(150, root);
		Node left_left_child = tree.addNode(30, leftChild);
		Node left_left__left_child = tree.addNode(20, left_left_child);
		System.out.println("root . leftNode . "+root.leftNode.value);
		System.out.println("root . rightNode . "+root.rightNode.value);
		System.out.println("root . leftNode  . leftNode "+ root.leftNode.leftNode.value);
		System.out.println("root . leftNode  . leftNode . leftNode"+ root.leftNode.leftNode.leftNode.value);
		/*
		 * 			100
		 *		50		150
		 *	 30	
		 * 20
		 */
		System.out.println("height --> "+ tree.height(root));
		System.out.println("is there imbalance -->" + tree.checkImBalance(root));
		System.out.println("root.left balance -->" + tree.checkImBalance(root.leftNode));
//		Node newRoot = tree.rightRotate(root);
//		System.out.println("after rotation;new root -- >" + newRoot.value);
//		System.out.println("root.leftNode ---> " + newRoot.leftNode.value);
//		System.out.println("root.rightNode ---> " + newRoot.rightNode.value);
//		System.out.println("root.leftNode.leftNode ---> " + newRoot.leftNode.leftNode.value);
//		System.out.println("root.rightNode.rightNode ---> " + newRoot.rightNode.rightNode.value);
//		System.out.println("new height --> "+ tree.height(newRoot));
//		System.out.println("is there imbalance -->" + tree.checkImBalance(newRoot));
		System.out.println("the 1 smallest number is"+ tree.nthSmallestNode(5,root,new ArrayList<Integer>()));
//		inOrder(root);
		preOrder(root);
	}

}
