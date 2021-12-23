package myplayarea;

import java.util.LinkedList;
import java.util.List;

public class LinkedLIst_Sum_Total {
	
	public static void main(String[] args)
	{
		List<Integer> intList = new LinkedList<Integer>();
		intList.add(9);
		intList.add(3);
		intList.add(12);
		
		List<Integer> intList1 = new LinkedList<Integer>();
		intList1.add(9);
		intList1.add(11);
		intList1.add(12);
		int size = intList.size();
		
		List<Integer> intList2 = new LinkedList<Integer>();
		int temp=0;
		for(int i=intList.size()-1;i>=0;i--)
		{
			if(i>0)
			{
				temp = temp + intList.get(i) + intList1.get(i);
				intList2.add(temp >9? temp= temp%10 : 0 );
			}
			else if(i==0)
			{
				temp = temp + intList.get(i) + intList1.get(i);
				intList2.add(temp);
			}
		}
		
		for(int i=intList2.size()-1;i>=0;i--)
		{
			System.out.println(intList2.get(i));
		}
		
		
	}

}
