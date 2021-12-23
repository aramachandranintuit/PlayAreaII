package October.m;

/*
 * [3,7,3,7, 2, 1, 2]
 * An array is called "switching" if the odd and even elements are equal.
Example:
[2,4,2,4] is a switching array because the members in even positions (indexes 0 and 2) and odd positions (indexes 1 and 3) are equal.

If A = [3,7,3,7, 2, 1, 2], the switching sub-arrays are:

== > [3,7,3,7] and [2,1,2]

Therefore, the longest switching sub-array is [3,7,3,7] with length = 4.

As another example if A = [1,5,6,0,1,0], the the only switching sub-array is [0,1,0].

Another example: A= [7,-5,-5,-5,7,-1,7], the switching sub-arrays are [7,-1,7] and [-5,-5,-5].
 * 
 */
public class Switching {

	public static void main(String[] args)
	{
		int [] a= {1,5,6,0,1,0};
		if(a.length<2) {
			System.out.println("the lenght is " +2);
			return ;
		}
		int t=2;
		int ans=0;
		for(int i=2;i<a.length;i++)
		{
			if(a[i]==a[i-2]) t++;
			else t=2;
			ans = Math.max(ans,t);
		}
		System.out.println(ans);
	}
}
