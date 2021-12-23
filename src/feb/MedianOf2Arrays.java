package feb;

public class MedianOf2Arrays {
	
	public static void main(String[] args)
	{
		int [] nums1 = {1,2};
		int[] nums2 = {};
		System.out.println(nums2.length);
//		System.out.println(findMedianSortedArrays(nums1,nums2));
	}
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        if(nums1.length==0 && nums2.length==0) return 0.0;
        int r = (nums1.length + nums2.length);
        double m=0.0;
        double m1=0.0;
        int i=0;
        int j=0;
        int k=0;
        if(r%2==1) 
        {
            while(k<=r/2 && i<nums1.length && j<nums2.length)
            {
                if(nums1[i] <= nums2[j])
                {
                    m=(double)nums1[i];
                    k++;
                    i++;
                }
                else if(nums1[i] > nums2[j])
                {
                    m=(double)nums2[j];
                    k++;
                    j++;
                }                
            }
            while(i<nums1.length && k<r/2)
            {
            		m=(double)nums1[i];
                k++;
                i++;
            }
            while(j<nums2.length && k<r/2)
            {
            		m=(double)nums2[j];
                k++;
                j++;
            }
            return (double)(m);
        }
        else 
        {
            while(k<=(r)/2 && i<nums1.length && j<nums2.length)
            {
                m1=m;
                if(i<nums1.length && j<nums2.length && nums1[i] <= nums2[j])
                {
                    m=(double)nums1[i];
                    k++;
                    i++;
                }
                else if(i<nums1.length && j<nums2.length && nums1[i] > nums2[j] )
                {
                    m=(double)nums2[j];
                    k++;
                    j++;
                }
            }
            while(i<nums1.length && k<=r/2)
            {
            		m1=m;
            		m=(double)nums1[i];
                k++;
                i++;
            }
            while(j<nums2.length && k<=r/2)
            {
            		m1=m;
            		m=(double)nums2[j];
                k++;
                j++;
            }
            System.out.println("m"+m);
            System.out.println("m1"+m1);
            return (double)(m+m1)/2;
        }
    }

}
