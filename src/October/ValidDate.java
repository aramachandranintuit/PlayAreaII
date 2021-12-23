package October;

import java.util.ArrayList;
import java.util.List;

public class ValidDate {
	
	public static void main(String[] args)
	{
		String[] nums = {"2", "7", "1929"};
		List<List<String>> list = new ArrayList<>();
		getAllPermutations(nums,0,nums.length,new boolean[nums.length],list,new ArrayList<>());
		System.out.println(list);
	}

	public static void getAllPermutations(String[] nums,int index,int count,boolean[] visited,List<List<String>> list,List<String> sb)
	
	{
		if(index==count)
		{
			List<String> ls =new ArrayList<>(sb);
			list.add(ls);
			return;
		}
		for(int i=0;i<nums.length;i++)
		{
			if(visited[i]==false)
			{
				sb.add(nums[i]);
				visited[i]=true;
				getAllPermutations(nums,index+1,count,visited,list,sb);
				sb.remove(sb.size()-1);
				visited[i]=false;
			}
		}
	}
	
	
}
