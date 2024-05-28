package Exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a=0;
		int b=7;
		
		int k;
		try
		{
					k=b/a;
					System.out.println(k);
		}
		catch(Exception e)
		{
			System.out.println("i catched the error/exceptons");
		}
	}

}
