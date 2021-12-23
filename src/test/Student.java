package Test;

import java.util.Objects;

public class Student {
	
	int age;
	String name;
	
	Student(int age,String name)
	{
		this.name=name;
		this.age=age;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(! (o instanceof Student))
		{
			return false;
		}
		else if ( ((Student)o).age==this.age && ((Student)o).name.equals(this.name))
			{
				return true;
			}
		else
			return false;
		}

	@Override
	public int hashCode()
	{
		return Objects.hash(this.age,this.name);
		
	}
	
	public static void main(String[] args)
	{
		Student st1 = new Student (12,"a1");
		Student st2 = new Student (12,"a1");
		
		System.out.println(st1==st2);
	}
}
