package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MostVisitedInCircularTrack {
	
	public static void main(String[] args)
	{
		System.out.println(mostVisited(4,new int[] {2,1,2,1,2,1,2,1,2}));
	}
	public static List<Integer> mostVisited(int n, int[] round) {
        int[] s = new int[n+1];
        int j=0;
        for(int i=0;i<round.length-1;i++)
        {  
            if(round[i] < round[i+1])
            {
                j=round[i];
                while(j<=round[i+1])
                {
                    s[j]++;
                    j++;
                }
                
            }
            else if(round[i] >round[i+1])
            {
                j=round[i];
                while(j!=round[i+1])
                {
                    s[j]++;
                    j++;
                    
                    if(j==n)
                    {
                        j=1;
                    }
                }
            }
            
        }
        
        System.out.println(Arrays.toString(s));
        int max=s[1];
        List<Integer> list=new ArrayList<Integer>();
        for(int i=1;i<s.length;i++)
        {
            if(max <= s[i])
            {
                list.add(i);
                max=s[i];
            }
        }
        
        return list;
    }

}
