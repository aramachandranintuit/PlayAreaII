package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

class NAryNode {
	List<NAryNode> children = new ArrayList<NAryNode>();
	int value;

	NAryNode(int value) {
		this.value = value;
	}
}

public class NaryTree {
	public static void main(String[] args) {
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		Set<Entry<Integer,Integer>> entry  = map.entrySet();
		NAryNode root = new NAryNode(3);
		List<NAryNode> child = new ArrayList<NAryNode>();
		child.add(new NAryNode(5));
		child.add(new NAryNode(6));
		child.add(new NAryNode(7));
		child.add(new NAryNode(8));
		child.add(new NAryNode(9));
		NAryNode firstLevel = new NAryNode(10);
		NAryNode secondLevel = new NAryNode(100);
		List<NAryNode> list = new ArrayList<NAryNode>();
		list.add(secondLevel);
		firstLevel.children = list;
		child.add(firstLevel);
		root.children = child;

//		System.out.println(new NaryTree().cloneTree(root).children.get(0).value);
		System.out.println(new NaryTree().findDepth(root));
	}
	
	private int findDepth(NAryNode root)
	{
		if(root!=null)
		{	
			int height =1;
			for(NAryNode node : root.children)
			{
			height = Math.max(1,1+findDepth(node));
			}
		return height;
		}
		return 0;
	}

	private NAryNode cloneTree(NAryNode root) {
		if (root != null) {
			NAryNode clone = new NAryNode(root.value);
			List<NAryNode> clonedChildren = new ArrayList<NAryNode>();
			for (NAryNode child : root.children) {
				cloneTree(child);
				clonedChildren.add(child);

			}
			clone.children = clonedChildren;
			return clone;
		}
		return null;
	}

}
