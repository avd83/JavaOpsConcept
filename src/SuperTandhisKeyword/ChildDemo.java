package SuperTandhisKeyword;

public class ChildDemo extends ParentDemo {

	String name="Apoorv";
			public void getStringData()
			{
				System.out.println(name);
				System.out.println(super.name);//use super keywoed to access the parent class parameter.
			}
			
			public void getData()
			
			{
				super.getData();
				System.out.println("From Child class");
				
			}
			public ChildDemo()
			{
				//super();
				System.out.println("From Child class constructor");
				
			}
	
	public static void main(String[] args) {
		
		ChildDemo cd = new ChildDemo();
		cd.getStringData();
		cd.getData();
		
				

	}

}
