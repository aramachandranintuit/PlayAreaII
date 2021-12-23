package DS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class PostOrder {
	
	public static void main(String[] args)
	{
		HashMap map = new HashMap();
		 int[] inOrder = {4, 2, 5, 1, 3, 6};
		 int[] preOrder = {1, 2, 4, 5, 3, 6};
		 int n = inOrder.length;
		PostOrder postorder = new PostOrder();
		int[] postOrderTraversal = new int[n];
		postorder.populatePostOrder(inOrder,preOrder,postOrderTraversal,n-1);
		
	}
	
	private void populatePostOrder(int[]inOrder ,int[] preOrder,int[] postOrder,int postOrderIndex)
	{
//		/find root
		if(inOrder.length>0)
		{
			int rootIndex = findRoot(inOrder,preOrder[0]);			
			
			populatePostOrder(Arrays.copyOfRange(inOrder, 0, rootIndex) ,Arrays.copyOfRange(preOrder, 1,rootIndex+1), postOrder,postOrderIndex-1);
			postOrderIndex =postOrderIndex-1;
			if(rootIndex<inOrder.length)
			{
				populatePostOrder(Arrays.copyOfRange(inOrder, rootIndex+1, inOrder.length) ,Arrays.copyOfRange(preOrder,rootIndex+1,preOrder.length), postOrder,postOrderIndex-rootIndex);
			}
			System.out.println(preOrder[0]);
			
		}
		return;
	}
	
	
	private static int findRoot(int[] treeArray, int root)
	{
		for(int i=0;i<treeArray.length;i++)
		{
			if(treeArray[i]==root)
			{
				return i;
			}
		}
		return -1;
	}

}
