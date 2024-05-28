package Arrays;

public class MinMaxFindFromArra {

	public static void main(String[] args) {
		
		int abc[][]= {{2,4,0},{6,5,8},{3,7,5}};
		
		int max=abc[0][0];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(abc[i][j]>max)	
				{
					max=abc[i][j];//pulling minimum or maximumnumber from array.
				}
			
			}
			
		}
		System.out.println(max);
	}

}
