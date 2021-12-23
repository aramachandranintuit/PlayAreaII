package August;

import java.util.ArrayList;
import java.util.List;

public class AllCombinationOfbrackets {
	public static void main(String[] args)
	{
		int len=6;
		List<String> list = new ArrayList<String>();
		allCombinations(list,new StringBuilder(),0,0,len);
		for(String a : list)
		{
			System.out.println(a);
		}
	}
	
	public static void allCombinations(List<String> list , StringBuilder sb,int leftCount,int rightCount,int len)
	{
		if(leftCount+rightCount==len)
		{
			String s = new String(sb);
			list.add(s);
			return;
		}
		if(leftCount<len/2) {
			sb.append("{");
			allCombinations(list,sb,leftCount+1,rightCount,len);
			sb.deleteCharAt(sb.length()-1);
		}
		if(rightCount<leftCount) {
			sb.append("}");
			allCombinations(list,sb,leftCount,rightCount+1,len);
			sb.deleteCharAt(sb.length()-1);
		}
	}

}
