package leetcode;

public class TreeRotation {
	
	class Node {
		
		Node leftChild;
		Node rightChild;
		String data;
		Node(String data)
		{
			this.data = data;
			this.leftChild = this.rightChild = null;
		}
		
		@Override
		public int hashCode()
		{
			return this.data.hashCode();
		}
		
		@Override
		public boolean equals(Object o)
		{
			if (o instanceof Node)
			{
				if( (((Node)o).data == this.data) && (((Node)o).leftChild == this.leftChild ) && ( ((Node)o).rightChild == this.rightChild ) )
					{
						return true;
					}
					else
					{
						return false;
					}
				
			}
			else 
				return false;
		}
	}
	
	Node root = null ;
	
	Node addNode(String data)
	{
		if( this.root == null)
		{
			this.root = new Node(data);	
		}
		else if()
	}
	
	public static void main(String[] args)
	{
		
	}

}
