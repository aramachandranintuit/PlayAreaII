package leetcode;

public class median {
	
	public static void main(String[] args)
	{
		int[] a = {0,0};
		int[] b = {0,0};
		System.out.println(findMedianSortedArrays(a,b));
	}
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] c = new int[(int)(nums1.length/2.0+nums2.length/2.0)+1];
        int i=0;int j=0;int k=0;
        while(k < c.length)
        {
                if(i < nums1.length && j < nums2.length)
                {
                    if(nums1[i] <= nums2[j])
                    {
                        c[k] = nums1[i];
                            i++;
                    }
                    else
                    {
                        c[k] =nums2[j];
                            j++;
                    }
                k++;
            }
            else if(i < nums1.length)
            {
                c[k]=nums1[i];
                    i++;
                    k++;
            }
            else 
            {
                c[k] = nums2[j];
                    j++;
                    k++;
            }
        }
        
        
        if((nums1.length+nums2.length)%2 == 0)
        {
            return (c[c.length-1] +c[c.length-2])/2.0;
        }
        else 
            return c[c.length-1];
        
    }

}
