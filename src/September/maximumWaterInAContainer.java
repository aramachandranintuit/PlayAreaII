package September;

public class maximumWaterInAContainer {
	/*
	 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.
Notice that you may not slant the container.
	 * 
	 */
	public static void main(String[] args)
	{
		//each array in a represents a container array, eac Question.
		int [][] a = {{1,8,6,2,5,4,8,3,7} ,{1,1},{4,3,2,1,4},{1,2,1}};
		for(int[] r : a)
		{
			System.out.println(findMaximumWaterInAContainer(r));
		}
		
	}
	public static int findMaximumWaterInAContainer(int[] a)
	{
		int i=0;
		int j=a.length-1;
		int area=0;
		while(i<a.length && j>=0)
		{
			int h = Math.min(a[i], a[j]);
			int l = j-i;
			area = Math.max(area, h*l);
			if(a[i]>a[j]) j--;
			else i++;
		}
		return area;
		
	}

}
