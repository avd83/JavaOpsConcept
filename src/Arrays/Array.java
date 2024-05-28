package Arrays;

public class Array {

	public static void main(String[] args) {
		
		//Static memory allocation
		int a[] = new int[5];
		a[0]=1;
		a[1]=11;
		a[2]=111;
		a[3]=1111;
		a[4]=11111;
		
			
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
							
		}
				
				//Dynamic memory allocation
				int b[] = {1,2,3,4,5};
		
		for (int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
							
		}

	}

}
