package May;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class LockAndKey {
	
	public static void main(String[] args)
	{
		String[] s= {"0201","0101","0102","1212","2002"};
		String target = "0202";
		openLock(s,target);
	}
	
	public  static void openLock(String[] deadends,String target)
	{
		HashSet<String> set = new HashSet<String>();
		HashSet<String> visited = new HashSet<String>();
		for(int i=0;i<deadends.length;i++)
		{
			set.add(deadends[i]);
		}
		String str ="0000";
		Queue<String> q = new LinkedList<String>();
		int count=0;
		q.add(str);
		visited.add(str);		
		while(!q.isEmpty())
		{
			count++;
			int size=q.size();
			for(int k=0;k<size;k++)
			{
				str = q.poll();
				for(int i=0;i<4;i++)
				{
					for(int j=-1;j<=1;j=j+2)
					{
						
						int temp = ((str.charAt(i)-'0') + j +10) %10;					
						String t = str.substring(0, i)+temp+str.substring(i+1,4);
						System.out.println(t +":"+ target);
						if(t.equals(target) )
						{
							System.out.println(count);
							return;
						}
						else if (!set.contains(t) && !visited.contains(t))
						{						
							q.add(t);
							visited.add(t);
							
						}
					}
				}
			}
		}
		System.out.println("-1");
		
	}

}
