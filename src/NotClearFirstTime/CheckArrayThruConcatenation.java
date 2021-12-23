package NotClearFirstTime;

public class CheckArrayThruConcatenation {
	
	public static void main(String[] args)
	{
//		[49,18,16]
//				[[16,18,49]]
//		[2,82,79,95,28]
//				[[2],[82],[28],[79,95]]
//		{16,18,49};
		int[] arr = {49,18,16};
//		{{49,18,16}};
		int[][]pieces = {{16,18,49}};
		System.out.println(canFormArray(arr, pieces));
	}
	
public static boolean canFormArray(int[] arr, int[][] pieces) {
        
        for(int i=0;i<pieces.length;i++)
        {
            if(pieces[i].length==1)
            {
                if(getIndex(arr,pieces[i][0])==-1) return false;
            }
            if(pieces[i].length>1)
            {
                int index = getIndex(arr,pieces[i][0]);
                int r =index;
                System.out.println(index+1);
        			System.out.println(pieces[i].length);
        			System.out.println(r);
                if(index==-1)
                    return false;
                for(int j=0;j<pieces[i].length && r<arr.length;j++)
                {
                    if(arr[r]!=pieces[i][j])
                        return false;
                    r++;
                }
            }                
    
       }
                   return true;
    }
    
    private static int getIndex(int[] a, int b)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==b)
                return i;
        }
        return -1;
    }

}
