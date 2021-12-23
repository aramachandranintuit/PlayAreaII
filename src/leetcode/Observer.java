package leetcode;

import java.util.ArrayList;
import java.util.List;

class stack
{
	List<Observer> list;
	
	stack(List<Observer> list)
	{
		this.list = list;
	}
	
	public void registerObserver(Observer observer)
	{
		this.list.add(observer);
	}
	
	public void startProvisioning()
	{
		for(Observer resource:list)
		{
			resource.InitiateResourceCreation();
		}
	}
}

public abstract class Observer {
	
	public void InitiateResourceCreation()
	{
		System.out.println("creation started");
	}
	
	public static void main(String[] args)
	{
		List<Observer> list = new ArrayList<Observer>();
		list.add(new VMObserver());
		list.add(new VolumeObserver());
		list.add(new NICObserver());
		stack s = new stack(list);
		s.startProvisioning();
	}

}

class VMObserver extends Observer
{
	@Override
	public void InitiateResourceCreation()
	{
		System.out.println("VM creation started");
	}
	
}

class VolumeObserver extends Observer
{
	@Override
	public void InitiateResourceCreation()
	{
		System.out.println("Volume creation started");
	}
	
}

class NICObserver extends Observer
{
	@Override
	public void InitiateResourceCreation()
	{
		System.out.println("NIC creation started");
	}
	
}
