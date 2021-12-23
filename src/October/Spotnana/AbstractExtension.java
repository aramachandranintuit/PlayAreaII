package October.Spotnana;

abstract class Diagram
{
	public abstract int getPerimeter();
}
public class AbstractExtension extends Diagram{
	public int getDiagram()
	{
		return 0;
	}
	
	public int getPerimeter()
	{
		return -1;
	}
	

}
