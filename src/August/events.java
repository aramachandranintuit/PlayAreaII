package August;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

/*
 * the following program is used to find the number of events that we can attend .There is a constraint that we can attend only
 * 1 event per day
 */
public class events {
	
	public static void main(String[] args)
	{
		int[][] a = {{1,4},{4,4},{2,2},{3,4},{1,1}};
		Arrays.sort(a ,new Comparator<int[]>() {
			
			@Override
			public int compare(int[] a, int[] b)
			{
				return a[1]-b[1];
			}			
		});
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i][1]<min) min=a[i][1];
			if(a[i][1]>max) max=a[i][1];
		}
		TreeSet<Integer> set = new TreeSet<Integer>();
		for(int i=min;i<=max;i++)
		{
			set.add(i);
		}
		int ans=0;
		for(int i=0;i<a.length;i++)
		{
			Integer res =set.ceiling(a[i][0]);
			if(res!=null) {
				ans++;
				set.remove(res);
			}
		}
		System.out.println(ans);
	}

}
