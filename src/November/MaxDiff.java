package November;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MaxDiff {
	
	class Node
	{
		int val;
		Node leftChild;
		Node rightChild;
		Node(int val)
		{
			this.val=val;
			rightChild=leftChild=null;
		}
		
		
	}
	
	Node addNode(int val,Node root)
	{
		if(root==null)
		{
			Node newNode = new Node(val);
			root=newNode;
		}
		else if(val> root.val)
		{
			root.rightChild = addNode(val,root.rightChild);
		}
		else if(val<=root.val)
		{
			root.leftChild = addNode(val,root.leftChild);
		}
		return root;		
	}
	
	
	public static void main(String[] args)
	{
		Node root=null;
		MaxDiff maxDiff = new MaxDiff();
		root =maxDiff.addNode(100, null);
		maxDiff.addNode(200, root);
		maxDiff.addNode(300, root);
		maxDiff.addNode(10, root);
		maxDiff.addNode(50, root);
		System.out.println(root.leftChild.rightChild.val);
		System.out.println(root.rightChild.val);
		ArrayList<Node> list = new ArrayList<Node>();		
		maxDiff.mapChildren(root, list);
		System.out.println(list.get(0).val);
		System.out.println(list.get(1).val);
		
		
	}
	
	private ArrayList<Node> mapChildren(Node root,ArrayList<Node> list)
	{			
		if(root!=null)
		{
			list.add(root.leftChild);
			list.add(root.rightChild);
			mapChildren(root.leftChild, list);
			mapChildren(root.rightChild, list);
		}
		
		return list;
		
	}
	

}
