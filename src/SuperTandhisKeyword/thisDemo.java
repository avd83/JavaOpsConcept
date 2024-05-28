package SuperTandhisKeyword;

public class thisDemo {
	
	int a=2;
	int b=0;
	
	public void getdata()
	{
	int a=3;	
	System.out.println(a);
	System.out.println(this.a);// this keyword take the object level variable even if same in method level also.
	b=a+this.a;
	System.out.println(b);
	
	}

	public static void main(String[] args) {
		
		
		thisDemo t = new thisDemo();
		t.getdata();
		
	}

}
