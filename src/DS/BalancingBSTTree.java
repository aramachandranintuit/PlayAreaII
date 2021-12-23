package DS;

public class BalancingBSTTree {
	
	class Node {
		int value;
		Node leftChild;
		Node rightChild;
		
		Node(int value)
		{
			this.value = value;
			this.leftChild = this.rightChild = null;
		}
		
	}
	
	
	Node addNode(int value , Node root)
	{
		if(root==null)
		{
			Node newNode = new Node(value);
			root = newNode;
		}
		else if(value > root.value)
		{
			root.rightChild = addNode(value,root.rightChild);
		}
		else if(value<=root.value)
		{
			root.leftChild = addNode(value,root.leftChild);
		}
		
		int height = checkBalance(root);
		
		return root;
	}
	
	private int checkBalance(Node root)
	{
		return height(root.leftChild) - height(root.rightChild);
		
	}
	
	private Node rotateRight(Node root)
	{
		Node pivot = root.leftChild;
		root.leftChild = pivot.rightChild;
		pivot.rightChild = root;
		return pivot;
	}
	
	private Node rotateLeft(Node root)
	{
		Node pivot = root.rightChild;
		root.rightChild = pivot.leftChild;
		pivot.leftChild = root;
		return pivot;
	}
	
	private int height(Node root)
	{
		if(root!=null)
		{
			return 1 + (Math.max(height(root.leftChild),height(root.rightChild)));
		}
		return -1;
	}
	
	public static void main(String[] args)
	{
		BalancingBSTTree tree = new BalancingBSTTree();
		BalancingBSTTree.Node root  = tree.addNode(100, null);
		tree.addNode(110, root);
		tree.addNode(120, root);
		System.out.println(root.value);
		System.out.println(" " +root.rightChild.value);
		System.out.println("  " + root.rightChild.rightChild.value);
		System.out.println(tree.height(root));
		System.out.println(tree.checkBalance(root));
		root=tree.rotateLeft(root);
//		root= tree.rotateLeft(root);
		System.out.println(root.value);
		System.out.println(root.leftChild.value);
		System.out.println(root.rightChild.value);
		
	}
	

}
