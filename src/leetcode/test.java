package leetcode;

import java.util.Stack;

class tree
{
	
	public void inOrder(Node root)
	{
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		while(root!=null || stack.size()>0)
		{
			while(root!=null)
			{
				stack.push(root);
				root=root.left;
			}
			stack.pop();
			root=root.right;
		}
		
	}
	
	
	class Node
	{
		Node left;
		Node right;
		int val;
		Node(int val)
		{
			this.val = val;
			left=right=null;
		}
	}
	Node root;
	
	public Node addNode(int val)
	{
		return addNode(val, root);
	}
	
	private Node addNode(int val , Node node)
	{
		
		if(root== null)
		{
			Node newNode = new Node(val);
			root=newNode;	
			return root;
		}
		else if(node == null)
		{
			node = new Node(val);
			return node;
		}
		else if(val > node.val)
		{
			node.right = addNode(val,node.right);
			
		}
		else if(val < node.val)
		{
			node.left = addNode(val,node.left);

		}
		return node;
		
	}
	
}
public class test {
	public static void main(String[] args)
	{
		tree  t = new tree();
		t.addNode(100);
		t.addNode(300);
		t.addNode(200);
		t.addNode(90);
		t.addNode(80);
		System.out.println("root" + t.root.val);
		System.out.println("left" + t.root.left.val);
		System.out.println("right" + t.root.right.val);
		System.out.println("right.left" + t.root.right.left.val);
		System.out.println("left.left" + t.root.left.left.val);
	}

}