package april;


/* the question is to find the inorder successor .
 * The inorder is a tree traversal order where 
 * 
 */

class Node
{
	int val;
	Node leftNode;
	Node rightNode;
	Node parent;
	Node(int val)
	{
		this.val = val;
	}
}

class Tree
{
	
	Node addNode(int val,Node root)
	{
		if(root==null) root=new Node(val);
		else if(val > root.val) {
			root.rightNode = addNode(val,root.rightNode);
			root.rightNode.parent = root;
		}
		else {
			root.leftNode = addNode(val,root.leftNode);
			root.leftNode.parent=root;
		}
		return root;
	}
	
	void inOrder(Node root)
	{
		if(root!=null)
		{
			inOrder(root.leftNode);
			System.out.println(root.val);
			inOrder(root.rightNode);
		}
	}
	void inOrderSuccessor(Node node)
	{
		if(node!=null)
		{
			if(node.rightNode!=null)
				System.out.println(node.rightNode.val);
			else {	
			Node parent = node.parent;
			while(parent.val <= node.val)
			{
				parent =parent.parent;
			}
			System.out.println(parent.val);
			}
		}
	}
}
public class InOrderSuccessor {
	public static void main(String[] args)
	{
		Tree tree = new Tree();
		Node root = tree.addNode(100, null);
		tree.addNode(500, root);
		tree.addNode(50, root);
		tree.addNode(30, root);
		tree.addNode(40, root);
		tree.addNode(400, root);
//		tree.inOrder(root);
		tree.inOrderSuccessor(root.leftNode.leftNode);;

	}

}
