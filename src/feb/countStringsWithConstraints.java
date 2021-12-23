package feb;

public class countStringsWithConstraints {
	
	public static void main(String[] args)
	{
		System.out.println(count(3,1,2));
	}
	
	public static int count(int n,int bCount, int cCount)
	{
		if(bCount <0 || cCount<0 ) return 0;
		if(n==0) return 1;
		if(bCount ==0 && cCount==0 ) return 1;
		int res = count(n-1,bCount,cCount);
		res+=count(n-1,bCount-1,cCount);
		res+=count(n-1,bCount,cCount-1);
		return res;
	}
}
