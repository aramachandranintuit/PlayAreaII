package November;

public class flipAnImage {
	
	public static void main(String[] args)
	{
		
		int a[][]= {{1,0,0},{1,0,1},{0,0,0}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]==0)
					a[i][j]=1;
				else
					a[i][j]=0;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length/2;j++)
			{				
				int temp = a[i][j];
				a[i][j]=a[i][a.length-1-j];
				a[i][a.length-1-j] = temp;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}

}
