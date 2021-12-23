package mock;

public class deduplicate {
	public static void main(String[] args)
	{
		System.out.println(new deduplicate().deduplicate("abaabaabaabaaba",""));		
	}

	private String deduplicate(String str,String d)
	{
		if(str==null)
			return null;
		if(str.length()==0)
			return d;
		for(int i=1;2*i+1<str.length();i++)
		{
			if(str.substring(0,i+1).equals(str.substring(i+1,2*i+2)))
			{
				if(isPatternRepeatedForEntireString(str.substring(0,i+1),str))
				{
					d=str.substring(0,i+1);
					return d;
				}
				
				
			}
		}
		return d;
	}
	
	private boolean isPatternRepeatedForEntireString(String str,String mainString)
	{
		int n= mainString.length()/str.length();
		StringBuilder s = new StringBuilder();
		for(int i=1;i<=n;i++)
		{
			s.append(str);
		}
//		System.out.println(s.toString());
//		System.out.println(mainString);
		if(s.toString().equals(mainString))
			return true;
		else 
			return false;
	}
}
