package leetcode;

/*
 * program to return the sum of the nodes for even valued grandchildren
 */

 class TNode
 {
	 int value;
	 TNode leftChild;
	 TNode rightChild;
	 
	 TNode(int value)
	 {
		 this.value = value;
		 this.leftChild = rightChild = null;			 
	 }
	 
	 
 }
 
 public class SumOfGrandchildren {
	
	TNode addNode(int value,TNode root)
	{
		TNode  newNode = new TNode(value);
		if(root == null)
		{
			root = newNode;
		}
		else if(value <= root.value)
		{
			root.leftChild = addNode(value,root.leftChild);
		}
		else if(value > root.value)
		{
			root.rightChild = addNode(value,root.rightChild);
		}
		return root;
	}
	
	public static void main(String[] args)
	{
		SumOfGrandchildren tree = new SumOfGrandchildren();
		TNode root = tree.addNode(100, null);
		tree.addNode(11, root);
		tree.addNode(10, root);
		tree.addNode(90, root);
		tree.addNode(200, root);
		tree.addNode(300, root);
		System.out.println(root.leftChild.rightChild.value);
		System.out.println(tree.treeTraversal(root,0));
		
	}
	
	private int treeTraversal(TNode root,int s)
	{
		if(root!=null)
		{
			if(root.value%2==0)
			{
				s= findSum(root.leftChild) +findSum(root.rightChild);
			}
			treeTraversal(root.leftChild,s);
			treeTraversal(root.rightChild,s);
			return s;
		}
		return 0;
	}
	
	
	int findSum(TNode node)
	{
		if(node!=null)
		{
			int sum =0;
			if(node.leftChild!=null && node.rightChild!=null)
			{
				 sum = node.leftChild.value + node.rightChild.value;
			}
			else if (node.leftChild!=null)
			{
				sum = node.leftChild.value;
			}
			else if(node.rightChild!=null)
			{
				sum = node.rightChild.value;
			}
			return sum;
			}
		return 0;	
	}
	

}
