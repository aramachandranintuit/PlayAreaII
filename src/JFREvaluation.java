import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class JFREvaluation {
	public static void main(String[] args)
	{
		LinkedBlockingQueue<byte[]> queue = new LinkedBlockingQueue<>();
		Runnable producer = () -> {
			while(true)
			{
				queue.offer(new byte[1*1024*1024]);
				try
				{
					TimeUnit.MILLISECONDS.sleep(10);					
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			
		};
		
		Runnable consumer = () -> {
			while(true)
			{
				try {
					queue.take();
					TimeUnit.MILLISECONDS.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
			}
		};
		
		
		new Thread(producer, "Producer Thread").start();
        new Thread(consumer, "Consumer Thread").start();
	}

}
