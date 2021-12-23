package DS;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class PreOrderTraversal {
	
	class TreeNode
	{
		int val;
		TreeNode leftNode;
		TreeNode rightNode;
		
		TreeNode(int val)
		{
			this.val = val;
			this.leftNode = this.rightNode = null;
		}
	}
	
	
	public static void main(String[] args)
	{
		System.out.println(new PreOrderTraversal().getTreeNode().val);
		System.out.println(new PreOrderTraversal().getTreeNode().rightNode.val);
		System.out.println(new PreOrderTraversal().getTreeNode().leftNode.val);
	}
	
	private  TreeNode getTreeNode()
	{
		LinkedHashMap <Integer,TreeNode> map = new LinkedHashMap<Integer, TreeNode>();
		String str = "1-2--3--4-5--6--7";
		for(int i=0;i<str.length();i++)
		{	TreeNode newNode= null;
			if(Character.isDigit(str.charAt(i)))
			{
				newNode = new PreOrderTraversal().new TreeNode(Character.getNumericValue(str.charAt(i)));
				int level = getNumberOfDashesBefore(i,str);
				if(!map.containsKey(level))
				{
					map.put(level, newNode);
					if(level>0)
					{
						TreeNode parentNode = map.get(level-1);
						parentNode.leftNode = newNode;
					}
					
				}
				else if(map.containsKey(level))
				{
					TreeNode parentNode = map.get(level-1);
					parentNode.rightNode = newNode;
				}
					
				}	
		}
		return map.get(0);
	}
	
	private static int getNumberOfDashesBefore(int index , String str)
	{
		int k=0;
		for(int i=index-1;i>=0;i--)
		{
			if(str.charAt(i)=='-')
				k++;
			else 
				return k;
		}
		return k;
	}
	
	
		


}
