package September;

import java.util.HashSet;

public class NextClosestTime {
	public static void main(String[] args)
	{
		nextClosetTime("19.35");
	}
	
	public static String nextClosetTime(String time)
	{
		int t = Integer.parseInt(time.substring(0,2))*60;
		t+=Integer.parseInt(time.substring(3));
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<time.length();i++)
		{
			set.add(time.charAt(i)-'0');
		}
		t++;
		while(true)
		{
			if(set.contains(t/60/10) && set.contains(t/60%10) && set.contains(t%60/10) && set.contains(t%60%10)) 
			{
				String ans = t/60/10+""+t/60%10+":"+t%60/10+""+t%60%10;
				System.out.println(ans);
				return ans;
			}
			t++;
		}
		
	}

}
