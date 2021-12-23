package November;

class Node
{
	int val;
	Node leftNode;
	Node rightNode;
	Node(int val)
	{
		this.val = val;
		this.leftNode = this.rightNode = null;
	}
}

public class SumOfATree {
	public int sumOfATree(Node root,int sum)
	{
		if(root!=null)
		{
			sum = sumOfATree(root.leftNode,sum);
			sum = sumOfATree(root.rightNode,sum);
			if(root.rightNode!=null)
			{
				sum+=root.rightNode.val;
			}
			if(root.leftNode!=null)
			{
				sum+=root.leftNode.val;
			}
			
		}
		return sum;	
	}
	
	public Node addNode(int val,Node root)
	{
		if(root==null)
		{
			Node newNode = new Node(val);
			root=newNode;
		}
		else if(root.val >= val)
		{
			root.leftNode = addNode(val, root.leftNode);
		}
		else if(root.val < val)
		{
			root.rightNode = addNode(val, root.rightNode);
		}
		return root;	
	}
	
	public static void main(String[] args)
	{
		SumOfATree sa = new SumOfATree();
		Node root = sa.addNode(4, null);
		sa.addNode(2, root);
		sa.addNode(3, root);
		sa.addNode(5, root);
		sa.addNode(3, root);
		sa.addNode(6, root);
		sa.addNode(9, root);
		sa.addNode(7, root);
		System.out.println(sa.sumOfATree(root.rightNode,0));
		System.out.println(sa.sumOfATree(root.leftNode,0));
	}
}
