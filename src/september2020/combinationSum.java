
package september2020;

import java.util.ArrayList;
import java.util.List;

public class combinationSum {
	
	static List<List<Integer>> nums = new ArrayList<List<Integer>>();	
	public static void main(String[] args)
	{
		int num[] = {2,3,4};
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> n=new ArrayList<Integer>();
		cSum(7,0,n,num,result);
		System.out.println(result);
	}
	
	public  static void cSum(int target,int index,ArrayList<Integer>n,int [] num,List<ArrayList<Integer>> res)
	{
		if(target==0)
			res.add(new ArrayList(n));
		if(target<0)
			return;
		for(int i=index;i<num.length;i++)
		{
			n.add(num[i]);
			cSum(target-num[i],i,n,num,res);
			n.remove(n.size()-1);
			
			
		}
		
		
	}

}
