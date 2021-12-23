package feb;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Doubts {
	TreeSet<Integer> list = new TreeSet<Integer>();
	public static void main(String[] args)
	{
		int[] a = {1,5,2,7,10,13};
		Deque<Integer> q = new LinkedList<Integer>();
		q.add(a[0]);
		q.add(a[1]);
		q.add(a[2]);
		
		for(int i=2;i+2<a.length;i++)
		{
			if(q.r)
		}
//		String str="ailghngvnbtulazsqvpftrq";
//		Doubts d = new Doubts();
//		d.LongestUniqueString(str,0,new HashSet<Character>());
//		System.out.println(d.list.last());
//		
//		int[] a = {1,5,2,7,10,13};
//		for(int i=((a.length)/2)-1;i>=0;i--)
//		{
//			heapify(a,a.length,i);
//		}
//		int c=0;
//		for(int i=a.length-1;i>=0;i--)
//		{
//			if(c==2)
//				{
//				System.out.println(a[a.length-2]);
//				break;
//				}
//			int temp = a[0];
//			a[0]=a[i];
//			a[i]=temp;
////			System.out.println(a[0] +" "+a[i]);
//			heapify(a,i,0);
//			c++;
////			System.out.println(Arrays.toString(a));
//		}
//		System.out.println(Arrays.toString(a));
	}
	
	public static int max(Deque<Integer> n)
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n.size();i++)
		{
			max= Math.max(max, n.)
		}
	}
	public static void heapify(int [] a,int n,int index)
	{
		int largest = index;
		int l = 2*index+1;
		int r = 2*index+2;
		
			if(l<n && a[largest] < a[l])
			{
				largest=l;
			}
			if(r<n && a[largest] < a[r])
			{
				largest=r;
			}
			if(largest!=index)
			{
				int temp = a[largest];
				a[largest]=a[index];
				a[index] =temp;
				heapify(a,n,largest);
			}
	}
	
	public 
	
	public void LongestUniqueString(String s, int pos,Set<Character> set)
    {
        if(pos==s.length()) {
//        		System.out.println(set);
            list.add(set.size());
            return ;
        }
       
        for(int i=pos;i<s.length();i++)
        {   
            if(!set.contains(s.charAt(i)))
            {
                set.add(s.charAt(pos));
                LongestUniqueString(s,i+1,set);
            }
            else
            {
//             	System.out.println(set);
                list.add(set.size());
                set = new HashSet<Character>();
                set.add(s.charAt(i));
                LongestUniqueString(s,i+1,set);
            }
        }     
    }

}
