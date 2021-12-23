package quizAmz;

public class TreeRotatation {
	
	class Node implements Comparable<Node>
	{
		int value;
		Node leftNode;
		Node rightNode;
		@Override
		public int compareTo(Node o) 
		{
			return this.value - o.value;
		}
		
		Node(int value)
		{
			this.value = value;
			this.leftNode = this.rightNode = null;
		}
		
		public int hashCode()
		{
			return Integer.valueOf(this.value).hashCode();
		}
		public boolean equals(Object o)
		{
			if(o instanceof Node)
			{
				if(((Node)o).value == this.value && this.rightNode == ((Node)o).rightNode && this.leftNode == ((Node)o).leftNode)
				return true;
			else
				return false;
			}
			return false;
			}
		}
		
	}

}
