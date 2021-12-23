

package leetcode;

public class MergeSort {
	
	public static void main(String[] args)
	{
		int[] arr = {13,3,12,4,1,4};
		new MergeSort().sort(arr, 0, arr.length-1);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	private void  sort(int arr[] , int l , int r)
	{
		if(l<r)
		{
			int m = (l+r)/2;
			sort(arr,l,m);
			sort(arr,m+1,r);
			merge(arr,l,m,r);
		}
	}
	
	private void merge(int arr[],int start , int mid , int end)
	{
		int[] temp = new int[end -start +1];
		int i=start,j=mid+1,k=0;
		while(i<=mid && j<=end)
		{
			if(arr[i] <=arr[j])
			{
				temp[k] = arr[i];
				i++;
			}
			else
			{
				temp[k]=arr[j];
				j++;
			}
			k++;
		}
		while(i<=mid)
		{
			temp[k]=arr[i];
			i++;
			k++;
		}
		while(j<=end)
		{
			temp[k]=arr[j];
			j++;
			k++;
		}
		
		for(int i1=start;i1<=end;i1++)
		{
			arr[i1]=temp[i1-start];
		}
		
	}

}
