package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode
{
	int value;
	TreeNode leftNode;
	TreeNode rightNode;
	TreeNode(int a)
	{
		this.value=a;
		leftNode=rightNode=null;
	}
}
public class BinaryTree {
	
	
	private static void inOrder(TreeNode root)
	{
		Stack<TreeNode> stack = new Stack<TreeNode>();
		if(root!=null)
		{
			stack.push(root);
		}
		while(stack.size()>0)
		{
			TreeNode node = stack.pop();
			if(node!=null)
			{	
				stack.push(node.leftNode);
				stack.push(node);
				stack.push(node.rightNode);
				System.out.println(node.value);
			}			
		}
		return ;
	}
	
	
	
	TreeNode addNode(int value,TreeNode rootNode)
	{
		TreeNode newNode = new TreeNode(value);
		if(rootNode == null)
		{
			rootNode = newNode;
		}
		if(newNode.value < rootNode.value)
		{
			rootNode.leftNode = addNode(value,rootNode.leftNode);
		}
		if(newNode.value > rootNode.value)
		{
			rootNode.rightNode = addNode(value,rootNode.rightNode);
		}
		return rootNode;
		
	}
	
	TreeNode CloneBinaryTree(TreeNode rootNode)
	{
		TreeNode cloneNode = null;
		if(rootNode!=null)
		{
			cloneNode = new TreeNode(rootNode.value);
			cloneNode.leftNode = CloneBinaryTree(rootNode.leftNode);
			cloneNode.rightNode = CloneBinaryTree(rootNode.rightNode);
		}
		return cloneNode;
	}
	
	private int findHeight(TreeNode root)
	{
		if(root!=null)
		{
			return 1+(Math.max(findHeight(root.leftNode),findHeight(root.rightNode)));
		}
		return 0;
	}
	
	private void getAllPaths(TreeNode node,List<Integer> list,List<List<Integer>> res)
	{
		if(node==null) return ;
		if(node.leftNode!=null)
		{
			List<Integer> newList = new ArrayList<>(list);
			newList.add(node.leftNode.value);
			getAllPaths(node.leftNode,newList,res);
		}
		if(node.rightNode!=null)
		{
			List<Integer> newList = new ArrayList<>(list);
			newList.add(node.rightNode.value);
			getAllPaths(node.rightNode,newList,res);
		}
		if(node.leftNode==null && node.rightNode==null) res.add(list);
		
	}
	
	public static void main(String[] args)
	{
		TreeNode rootNode = new TreeNode(100);
		BinaryTree tree = new BinaryTree();
		tree.addNode(10, rootNode);
		tree.addNode(1000, rootNode);
		tree.addNode(90, rootNode);
		tree.addNode(10012, rootNode);
//		inOrder(rootNode);
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		list.add(rootNode.value);
		tree.getAllPaths(rootNode,list,res);
		for(List<Integer> ls : res)
		{
			System.out.println(ls);
		}
		
	}

}
