package September;

import java.util.Arrays;
import java.util.Stack;

public class LargestRectangleInAHistogram {
	public static void main(String[] args)
	{
		char[][] matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
		LargestRectangleInAHistogram O = new LargestRectangleInAHistogram();
		int ans = O.maximalRectangle(matrix);
		System.out.println(ans);
		
	}
	public int maximalRectangle(char[][] matrix) 
	{
        int[] height   = new int[matrix[0].length];
        int maxArea =0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]=='1') height[j]++;
                else height[j]=0;
            }
            maxArea = Math.max(maxArea,getMaxArea(height));
            System.out.println(maxArea);
        }
        return maxArea;
    }
    
    public int getMaxArea(int[] height)
    {
        Stack<Integer> stack = new Stack<>();
        int start=0;
        int area=0;
        for(int i=0;i<height.length;i++)
        {
        	int curr = height[i];
            if(stack.isEmpty() || curr >= height[stack.peek()]) stack.push(i);
            else
            {
                while(!stack.isEmpty() && curr < height[stack.peek()] )
                {
                    int h = height[stack.pop()];
                    if(stack.isEmpty()) area = Math.max(area,h*i);
                    else area = Math.max(area,h*(i-stack.peek()-1));
                }
                stack.push(i);
            }                       	
        }
        System.out.println(stack);
        while(!stack.isEmpty())
        { 
        		int i=height.length;
        		int w = stack.pop();
            if(stack.isEmpty())area = Math.max(area,height[w]*i);
            else area=Math.max(area, height[w]*(i-stack.peek()-1));
        }

        return area;
    }

}
