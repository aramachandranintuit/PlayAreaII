package myplayarea;

import java.util.Arrays;
import java.util.Comparator;

public class puzzle3 {
	
	public static void main(String[] args)
	{	
		String[] a = {"aaaaa","aa","aaaaaaaaa"};
		sorter s = new sorter();
		Arrays.sort(a, s);
		for(String i:a)
		{
			System.out.println(i);
		}
	}

}

class sorter implements Comparator<String>
{

	@Override
	public int compare(String a1, String a2) {
		// TODO Auto-generated method stub
		return a2.compareTo(a1);
	}
	
}
