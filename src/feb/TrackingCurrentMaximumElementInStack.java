package feb;

import java.util.Stack;

public class TrackingCurrentMaximumElementInStack {
	
	Stack<Integer> s = new Stack<Integer>();
	Stack<Integer> trackStack = new Stack<Integer>();
	public static void main(String[] args)
	{		
		int[] a = {10,1,90,100,76,900};		
		TrackingCurrentMaximumElementInStack t = new TrackingCurrentMaximumElementInStack();
		t.push(10);
		System.out.println(t.max());
		t.push(1);
		t.push(90);
		System.out.println(t.max());
		t.push(76);
		t.pop();                                     
		System.out.println(t.max());
		t.push(900);
		System.out.println(t.max());
	}
	
	void push(int a)
	{
		s.push(a);
		if(!trackStack.isEmpty() && trackStack.peek()<a)
			trackStack.push(a);
		else if(!trackStack.isEmpty()) trackStack.push(trackStack.peek());
		else trackStack.push(a);
	}
	int pop()
	{
		int a = s.pop();
		trackStack.pop();
		return a;
	}
	
	int max()
	{
		return trackStack.peek();
	}

}
