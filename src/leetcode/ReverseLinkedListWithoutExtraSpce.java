package leetcode;

class listNode
{
	String data;
	listNode nextNode;
	listNode(String data)
	{
		this.data = data;
		nextNode  = null;
	}
}

public class ReverseLinkedListWithoutExtraSpce 
{
	listNode head =null;
	listNode tail = null;
	public listNode addNode(String data)
	{
		if(data!=null)
		{
			if(head==null)
			{
				this.head = new listNode(data);
				this.tail=this.head;
				this.tail.nextNode=null;
			}
			else
			{
				listNode newNode = new listNode(data);
				newNode.nextNode =this.head;
				this.head=newNode;
			}
			return head;
			
		}
		else
			return null;
	}
	
	public static void main(String[] args)
	{
		ReverseLinkedListWithoutExtraSpce list = new ReverseLinkedListWithoutExtraSpce() ;
		list.addNode("3");
		list.addNode("2");
		listNode head = list.addNode("1");
//		while(head!=null)
//		{
//			System.out.println(head.data);
//			head=head.nextNode;
//		}
		
		System.out.println("=================Reverse order=================");
		
		list.printReverse(head);
		System.out.println("=================main order=================");
		while(head!=null)
			{
				System.out.println(head.data);
				head=head.nextNode;
			}
	}
	
	private void printReverse(listNode node)
	{
		if(node!=null)
		{
			printReverse(node.nextNode);
			System.out.println(node.data);
		}
	}

}
