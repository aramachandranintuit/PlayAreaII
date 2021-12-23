package DS;

import java.util.HashSet;
import java.util.Iterator;

public class InterleavingOfStrings {
	
	public static void main(String[] args)
	{
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);set.add(3);
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			int a =(int) itr.next();
			System.out.println(a);
			itr.remove();
		}
//		String	A = "aabcc";
//		String	B = "dbbca";
//		String	C = "aadbbcbcac";
//		InterleavingOfStrings str = new InterleavingOfStrings();
//		char[] a_Array = str.remove(A, C);
//		String C_str="";
////		System.out.println(a_Array);
//		char[] b_Array = str.remove(B, C);
//		System.out.println(b_Array);
//		for(int i=0;i<a_Array.length;i++)
//		{
//			if(a_Array[i]!=' ')
//				C_str+=a_Array[i];
//		}
//		System.out.println(C_str);
	}

	private char[] remove(String a , String c)
	{
		int i=0,j=0;
		char[] aArray = a.toCharArray();
		char[] cArray = c.toCharArray();
		while(j<c.length() && i<a.length())
		{
				if((aArray[i] == cArray[j]))
				{
					cArray[j]=' ';
					i++;
					j++;
				}
				else if(aArray[i]!=cArray[j])
				{
					j++;
				}			
		}
		return cArray;
		 
	}
	
	private static boolean isInterleaved(String s1,String s2,String s3)
	{
		boolean[][] dp = new boolean[s1.length()][s2.length()];
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				
			}
		}
				
	}
	
	
	

}
