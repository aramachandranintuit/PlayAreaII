package leetcode;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class removeElement {
	
	public static void main(String[] args)
	{
		int a[] = {1,2,3,4,3,4,5};
		Map<Integer,Integer> aMap = new HashMap<Integer,Integer>();
		for(int i =0;i<a.length;i++)
		{
			aMap.put(a[i], aMap.containsKey(a[i]) ? aMap.get(a[i])+1 : 1);
		}
		
		
		System.out.println(new removeElement().removeElement(3, aMap));
	}
	
	private int removeElement(int valueToRemove,Map aMap)
	{
		int freq =0;
		if(aMap.containsKey(valueToRemove))
		{
			freq = (Integer)aMap.get(valueToRemove);	
			aMap.remove(valueToRemove);
		}
		Collection<Integer> aMapValueSet = aMap.values();
		int n=0;
		for (Integer value:aMapValueSet)
		{
			n=n+value;
		}
	
		return (n);
		
	}

}
