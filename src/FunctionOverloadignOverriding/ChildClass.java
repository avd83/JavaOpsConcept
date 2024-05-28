package FunctionOverloadignOverriding;

public class ChildClass extends ParentClass{
	
	public void getData(int a)
	{
	System.out.println(a);
	}
	public void getData(String a)
	{
	System.out.println(a);
	}
	public void getData(int a,int b)
	{
	System.out.println(a);
	System.out.println(b);
	}
	public void audioSystem()
	{
		System.out.println("Chld  Audio");
	}
	
	public static void main(String[] args) {
		
		ChildClass c = new ChildClass();
		//function overloading
		c.getData(1);
		c.getData("abhay");
		c.getData(3, 4);
		
		//function overriding
		c.audioSystem();

	}

}
