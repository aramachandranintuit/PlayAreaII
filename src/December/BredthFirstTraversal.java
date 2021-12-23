package December;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BredthFirstTraversal {
 class Node{
	 
	 int val;
     Node leftNode;
     Node rightNode;
     Node() {}
     Node(int val) { this.val = val; }
     Node(int val, Node left, Node right) {
         this.val = val;
         this.leftNode = left;
         this.rightNode = right;
     }
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
 
 /*
  * level order traversal
  */
	 public void bredthFirstSearch(Node root)
	 {
		 Queue<Node> q = new LinkedList<Node>();
		 q.add(root);
		 List<List<Integer>> list = new ArrayList<List<Integer>>();
		 while(!q.isEmpty())
		 {
			 int size = q.size();
			 List<Integer> aList = new ArrayList<Integer>();
			 for(int i=0;i<size;i++)
			 {
				 Node n = q.poll();
				if(n!=null) { aList.add(n.val);
				 q.offer(n.rightNode);
				 q.offer(n.leftNode);
				}
			 }
			 if(!aList.isEmpty()) list.add(aList);
		 }
		 
		 for(List<Integer> t : list)
		 {
			 System.out.println(t);
		 }
	 }
 
 public static void main(String[] args)
	{
	 BredthFirstTraversal sa = new BredthFirstTraversal();
		Node root = sa.addNode(4, null);
		sa.addNode(2, root);
		sa.addNode(3, root);
		sa.addNode(5, root);
		sa.addNode(3, root);
		sa.addNode(6, root);
		sa.addNode(9, root);
		sa.addNode(7, root);
//		System.out.println(root.rightNode.val);
//		System.out.println(root.leftNode.val);
		sa.bredthFirstSearch(root);
	}

}
