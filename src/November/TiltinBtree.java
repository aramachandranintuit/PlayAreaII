package November;
class TreeNode {
	   	  int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	      int sum=0;
//	      TreeNode root = null;
	      
//	      public TreeNode addNodeWrapper(int val)
//	      {
//	    	  	return addNode(val,root);
//	      }
	      public TreeNode addNode(int val,TreeNode root)
	      {
	    	  	
	    	  	if(root==null)
	    	  	{
	    	  		TreeNode newNode = new TreeNode(val);
	    	  		root = newNode;
	    	  	}
	    	  	else if (val <= root.val)
	    	  	{
	    	  		root.left = addNode(val,root.left);
	    	  	}
	    	  	else
	    	  	{
	    	  		root.right=addNode(val,root.right);
	    	  	}
	    	  	return root;
	      }
	      
	      TreeNode findDiff(TreeNode root)
	      {
	          if(root!=null)
	          {
		        	  if(root.left!=null && root.right!=null)
	            	  {
	            	  	 root.val = Math.abs(findDiff(root.left).val - findDiff(root.right).val);	            	  	 
	            	  }
		        	  else if(root.left!=null && root.right==null)
	            	  {
	            	  	 root.val = root.left.val;
	            	  	 TreeNode left = findDiff(root.left);
	            	  }
                   else if(root.right!=null && root.left==null)
	            	  {
	            	  	 root.val = root.right.val;
	            	  	 TreeNode right = findDiff(root.right);
	            	  }
		        	  else
		        		  root.val=0;         
	          }
	          return root;
	      }
	      
	      int findSum(TreeNode root)
	      {
	          if(root!=null)
	          {
	        	  	sum+=root.val;
	        	  	findSum(root.left);
	        	  	findSum(root.right);	       	     
	            } 
	            	
	          return sum;
	      }
	  }
public class TiltinBtree {
	public static void main(String[] args)
	{
		TreeNode node = new TreeNode(4);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3= new TreeNode(9);
		TreeNode node4 = new TreeNode(3);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(7);
		node.left=node2;
		node.right=node3;
		node2.left=node4;
		node2.right=node5;
		node3.right=node6;
		
		
//		System.out.println(root.val);
//		System.out.println(root.left.val);
//		System.out.println(root.right.val);
		node=node.findDiff(node);
		System.out.println(node.val);
		System.out.println(node.left.val);
		System.out.println(node.right.val);
		System.out.println(node.findSum(node));
		
	}
	
	
	

}
