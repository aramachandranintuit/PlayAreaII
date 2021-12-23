package september2020;

import java.util.Arrays;

public class search2DMatrix {
	public static void main(String[] args)
	{
		int[][] matrix = {{111,30,5,7},{10,11,16,20},{23,30,34,50}};
		Arrays.sort(matrix[0]); System.out.println(Arrays.toString(matrix[0]));
		Arrays.sort(matrix[1]);
		Arrays.sort(matrix[2]);
		System.out.println(matrix[0].length);
		System.out.println(matrix[0][0]);
		System.out.println(searchMatrix(matrix,13));
	}
	
	public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0)
            return false;
       else if(matrix[0].length==0)
            return false;
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][0] <= target && matrix[i][matrix[i].length-1]>=target)
            {
                    for(int j=0;j<matrix[i].length;j++)
                    {
                        if(matrix[i][j]==target)
                            return true;
                    }
            }       
        } 
        return false;
    }

}
