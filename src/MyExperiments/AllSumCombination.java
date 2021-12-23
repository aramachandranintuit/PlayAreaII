package MyExperiments;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * find all combinations of numbers adding upto a target, the numbers can repeat in the final list.
 * 
 */
public class AllSumCombination {
	static List<List<Integer>> res = new ArrayList<List<Integer>>();
	public static void main(String[] args)
	{
		int [] a = {2,1,3,5,7,9};
		int target = 10;
		getAllCombinations(10,0,a,new ArrayList<Integer>());
		for(List<Integer> list : res)
		{
			System.out.println(list);
		}
	}
	
	static void getAllCombinations(int target, int currentSum, int[] a,List<Integer> list)
	{
		if(currentSum==target) {
			res.add(list);
		}
		if(currentSum>target) {
			return;
		}
		if(currentSum<target)
		{
			for(int i=0;i<a.length;i++)
			{	
				/*
				 * it is important to note that we need a new list for every member of the input array,
				 * hence we first create a new list and then subsequently add the one number to the  newly created list.
				 * 
				 */
				ArrayList<Integer> l = new ArrayList<Integer>(list);
				l.add(a[i]);
				getAllCombinations(target,currentSum+a[i],a,l);
			}
			
		}
	}

}
