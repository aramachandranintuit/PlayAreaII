package myplayarea;

import java.util.HashMap;
import java.util.HashSet;

public class complement {
	
	
	public static int ConvertToBinary(int a)
	{
		String r="";
		while(a>0)
		{
			r=a%2+r;
			a=a/2;
		}
		return Integer.parseInt(r);
	}
	public static void main(String[] args)
	{
		
//		System.out.println(ConvertToBinary(4));
		HashSet<Integer> s = new HashSet<Integer>();
		s.add(123);
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
//		map.remove(key)
//		Object[] a = s.toArray();
//		System.out.println(a[0]);
		int a=-100;
		System.out.println("100  "+Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(a));
		 a =a |a >> 1;
		 System.out.println(Integer.toBinaryString(a));
		 a =a |a >> 2;
		 System.out.println(Integer.toBinaryString(a));
		 a =a |a >> 4;
		 System.out.println(Integer.toBinaryString(a));
		 a =a |a >> 16;
		System.out.println(a);
		String str= Integer.toBinaryString(a);
		System.out.println(Double.valueOf(str));
		int b= getBinaryEquivalent(31);
		System.out.println(b);
		System.out.println(getInteger(111101));
		System.out.println(getInteger("111101"));
		
	}
	
	public static int getBinaryEquivalent(int a)
	{
		if(a==0)
			return 0;
		else
		{
			int r=0;
			for(int i=0;a>0;i++)
			{
				r=a%2*(int)Math.pow(10,i)+r;
				a=a/2;
			}
			return r;
			
		}
	}
	
	public static int getInteger(int binary)
	{
		int r=0;
		int i=0;
		while(binary>0)
		{
			if(binary>1)
			{
				r=r+((int)Math.pow(2,i)*(binary%10));
				binary=binary/10;
				i++;
			}
			else if(binary ==1)
			{
				r=r+(int)Math.pow(2,i)*1;
				binary=binary/10;
			}
				
		}
		return r;
	}
	
	public static int getInteger(String binary)
	{
		if (binary==null)
			return 0;
		int i=0;
		int r=0;
		while(i<binary.length())
		{
			if(binary.charAt(i)=='1')
			{
				r=(((int)Math.pow(2, binary.length()-1-i))*1) +r;
			}
			i++;
		}
		return r;
	}

}
