package Medium;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumNumberOfSpaces {
	
	public static void main(String[] args)
	{
		String s ="31423567812315674563578126353628127";
		String[] a = {"314","678123156","7812635362812","4","3"};
		
		Comparator<String> cmp = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.length() - o1.length();
			}			
		};
		Arrays.sort(a,cmp);
		System.out.println(Arrays.toString(a));
		System.out.println(noOfSpaces(s,a,0));
		
	}
	
	private static int noOfSpaces(String s,String[] a,int index)
	{
		if(index==a.length)
			return 0;
		int l = s.indexOf(a[index]);		
		if(l>-1)
			{
				System.out.println(s.substring(0,l)+s.substring(l+a[index].length(),s.length()));
				return 1+noOfSpaces(s.substring(0,l)+s.substring(l+a[index].length(),s.length()),a,index+1);
			}
		else 
			return noOfSpaces(s,a,index+1);
	}

}
