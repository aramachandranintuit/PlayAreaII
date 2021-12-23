package DS;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class QueueUsingStack {
	
	static Stack<String> input = new Stack<String>();
	static Stack<String> output = new Stack<String>();
	
	public static void main(String[] args)
	{
		Integer a = 9;
		int b = 0;
		aM(b);
		List<Integer> aList = new ArrayList<Integer>();
		aList.add(null);
		aM(null);
//		QueueUsingStack queue = new QueueUsingStack();
//		queue.addToQueue("1");
//		queue.addToQueue("2");
//		queue.addToQueue("3");
//		
//		System.out.println(new QueueUsingStack().getFromQueue());
//		System.out.println(new QueueUsingStack().getFromQueue());
//		System.out.println(new QueueUsingStack().getFromQueue());
		
	}
	
	private static void aM(Integer a)
	{
		int j = a % 2 ;
		
	}

	private  String addToQueue(String a)
	{
		return input.push(a);
	}
	
	private   String getFromQueue()
	{
		if(output.isEmpty())
		{
			while(!input.isEmpty())
			{
				String str = input.pop();
				output.push(str);
			}
		}
		
		return output.pop();
	}
}
