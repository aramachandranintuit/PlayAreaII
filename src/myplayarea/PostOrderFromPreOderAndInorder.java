package myplayarea;

import java.util.Arrays;

public class PostOrderFromPreOderAndInorder {

	public static void main(String[] args)
	{
		int[] in ={4, 2, 5, 1, 3, 6};
		int [] pre = {1, 2, 4, 5, 3, 6};
		printPostOrder(in,pre,in.length);
	}
	
	static void printPostOrder(int[] in , int [] pre , int size)
	{
		int root = search(in , pre[0],size);
		if(root!=-1)
//		left subtree
		{
			printPostOrder(in,Arrays.copyOfRange(pre,1,size),root);
		}
//		right subtree
		if(root!= size-1)
		{
			printPostOrder(Arrays.copyOfRange(in, root+1,size),Arrays.copyOfRange(pre,root+1,size),size - root -1);
		}
			System.out.println(pre[0]);
	}
	
	static int search(int[] in , int toFind, int size)
	{
		for(int i=0;i<size;i++)
		{
			if(in[i] == toFind)
			{
				return i;
			}
		}
		return -1;
	}
	
}
