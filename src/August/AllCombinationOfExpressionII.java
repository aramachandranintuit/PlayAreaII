package August;
import java.util.List;
import java.util.ArrayList;
public class AllCombinationOfExpressionII {
	public static void main(String[] args)
	{
		String s="1#2#3#4#5";
		String c="+-*/";
		List<String> list = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		AllCombinationOfExpressionII o = new AllCombinationOfExpressionII();
		o.getAllCombinations(list,sb,0,new boolean[c.length()],c,s);
		System.out.println(list);
		
	}
	
	public void getAllCombinations(List<String> list,StringBuilder sb,int index,boolean[] visited, String operator,String str)
	{
		if(index>=str.length())
		{
			list.add(sb.toString());
			return;
		}
		for(int i=0;i<operator.length() && index<str.length();i++)
		{
			StringBuilder s = new StringBuilder(sb);
			if(str.charAt(index)=='#' && !visited[index])
			{
				s.append(operator.charAt(i));
				visited[i]=true;
				getAllCombinations(list,s,index+1,visited,operator,str);
				s.deleteCharAt(s.length()-1);
				visited[i]=false;				
			}
			else 
			{
				s.append(str.charAt(index));
				getAllCombinations(list,s,index+1,visited,operator,str);
				s.deleteCharAt(s.length()-1);
			}
		}
	}

}
