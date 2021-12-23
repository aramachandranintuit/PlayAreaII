package Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Sorting {

	public static void main(String[] args) {

		int[][]Input ={{2,1},{0,1}, {1,2}, {1,1}};
//		sort(Input);
		kLargest(3);
	}
	
	
	public static void kLargest(int k)
	{
		int[] n = {16,89,8,10,11};
		Queue<Integer> queue = new PriorityQueue<Integer>();
		for(int i=0;i<n.length;i++)
		{
			queue.add(n[i]);
		}
		for(int i=0;i<k;i++)
		{
			System.out.println(queue.poll());
		}
		
		
	}

//	public static void sort(int[][] a) {
//		TreeMap<Integer, Queue<Integer>> map = new TreeMap<Integer, Queue<Integer>>();
//		for (int i = 0; i < a.length; i++) {
//			if(map.containsKey(a[i][0]))
//			{
//				Queue<Integer> queue = map.get(a[i][0]);
//				queue.add(a[i][1]);
//				map.put(a[i][0], list);
//			}
//			else
//			{
//				List<Integer> list = new ArrayList<>();
//				list.add(a[i][1]);
//				map.put(a[i][0], list);
//			}
//
//		}
//		
//		System.out.println(map);
//
//	}

}
