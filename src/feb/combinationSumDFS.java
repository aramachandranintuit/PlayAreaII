package feb;

import java.util.ArrayList;
import java.util.List;

public class combinationSumDFS {
	
	public static void main(String[] args)
	{
		int[] a = {2,3,6,7};
		List<List<Integer>> aList = new ArrayList<List<Integer>>();
		int target=7;
		combination(a,0,7,new ArrayList<Integer>(),aList);
		System.out.println(aList);
	}
	
	public static void combination(int[] a,int index,int target ,List<Integer> list,List<List<Integer>> aList)
	{
		if(target<0) return;
		if(target==0) aList.add(list);
		for(int i=index;i<a.length;i++)
		{
			ArrayList<Integer> nlist = new ArrayList<Integer>(list);
			nlist.add(a[i]);
			combination(a,i,target-a[i],nlist,aList);
		}
		
	}

}
