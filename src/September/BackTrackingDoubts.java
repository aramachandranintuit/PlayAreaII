package September;

import java.util.ArrayList;
import java.util.List;

/*
 * find all combinations of a string array.
 * 
 */
public class BackTrackingDoubts {
	
	public static void main(String[] args)
	{
		String[] a = {"1","2","3"};
		BackTrackingDoubts bc = new BackTrackingDoubts();
		List<String> list = new ArrayList<String>();
		List<List<String>> ls = new ArrayList<List<String>>();
		bc.backtracking(a, 0, ls, list,new boolean[a.length]);
//		bc.backTracking(a, 0, list, new String());
		for(List<String> str:ls)
		{
			System.out.println(str);
		}
		
//		for(String s:list)
//		{
//			System.out.println(s);
//		}
	}
	
	public void backTracking(String[] a,int index,List<String> list,String sb)
	{
		if(index==a.length)
		{
			String s = new String(sb);
			list.add(s);
			return;
		}
		for(int i=index;i<a.length;i++)
		{
			String temp = a[i];
			sb +=temp;
			backTracking(a,index+1,list,sb);
			sb = sb.substring(0,sb.length()-temp.length());
			
		}
	}
	
	public void backtracking(String[] a,int index,List<List<String>> list,List<String> aList,boolean[] visited)
	{
		if(index==a.length)
		{
			list.add(new ArrayList<>(aList));
			return ;
		}
		for(int i=0;i<a.length;i++)
		{
			if(!visited[i])
			{
				aList.add(a[i]);
//				visited[i]=true;
				backtracking(a,index+1,list,aList,visited);
				aList.remove(aList.size()-1);
//				visited[i]=false;
			}
		}
		
	}

}
