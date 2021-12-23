import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class MemoryLeak implements Runnable {
	
	BlockingQueue<Integer> pool = new LinkedBlockingDeque<Integer>(5);
	public static void main(String[] args) throws InterruptedException
	{		
		MemoryLeak m = new MemoryLeak();
		for(int i=0;i<100;i++)
		{
			m.addToPool(i);
			
		}
		
		System.out.println(m.releasFromPool());
		
		
	}
	private void addToPool(int val) throws InterruptedException
	{
		synchronized(pool)
		{
			while(pool.remainingCapacity()==0)
			{
				pool.wait();
			}
			pool.add(val);
			pool.notifyAll();
		}
		
	}
	
	private int releasFromPool() throws InterruptedException
	{	int a=0;
		synchronized(pool)
		{
			while(pool.isEmpty())
			{
				pool.wait();
			}
			a =pool.remove();
			pool.notifyAll();
		}
		return a;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}



}
