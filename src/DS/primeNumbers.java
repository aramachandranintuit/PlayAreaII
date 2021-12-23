package DS;

public class primeNumbers {
	
	public static void main(String[] args)
	{
		int n=100;
		
		boolean[] p = new boolean[n];
		p[0]=false;
		p[1]=false;
		for(int i=2;i<p.length;i++)
		{
			if(p[i]==false)
			{
				for(int j=i;i*j<n;j++)
				{
					p[i*j]=true;
				}
			}
		}
		for(int i=1;i<p.length;i++)
		{
			if(p[i]==false) System.out.println(i);
		}
		
	}

}
