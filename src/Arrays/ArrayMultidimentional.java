package Arrays;

public class ArrayMultidimentional {

	public static void main(String[] args) {
		
		int a[][]=new int[2][3];
		a[0][0] = 2;
		a[0][1] = 3;
		a[0][2] = 4;
		a[1][0] = 5;
		a[1][1] = 6;
		a[1][2] = 7;
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
						
			System.out.print(a[i][j]);
			System.out.print("\t");//make space between the data
			}
			System.out.println("");//data send to next line
		}
	}

}
