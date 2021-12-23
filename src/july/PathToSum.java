package july;

import java.util.ArrayList;
import java.util.List;

public class PathToSum {
	
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode() {}
	 *     TreeNode(int val) { this.val = val; }
	 *     TreeNode(int val, TreeNode left, TreeNode right) {
	 *         this.val = val;
	 *         this.left = left;
	 *         this.right = right;
	 *     }
	 * }
	 */
	class Solution {
	    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
	        List<List<Integer>> list = new ArrayList<List<Integer>>();
	        pathSum(root,targetSum,0,list,new ArrayList<Integer>());
	        return list;
	    }
	    
	    public void pathSum(TreeNode root, int targetSum,int sum,List<List<Integer>> list , List<Integer> aList)
	    {
	        if(root!=null) {
	            sum = sum +root.val;
	            aList.add(root.val);
	        }
	        if(root!=null && root.left==null && root.right==null)
	        {
	            if(sum==targetSum)
	            {
	                list.add(aList);
	                return;
	            }
	        }
	        if(root!=null && root.left!=null) pathSum(root.left,targetSum,sum,list,new ArrayList<>(aList));
	        if(root!=null && root.right!=null) pathSum(root.right,targetSum,sum,list,new ArrayList<>(aList));
	        return ;
	    }
	}

}
