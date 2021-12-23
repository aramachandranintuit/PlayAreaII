# sample comment
import java.util.LinkedList;
import java.util.List;

interface samplePool {
	 public Object getResource() throws Exception;
	 public void release(Object object) throws Exception;
}

public class BlockingPool implements samplePool {
	
	public static void main(String[] args)
	{
		Object[] a = new Object[10];
		BlockingPool ob = new BlockingPool(a);
		
	}
	
	LinkedList<Object> pool = new LinkedList<Object>();
	
	public BlockingPool(Object[] object)
	{
		for(int i=0;i<object.length;i++)
		{
			pool.addFirst(object[i]);
		}
	}
	@Override
	public Object getResource() throws InterruptedException {
		synchronized(pool)
		{
			while(pool.isEmpty())
			{
				pool.wait();
			}
			return pool.removeLast();
		}
	}

	@Override
	public void release(Object object) {
		synchronized(pool)
		{
			pool.addFirst(object);
			pool.notifyAll();
		}
		
	}

}
