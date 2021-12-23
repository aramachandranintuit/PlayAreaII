package DS;

public class MergeSort {
	
	public static void main(String[] args)
	{
		int [] a = {10,12,9,18,100};
		MergeSort ms = new MergeSort();
		ms.sort(a, 0, a.length-1);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public void sort(int[] a,int startIndex,int endIndex)
	{
		if(endIndex-startIndex>1)
		{
			int middle = (startIndex+endIndex)/2;
			sort(a,startIndex,middle);
			sort(a,middle+1,endIndex);
			merge(a,startIndex,middle,endIndex);	
		}
	}
	public void merge(int[] a, int startIndex,int middle,int endIndex)
	{
		int[] temp = new int[endIndex-startIndex+1];
		int l=startIndex;
		int m=middle+1;
		int i=0;
		while(l<=middle && m<=endIndex)
		{
			if(a[l]<=a[m])
			{
				temp[i]=a[l];
				i++;
				l++;
			}
			else{
				temp[i]=a[m];
				i++;
				m++;
			}
		}
		while(l<=middle)
		{
			temp[i]=a[l];
			i++;
			l++;		
		}
		while(m<=endIndex)
		{
			temp[i]=a[m];
			i++;
			m++;
		}
		for(int h=startIndex;h<=endIndex;h++)
		{
			a[h]=temp[h-startIndex];
		}
	}

}
