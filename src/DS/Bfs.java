package DS;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {

	class Node {
		Node leftChild;
		Node rightChild;
		Integer value;

		public Node(int value) {
			this.value = value;
			this.leftChild = this.rightChild = null;
		}

		@Override
		public int hashCode() {
			return this.value.hashCode();
		}

		@Override
		public boolean equals(Object o) {
			if (o != null) {
				if (!(o instanceof Node)) {
					return false;
				}
				else if (((Node) o).value.hashCode() != this.hashCode()) {
					return false;
				} else if ((((Node) o).value == this.value) && (o instanceof Node)) {
					return true;
				}
			}
			return false;
		}
	}
	
	Node root = null;
	public Node addNode(Integer value,Node root)
	{
		if(root == null)
		{
			root = new Node(value);
		}
		if (root!=null)
		{
			this.root=root;
		}
		if(value < root.value)
		{
			root.leftChild = addNode(value,root.leftChild);
		}
		else if(value > root.value)
		{
			root.rightChild = addNode(value,root.rightChild);
		}
		else if(value == root.value)
		{
			root.value = value;
		}
		return root;
	}
	
	public void printInOrder(Node root)
	{
		if(root != null)
		{
			printInOrder(root.leftChild);
			System.out.println(root.value);
			printInOrder(root.rightChild);
		}
			
	}
	
	public static void main(String[] args)
	{
		Bfs tree = new Bfs();
		Bfs.Node root =tree.new Node(500);
		tree.addNode(400, root);
		tree.addNode(300, root);
		tree.addNode(600, root);
//		tree.printInOrder(root);
		tree.breadthFirstSearch(root,true);
		
	}
	
	private void breadthFirstSearch(Node root,boolean flag)
	{
		Bfs tree = new Bfs();
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			Node node = queue.poll();
			
			if(node!=null)
			{
				System.out.println(node.value);
				if(flag)
				{
					queue.add(node.rightChild);
					queue.add(node.leftChild);
				}
				if(!flag)
				{
					queue.add(node.leftChild);
					queue.add(node.rightChild);
				}
				breadthFirstSearch(queue.poll(),!flag);
			}
			
		}
	}

}
