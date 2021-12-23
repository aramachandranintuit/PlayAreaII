package June;

import java.util.HashMap;
import java.util.Map.Entry;

public class RedistributeCharacter {
	
	public static void main(String[] args)
	{
		String[] words = {"ab","a"};
		System.out.println(makeEqual(words));
	}
	
	public static boolean makeEqual(String[] words) {
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<words.length;i++)
        {
            String temp = words[i];
            for(int j=0;j<temp.length();j++)
            {
                if(map.containsKey(temp.charAt(j)))
                    map.put(temp.charAt(j),map.get(temp.charAt(j))+1);
                else
                	map.put(temp.charAt(j), 1);
            }
        } 
        for(Entry<Character, Integer> e: map.entrySet())
        {
        	System.out.println(e);
        }
        for(int v:map.values())
        {            
            System.out.println(v);
            System.out.println(v%words.length);
            if(v%words.length!=0) return false;
        }
        return true;
        
    }

}
