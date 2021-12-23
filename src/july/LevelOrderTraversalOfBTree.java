package july;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode
{
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
	 }
public class LevelOrderTraversalOfBTree {
	public static void main(String[] args)
	{
		
	}
	
	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root==null) return list;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer> aList = new ArrayList<Integer>();;
            for(int i=0;i<size;i++)
            {
                TreeNode node = q.poll();
                if(node!=null) 
                {                    
                    aList.add(node.val);
                    q.offer(node.left);
                    q.offer(node.right);
                    
                }
            }
            if(aList.size()>0) list.add(aList);
        }
        return list;
        
        
    }

}
