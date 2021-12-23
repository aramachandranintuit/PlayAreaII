package December;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortString {
	
	public static void main(String[] args)
	{
		String[] arr = {"tar","rat","arc"};
		Map<String,List<String>> map = new HashMap<>();
		List<String> ls = null;
		for(int i=0;i<arr.length;i++)
		{
			char[] s = arr[i].toCharArray();
//			System.out.println(s.toString());
			Arrays.sort(s);
			StringBuilder sb = new StringBuilder();
			for(int j=0;j<s.length;j++)
			{
				sb.append(s[j]);
			}
			if(map.containsKey(sb.toString()))
			{
				 ls = map.get(sb.toString());
				ls.add(arr[i]);
			}
			else
			{
				ls = new ArrayList<>();
				ls.add(arr[i]);
			}
			map.put(sb.toString(),ls);
		}
		System.out.println(map);
	}

}
