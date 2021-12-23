package August;

import java.util.ArrayList;
import java.util.List;

public class AllCombinations {
	
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5};
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> aList= new ArrayList<Integer>();
		allCombinations(arr,0,aList,list,new boolean[arr.length]);
		System.out.println(list.size());
		for(List<Integer> a: list)
		{
			System.out.println(a);
		}
		
	}
	
	public static void allCombinations(int[] arr,int count ,List<Integer> aList,List<List<Integer>> list,boolean[] visited)
	{
		if(count==arr.length) {
			list.add(new ArrayList<>(aList));
		}
		for(int i=0;i<arr.length;i++)
		{
			if(visited[i]==false)
			{
				aList.add(arr[i]);
				visited[i]=true;
				allCombinations(arr,count+1,aList,list,visited);
				visited[i]=false;
				aList.remove(aList.size()-1);
			}
		}
	}

}
