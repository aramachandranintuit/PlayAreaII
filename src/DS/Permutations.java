package DS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Permutations {
	
	public static void main(String[] args)
	{
		int [] nums = {1,3,2,3,4};
		List<List<Integer>> list = getPermutations(nums);
		for(int i=0;i<list.size();i++)
		{
			List<Integer> nosList = list.get(i);
			for(int j=0;j<nosList.size();j++)
			{
				System.out.println(nosList);
			}
		}
	}
	
	private static List<List<Integer>> getPermutations(int[] nos)
	{
		List<List<Integer>> list = new ArrayList<>();
		for(int i=0;i<nos.length;i++)
		{
			int num=nos[i];
			int[] tem = nos;
			for(int j=0;j<nos.length;j++)
				{
				List<Integer> nosList = new ArrayList<Integer>();
					int temp = tem[j];
					tem[j] = num;
					num=tem[j];
					for(int c : tem)
					{
						nosList.add(c);
					}
					list.add(nosList);
				}
			
		}
		return list;
	}
}
