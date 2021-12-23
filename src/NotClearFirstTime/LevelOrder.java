package NotClearFirstTime;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node
{
	Node left;
	Node right;
	int val;
	Node(int val)
	{
		this.val=val;
		left=right=null;
	}
}

class Tree
{
	
	Node addNode(int val,Node root)
	{
		if(root==null)
		{
			root = new Node(val);
		}
		else if(val > root.val)
		{
			root.right=addNode(val,root.right);
		}
		else 
		{
			root.left = addNode(val,root.left);
		}
		return root;
			
	}
}

public class LevelOrder {
	
	public static void main(String[] args)
	{
//		[-100,-200,-300,-20,-5,-10,null]
		Tree t = new Tree();
		Node root = t.addNode(-5, null);
		t.addNode(-200, root);
		t.addNode(-300, root);
		t.addNode(-20, root);
		t.addNode(-100, root);
		t.addNode(-10, root);
		t.addNode(0, root);
//		System.out.println(root.left.val);
//		System.out.println(root.right.val);
//		System.out.println(root.right.right.val);
//		List<Integer> list = breadthFirstSearch(root);
//		System.out.println(list);
//		System.out.println(LevelBasedTraversal(root));
		System.out.println(maxLevelSum(root));
	}
	
	public static List<Integer> breadthFirstSearch(Node root)
	{
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		List<Integer> list= new ArrayList<Integer>();
		list.add(root.val);
		while(q.size()>0)
		{
			Node node = q.poll();
			if(node!=null)
			{						
				if(node.left!=null)
				{
					q.add(node.left);
					list.add(node.left.val);					
				}
				if(node.right!=null)
				{
					q.add(node.right);
					list.add(node.right.val);
				}
			}			
		}
		
		return list;
		
	}
	
	public static List<List<Integer>> LevelBasedTraversal(Node root)
	{
		List<List<Integer>> aList = new ArrayList<List<Integer>>();
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		List<Integer> list = new ArrayList<Integer>();
		list.add(root.val);
		aList.add(list);
		boolean flag = false;
		while(q.size()>0)
		{
			int size = q.size();
			list = new ArrayList<Integer>();
			for(int i=0;i<size;i++)
			{				
				Node node = q.poll();
				if(node!=null && flag)
				{
					q.add(node.left);
					q.add(node.right);
					if(node.left!=null) list.add(node.left.val);
					if(node.right!=null) list.add(node.right.val);
				}				
				else if(node!=null && !flag)
				{
					q.add(node.right);
					q.add(node.left);
					if(node.right!=null) list.add(node.right.val);
					if(node.left!=null) list.add(node.left.val);					
				}
			}
			flag = !flag;
			if(list.size()>0)aList.add(list);
		}
		return aList;
	}
	
	public static int maxLevelSum(Node root)
	{
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		int sum=0;
		int r=Integer.MIN_VALUE;
		int level=1;
		int res=0;
		while(!q.isEmpty())
		{
			int size=q.size();
			sum=0;
			for(int i=0;i<size;i++)
			{
				Node node = q.poll();
				if(node!=null && node.left!=null)
					sum+=node.left.val;
				if(node!=null && node.left!=null)
					sum+=node.right.val;				
			}
			level++;
			if(sum>r)
			{
				r=sum;
				res=level;
			}	
		}
		return res;
	}
	
	public static boolean isEndOfALevel(int i)
	{
		for(int j=0;(int)Math.pow(2, j)<=i;j++)
		{
			if(i==(int)Math.pow(2, j)) return true;
		}
		return false;
	}
	public static int getHeight(Node root)
	{
		if(root==null)return 0;
		return 1+ Math.max(getHeight(root.left),getHeight(root.right));
		
	}
	

}
