package October;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.SortedMap;  
import java.util.TreeMap;  

public class ConsistentHashing {
	
	public static void main(String[] args)
	{
		
		SortedMap<Integer,String> map = new TreeMap<>();
		TreeMap<Integer,String> Tmap = new TreeMap<>();
		map.put("server A".hashCode(),"server A");
		System.out.println(map);
	}
	
	public Map<Integer,String> addNodes(String[] nodes)
	{
		SortedMap<Integer,String> map = new TreeMap<>();
		for(String node:nodes)
		{
			map.put(node.hashCode(), node);
		}
		return map;
	}
	
	public Map<Integer,String> addNodes(String node, Map<Integer,String> map)
	{
		map.put(node.hashCode(), node);
		return map;
	}
	public String getNode(int key,SortedMap<Integer,String> map)
	{
		SortedMap<Integer,String> sMap = map.tailMap(key);
		int r = sMap.isEmpty() ? map.lastKey():sMap.firstKey();
		return map.get(r);
		
	}

}
