package march;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class meetingRooms {
	
	public static void main(String[] args)
	{
		int[][] i = {{0,30},{5,10},{15,20}};
		PriorityQueue<Integer> p = new PriorityQueue<Integer>(
				i.length,new Comparator<Integer>() {
					@Override
					public int compare(Integer a ,Integer b)
					{
						return a-b;
					}					
				});
		
		Arrays.sort(i,new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				
				return o1[0]-o2[0];
			}			
		});
		
		p.add(i[0][1]);
		for(int j=1;j<i.length;j++)
		{
			if(i[j][0] > p.peek())
				p.poll();
			p.add(i[j][1]);
		}
		System.out.println(p.size());
	}
	

}
