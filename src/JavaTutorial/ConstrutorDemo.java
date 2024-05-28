package JavaTutorial;

public class ConstrutorDemo {
	
	public ConstrutorDemo()
	{
		System.out.println("i am in constructor");
	}
	
	public ConstrutorDemo(int a,int b)
	{
		System.out.println("i am in parametrised constructor");
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public void getData()
	{
		System.out.println("i am in method");
	}

	public static void main(String[] args) {
		
		ConstrutorDemo cd = new ConstrutorDemo();
		cd.getData();
		
		ConstrutorDemo d = new ConstrutorDemo(4,5);
		
	}

}
