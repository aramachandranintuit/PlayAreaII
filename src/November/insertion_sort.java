package November;

import java.util.ArrayList;
import java.util.List;

class ListNode
{
	int val;
	ListNode next;
	ListNode(int val)
	{
		this.val=val;
		this.next=null;
	}
}
public class insertion_sort {
	ListNode head = null;
	ListNode tail= null;
	
	public ListNode addNode(int val)
	{
		ListNode node = new ListNode(val);
		if(head==null)
		{
			tail = node;
			head=tail;
		}
		else 
		{
			tail.next=node;
			tail = node;
		}
		return head;
	}
	
	
	public static void main(String[] args)
	{
		insertion_sort list = new insertion_sort();
		list.addNode(3);
		list.addNode(5);
		list.addNode(2);
		list.addNode(1);
		ListNode head = list.head;
		ListNode temp = list.head;
		List<Integer> arrayList = new ArrayList<Integer>();		
		while(head!=null)
		{
			arrayList.add(head.val);
			head=head.next;
		}
		

		Object[] b =arrayList.toArray();
		b=insertionsort(b);
//		for(int i=0;i<b.length;i++)
//		{
//			System.out.println(b[i]);
//		}
		int i=0;
		while(temp!=null)
		{
			temp.val =(int)b[i];
			i++;
			System.out.println(temp.val);
			temp=temp.next;
			
		}
		
	}
	
	public static Object[] insertionsort(Object[] a)
	{
		for(int i=1;i<a.length;i++)
		{
			int j=i-1;
			int p = (int)a[i];			
			while(j>=0 && p<(int)a[j])
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=p;
		}
		return a;
		
	}

}
