package Inheritance;

public class ChildDemo extends ParentDemo {

	public void engine()
	{
		System.out.println("Engine");
	}
	
	public void color()
	{
		System.out.println(color);
	}
	
	
	public static void main(String[] args) {
		ChildDemo c = new  ChildDemo();
		c.color();
		c.engine();
		c.gear();
		c.breaks();
	}

}
