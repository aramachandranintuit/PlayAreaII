package DS;

public class TreeRotation 
 {
	class Node implements Comparable<Node>
	{
		Integer data;
		Node leftNode;
		Node rightNode;
		
		Node(int data)
		{
			this.data = data;
			this.leftNode = this.rightNode = null;
		}
		
		@Override
		public int hashCode()
		{
			return this.data.hashCode();
		}

		@Override
		public boolean equals(Object o)
		{
			if(o!= null)
			{
				if( ((Node)o).data == this.data && ((Node)o).leftNode == this.leftNode && ((Node)o).rightNode == this.rightNode)
				{
					return true;
				}
			}
			return false;
		}
		@Override
		public int compareTo(Node o) {
			return o.data - this.data;	
		}
		
	}
	
	Node root = null;
			
	public Node addNode(Integer data,Node root)
	{
		if(data !=null)
		{
			if(root == null)
			{
				this.root = new Node(data);
			}
			else if (data >= this.root.data)
			{
				
					root.rightNode = addNode(data,root.rightNode);
			}
			else
			{
				root.leftNode = addNode(data,root.leftNode);
			}
			return root;
		}
		return null;
	}
	
	public static void main(String[] args)
	{
		
	}

}
