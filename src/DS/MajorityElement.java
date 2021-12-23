package DS;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	
	public static void main(String[] args)
	{
		int [] a = {1,2,2,3,2,2,5,3,2,2,2};
		int majorityCriteria  = Math.floorDiv(a.length, 2);
		MajorityElement element = new MajorityElement();
		System.out.println(element.findCount(a,majorityCriteria));
		
	}
	
	private int findCount(int[] a,int majorityCriteria)
	{
		Map<Integer,Integer> count = new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(count.containsKey(a[i]) ==true && count.get(a[i])+1==majorityCriteria)
			{
				return a[i];
			}
			else if(count.containsKey(a[i]) ==true) 
			{
				count.put(a[i], count.get(a[i])+1);
			}
			else
			{
				count.put(a[i], 1);
				
			}
				 
		}
		return -1;
	}

}
