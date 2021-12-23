

package December;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class test {
	public static void main(String[] args) {
//		String[] a = "asd asd asdasdqsdadas".split(" ", 2);
//		System.out.println(a[1]);
//		System.out.println(2 << 2);
		// System.out.println(n);
//		int[][] a = {{2,1,3},{5,3,2},{9,3,7}};
//		int[] c = a[0];
//		Arrays.sort(a,new Comparator<int[]>() {
//			
//			@Override
//			public int compare(int[] a , int[] b)
//			{
//				for(int i=0;i<a.length;i++) 
//				{
//					return a[i] -b[i];
//				}
//				return 0;
//			}
//		});
//		System.out.println(Arrays.toString(a[0]));
//		System.out.println(Arrays.toString(a[1]));
//		System.out.println(Arrays.toString(a[2]));
//		System.out.println(6^2)	;
//		System.out.println('9'-'0');
//		HashSet<Integer> set = new HashSet<Integer>();
//		for(int i=0;i<a.length;i++)
//		{
//		if(!set.contains(a[i])) set.add(a[i]);
//		else {
//			System.out.println(a[i]);
//			return;
//		}
		
		Deque<Integer> dq = new LinkedList<Integer>();
		dq.addFirst(10);
		dq.addLast(50);
		dq.addFirst(20);
		dq.addFirst(30);
		while(!dq.isEmpty())
		{
			System.out.println(dq.pollLast());
		}
		}
	}

//}
