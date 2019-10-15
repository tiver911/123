package Day5;
/*
 * 001
 * 023
 * 456
 */
public class Home1 
{
public static void main(String[] args) 
	{
	
		int[][] a = new int [3][3];
		int b=0;
		
		for(int i=0; i<3; i++)
		{
			for(int j=2-i; j<3; j++)
			{
				b++;
				a[i][j] = b;
			}
		}
		
		 		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	
	}
}
