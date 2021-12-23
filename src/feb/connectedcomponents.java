package feb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class connectedcomponents {
	
	public static void main(String[] args)
	{
		int nodes=5;
		int[][] c = {{1,2},{1,3},{2,3}};
		Map<Integer,List<Integer>> map = createMap(nodes,c);
		for(int i=0;i<c.length;i++)
		{
			List<Integer> list = map.get(c[i][0]);
			list.add(c[i][1]);
			list = map.get(c[i][1]);
			list.add(c[i][0]);
		}
		System.out.println(map);
		boolean[] a = new boolean[nodes+1];
		int r=0;
		for(int i=1;i<=nodes;i++)
		{
			r+=getConnectedGraph(i,map,a);
		}
		System.out.println(r-1);
		
		
	}
	
	public static Map<Integer,List<Integer>> createMap(int nodes, int[][] conn)
	{
		Map<Integer,List<Integer>> map = new HashMap<Integer,List<Integer>>();
		for(int i=1;i<nodes+1;i++)
		{
			
			map.put(i, new ArrayList<Integer>());
		}
		return map;
	}

	public static int getConnectedGraph(int index,Map<Integer,List<Integer>> list,boolean[] a)
	{
		if(a[index]==true) return 0;
		else
		{
			a[index]=true;
			List<Integer> aList = list.get(index);
			if(aList==null) return 1;
			for(int i=0;i<aList.size();i++)
			{
				getConnectedGraph(aList.get(i),list,a);
			}
		}
		return 1;
	}

}
