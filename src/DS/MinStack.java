package DS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class MinStack {
	
	public static void main(String[] args)
	{
		MinStack stack = new MinStack();
		stack.push(-2);
		stack.push(0);
		stack.push(-3);
		System.out.println(stack.getMin());
		stack.pop();
		System.out.println(stack.top());
		System.out.println(stack.getMin());
	}
	
	LinkedList<Integer> list = new LinkedList<Integer>();
	TreeSet<Integer> set = new TreeSet<Integer>();
	
	public void push(int val)
	{
		list.addFirst(val);
		set.add(val);
	}
	
	public void pop()
	{
		set.remove(list.remove(0));
		
	}
	
	public int top()
	{
		return list.get(0);
	}
	
	public int getMin()
	{
		return set.first();
	}

}
