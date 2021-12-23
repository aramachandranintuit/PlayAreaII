package mock;

import java.util.Arrays;
import java.util.Comparator;



public class orderingLogs {
	public static void main(String[] args)
	{
		Comparator<String> cmp = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				String[]a1 = o1.split(" ",2);
				String[]a2 = o1.split(" ",2);
				boolean isDigit1 = Character.isDigit(a1[1].charAt(0));
				boolean isDigit2 = Character.isDigit(a2[1].charAt(0));
				if(isDigit1 & isDigit2)
					return 1;
				else if(isDigit1 = isDigit2)
					return 0;
				else 
					return -1;
				
			}
			
		};
		String[] a = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
		Arrays.sort(a,cmp);
		System.out.println(Arrays.toString(a));
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i].hashCode());
//		}
	}

}
