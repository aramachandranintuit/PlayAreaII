package feb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class KfreqWords {
	
	public static void main(String[] args)
	{
		int k=2;
		String[] str = {"i", "love", "leetcode", "i", "love", "coding"};
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for(String s:str)
		{
			map.put(s, map.getOrDefault(s, 0)+1);
		}
		
		List<String> list = new ArrayList<String>(map.keySet());
		Comparator<String> cmp = new Comparator<String>() {
			
			@Override
			public int compare(String e1,String e2)
			{
				return map.get(e2) -map.get(e1);
			}

			
		};
		Collections.sort(list,cmp);
		System.out.println(list);
				
	}

}
