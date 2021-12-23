package November;

class TreeNode
{
	int val;
	TreeNode right;
	TreeNode left;
}

public class DeleteANodeFromABST {

	public static void main(String[] args)
	{
		
	}
	
	public static TreeNode deleteNode(TreeNode root , int key)
	{
		if(root==null) return  null;
		if(key > root.val) {
			root.right = deleteNode(root.right,key);
			return root;
		}
		else if(key < root.val)
		{
			root.left = deleteNode(root.left,key);
			return root;
					
		}
		else 
		{
			if(root.right==null) root= root.left;
			else if(root.left==null) root=root.right;
			else 
			{
				TreeNode temp = root.right;
				while(temp.left!=null)
				{
					temp=temp.left;
				}
				root.val = temp.val;
				root.right=deleteNode(root.right,temp.val);
				
			}
			return root;
		}
	}
}
