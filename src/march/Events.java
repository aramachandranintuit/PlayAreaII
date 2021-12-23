package march;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/*
 * [[1,2],[2,3],[3,4]]
[[1,2],[2,3],[3,4],[1,2]]
[[1,4],[4,4],[2,2],[3,4],[1,1]]
[[1,100000]]
[[1,1],[1,2],[1,3],[1,4],[1,5],[1,6],[1,7]]
 * 
 * 
 */

public class Events {
	
	public static void main(String[] args)
	{
		int[][] a = {{1,4},{4,4},{2,2},{3,4},{1,1}};
		System.out.println(maxEvents(a));
	}
	
	public static int maxEvents(int[][] events) {
        
        Arrays.sort(events , new Comparator<int[]>(){
           
            @Override
            public int compare(int[] a, int []b)
            {
                 if(a[0]!=b[0]) return a[0]-b[0];
                 else {
                     return a[1]-b[1];
                 }
            }
            
        });
//        System.out.println(Arrays.toString(events));
        
        PriorityQueue<int[]> p = new PriorityQueue<int[]>(events.length,new Comparator<int[]>(){
           
            @Override
            public int compare(int[] a , int[] b)
            {
                return b[1]-a[1];
            }
            
        });
        p.offer(events[0]);
        for(int i=1;i<events.length;i++)
        {
            if(!p.isEmpty() && p.peek()[1] < events[i][0])
            {
                p.poll();
            }
            p.offer(events[i]);
        }
        
        return p.size();
        
    }

}
