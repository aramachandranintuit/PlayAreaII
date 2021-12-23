package June;

import java.util.Arrays;

public class redundantConnection {
	
	public static void main(String[] args)
	{
//		int edges[][] = {{1,2},{1,3},{2,3}};
		int [][] edges = {{1,2},{2,3},{3,4},{1,4},{1,5}};
		int[] res = findRedundantConnection(edges);
		System.out.println(Arrays.toString(res));
	}
	
	public static  int[] findRedundantConnection(int[][] edges) 
	{
		int[] parent = new int[edges.length+1];
        for(int i=0;i<parent.length;i++)
        {
        		parent[i]=i;
        }
        for(int []a :edges)
        {
        	int parentA = findParent(a[0],parent);
        	int parentB = findParent(a[1],parent);
        	if(parentA==parentB)
        		return a;
        	parent[parentA]=parentB;        
        }
    		return new int[2];
    }
	
	public static int findParent(int x ,int[] parent)
	{	
		while(parent[x]!=x)
		{
			x=parent[x];
		}
		return x;
		
	}

}
