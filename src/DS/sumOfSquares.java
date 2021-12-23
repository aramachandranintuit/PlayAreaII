package DS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;

public class sumOfSquares {
	public static void main(String[] args)
	{
		Hashtable a  = new Hashtable();
		int n=13;
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1;i*i<=n;i++)
		{
			list.add(i*i);
		}
		System.out.println(new sumOfSquares().getNumSum(n,list));
		
	}
	
	private int getNumSum(int n,List<Integer> squaresList)
	{
		if(n==0)
			return 0;
		else {
		int k = Integer.MAX_VALUE;
		for(Integer i:squaresList)
		{
			if(n-i>=0)
			{
				k=Math.min(k,1+getNumSum(n-i,squaresList));
			}
		}
		return k;
		}
	
	}
	
	
	
	

}
