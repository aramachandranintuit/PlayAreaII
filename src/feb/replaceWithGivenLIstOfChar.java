package feb;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class replaceWithGivenLIstOfChar 
 {
	public static void main(String[] args)
	{
		String str ="a#ja#y";
		char[] c = {'a','b','c'};
		List<String> list = new ArrayList<String>();
		fill(str.toCharArray(),c,0,4,list);
		System.out.println(list);
		
		
//		int [] a = {4,3,10,1};
//		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
//		for(int i=0;i<a.length;i++)
//		{
//			q.add(a[i]);
//		}
//		System.out.println(q.poll());
	}
	
	public static void fill(char[] s,char[] c,int sPos,int lastHashIndex,List<String> list)
	{
		if(sPos>lastHashIndex) {
			list.add(new String(s));
			return;
		}
		else
		{
			for(int i=0;i<c.length;)
			{
				if(s[sPos]=='#')
				{
					s[sPos]=c[i];
					fill(s,c,sPos+1,lastHashIndex,list);
					s[sPos]='#';
					i++;
				}
				else if(sPos <= lastHashIndex)
					{
						sPos++;
//						i++;
					}
////				if(sPos>lastHashIndex) {
////					list.add(new String(s));
////					return;
//				}
			}
//			

		}
	}
	

}
