package October;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomCity {
	
	public static void main(String[] args)
	{
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("NY", 700000);
		map.put("SF", 500000);
		map.put("WA", 800000);
		int r = getRandom(map);
		int count=0;
		for(String key : map.keySet())
		{
			for(int i=0;i<map.get(key);i++)
			{
				if(count==r) {
					System.out.println(key);
					return;
				}
				count++;
				
			}
		}
		
	}
	 public static int getRandom(Map<String,Integer> map)
	 {
		 int total=0;
		 for(String key: map.keySet())
		 {
			 total+=map.get(key);
		 }
		 
		 int r = (int)(new Random().nextDouble()*total);
		 System.out.println(r);
		 return r;
	 }

}
