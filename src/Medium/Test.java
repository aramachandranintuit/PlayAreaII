package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args)
	{
		
		int[] a= new int[]{-2, 3, 4, -5, -7};
		List<Integer> list = new ArrayList<Integer>();
		list.add(-2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(-7);
		list.add(-8);
		int[] c = list.stream().mapToInt(i->i).toArray();
		
//		List<String> list = new ArrayList<String>();
////		["a", "abc", "d", "de", "def"]
//		list.add("a");
//		list.add("abc");
//		list.add("d");
//		list.add("de");
//		list.add("def");
//		Test t = new Test();
//		int[] r = new int[26];
//		for(int i=0;i<r.length;i++)
//		{
//			r[i]=0;
//		}
//		System.out.println(t.getMaxLength(list,0,r));		
//		maximumSubArray(a);
		extractEven(list);
	}
	
	
	private static void extractEven(List<Integer> a)
	{
		int c1=0;
		int c2=1;
		int[] r = a.stream().mapToInt(i->i).toArray();
		while(c1<r.length && c2<r.length)
		{
			if(r[c1]%2==0 && r[c2]%2!=0)
			{
				c1++;
				c2++;
			}
			else if(r[c1]%2!=0 && r[c2]%2==0)
			{
				int temp =r[c1];
				r[c1]=r[c2];
				r[c2]=temp;
			}
			else if(r[c1]%2==0 && r[c2]%2==0)
			{
				c1++;
			}
			else if(r[c1]%2!=0 && r[c2]%2!=0)
			{
				c2++;	
			}
			
			System.out.println(Arrays.toString(Arrays.copyOfRange(r,0,c1)));
		}
	}
	private static void maximumSubArray(int[] a )
	{
		int sum=0;
		int maxSum=0;
		int start=0;
		int end=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>sum + a[i])
			{
				start=i;
				sum=a[i];
			}
			else
			{
				sum=sum+a[i];
			}
			if(sum >maxSum)
			{
				end =i;
				maxSum=sum;
			}
		}
		System.out.println("maxSum "+ maxSum);
		System.out.println("start "+ start);
		System.out.println("end "+ end);
		
	}
	private int getMaxLength(List<String> list,int current,int[] totalLength)
	{
		int result=0;
		if(current==list.size())
			return 0;
		String s = list.get(current);
		boolean flag = true;
		for(int i=0;i<s.length();i++)
		{
			
				totalLength[((int)s.charAt(i)) - 'a']++;
				if(totalLength[((int)s.charAt(i)) - 'a']>1)
					flag=false;
	
		}
		if(flag)
		{
			result= Math.max(result,s.length()+getMaxLength(list,current+1,totalLength));
		}
		for(int i=0;i<s.length();i++)
		{
			totalLength[((int)s.charAt(i)) - 'a']--;
		}
		result = Math.max(result,getMaxLength(list,current+1,totalLength));
		return result;
	}

}
