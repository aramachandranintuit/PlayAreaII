package June;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class radix {
	public static void main(String[] args)
	{
//		Deque<Integer> q = new LinkedList<Integer>();
//		q.add(1);
//		q.add(2);
//		q.addFirst(11);
//		q.addLast(12);
//		while(q.size()>0)
//		{
//			System.out.println(q.pollLast());
//		}
//		
		int[] arr = { 170, 45, 75, 90, 802, 24, 2, 66 };
////		countingSort(arr);
//		int max =Integer.MIN_VALUE;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(max < arr[i]) max = arr[i];			
//		}
//		for(int i=1;max/i>0;i*=10)
//		{
//			arr = radixSort(arr,i);
////			System.out.println(Arrays.toString(arr));
//		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > max) max= arr[i];
		}
		for(int i=1;max/i>0;i=i*10)
		{
			radiSort(arr,i);
		}
	}
	
	
	public static void countingSort(int[] arr)
	{
		int max =Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(max < arr[i]) max = arr[i];			
		}
		int[] count = new int[max+1];
		for(int i=0;i<arr.length;i++)
		{
			count[arr[i]]++;
		}
//		System.out.println(Arrays.toString(count));
		int r=0;
		for(int i=0;i<count.length;i++)
		{
			int s=count[i];
			while(s>0)
			{
				arr[r]=i;
				s--;
				r++;
			}
		}
//		System.out.println(Arrays.toString(arr));
	}
	
	private static int[] radixSort(int[] arr,int exp)
	{
		HashMap<Integer,List<Integer>> map = new HashMap<>();
		for(int i=0;i<=9;i++)
		{
			map.put(i, new ArrayList<Integer>());
		}
		for(int i=0;i<arr.length;i++)
		{
			List<Integer> list = map.get((arr[i]/exp)%10);
			list.add(arr[i]);
			map.put((arr[i]/exp)%10,list);
		}
		int[] output = new int[arr.length];
		int k=0;		
		for(int i=0;i<=9;i++)
		{
			List<Integer> list = map.get(i);
			int size =list.size();
			int r=0;
			while(size>0)
			{
				output[k]=list.get(r);
				k++;
				r++;
				size--;
				
				
			}
		}
		System.out.println(Arrays.toString(output));
		return output;
	}
	
	
	
	private static void radiSort(int[] arr , int exp)
	{
		HashMap<Integer,List<Integer>> map = new HashMap<Integer,List<Integer>>();
		for(int i=0;i<=9;i++)
		{
			map.put(i, new ArrayList<Integer>());
		}
		for(int i=0;i<arr.length;i++)
		{
			map.get((arr[i]/exp)%10).add(arr[i]);
		}
		int k=0;
		for(int i=0;i<=9;i++)
		{
			List<Integer> list = map.get(i);
			while(!list.isEmpty())
			{
				arr[k++]=list.remove(0);
			}			
		}
		System.out.println(Arrays.toString(arr));
	}

}
