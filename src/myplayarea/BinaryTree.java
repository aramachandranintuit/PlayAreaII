package myplayarea;

import java.util.ArrayList;

public class BinaryTree {
	public static void main(String[] args)
	{
		Nodes root = new Nodes();
		Nodes l1Node = new Nodes();
		Nodes r1Node = new Nodes();
		Nodes l1l2Node = new Nodes();
		Nodes r1r2Node = new Nodes();
		
		
		root.leftNode = l1Node;
		root.rightNode = r1Node;
		l1Node.leftNode = l1l2Node;
		l1Node.rightNode = r1r2Node;
		
		
		root.value =1;
		l1Node.value = 2;
		r1Node.value = 3;
		l1l2Node.value = 4;
		r1r2Node.value = 5;
		
		ArrayList<Nodes> inOrder = new BinaryTree().inOrder(root,new ArrayList<Nodes>());
		for(int i=0;i<inOrder.size();i++)
		{
			System.out.println("INORDER -- >  " + inOrder.get(i).value);
			
		}
		
		System.out.println("=======================");
		
		ArrayList<Nodes> preOrder = new BinaryTree().preOrder(root,new ArrayList<Nodes>());
		for(int i=0;i<preOrder.size();i++)
		{
			System.out.println("PREORDER -- >  " + preOrder.get(i).value);
			
		}
		System.out.println("=======================");
		
		ArrayList<Nodes> postOrder = new BinaryTree().postOrder(root,new ArrayList<Nodes>());
		for(int i=0;i<postOrder.size();i++)
		{
			System.out.println("POSTORDER -- >  " + postOrder.get(i).value);
			
		}
		
	}
	
	
	private ArrayList<Nodes> postOrder(Nodes node , ArrayList<Nodes> nodes)
	{
		if(node!=null)
		{
			
			postOrder(node.leftNode,nodes);
			postOrder(node.rightNode,nodes);
			nodes.add(node);
			return nodes;
		}
		else
		{
			return nodes;
		}
		
	}
	
	private ArrayList<Nodes> preOrder(Nodes node , ArrayList<Nodes> nodes)
	{
		if(node!=null)
		{
			nodes.add(node);
			preOrder(node.leftNode,nodes);
			preOrder(node.rightNode,nodes);
			return nodes;
		}
		else
		{
			return nodes;
		}
		
	}
	
	private ArrayList<Nodes> inOrder(Nodes node,ArrayList<Nodes> nodes)
	{
		if(node!=null)
		{
			inOrder(node.leftNode,nodes);
		nodes.add(node);
		inOrder(node.rightNode,nodes);
		return nodes;
		}
		else
		{
			return nodes;
		}
		
		
	}

}
