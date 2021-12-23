package myplayarea;

public class BST {
	
	class Node{
		Node rightNode;
		Node leftNode;
		int content;
		Node(int content)
		{
			this.content=content;
			rightNode = leftNode = null;
		}
	}
	
	Node root;
	BST(int rootValue)
	{
		this.root = new Node(rootValue);
	}
	
	Node addNode(int value,Node root)
	{
		
		if(root == null)
		{
			root = new Node(value);
		}
		if( value > root.content )
		{	
			
			root.rightNode=addNode(value,root.rightNode);
		}
		else if(value < root.content)
		{
			
			root.leftNode=addNode(value,root.leftNode);
		}
		
		return root;
		
	}
	
	Node deleteNode(Node root,int value)
	{
		if(root == null)
		{
			return null;
		}
		if(value > root.content)
		{
			root.rightNode = deleteNode(root.rightNode,value);
		}
		if(value < root.content)
		{
			root.leftNode = deleteNode(root.leftNode,value);
		}
		else {
			if(root.leftNode == null)
			{
				return root.rightNode;
			}
			else if(root.rightNode == null)
			{
				return root.leftNode;
			}
			
			root.content = minValue(root.rightNode);
			
			root.rightNode = deleteNode(root.rightNode,root.content);
		}
		return root;
	}
	
	int minValue(Node root)
	{
		int minValue = root.content;
		if(root.leftNode !=null)
		{
			minValue = root.leftNode.content;
			root = root.leftNode;
		}
		return minValue;
	}
	

}
