package Opentutorials;

import java.util.Scanner;

public class PPP 
{
	public static void main(String[] args) 
	{
	
		int a = 0, c;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
		if (a % 5 == 0)
		{
			System.out.println("5Kg "+a/5+"Æ÷´ë");
			return;
		}
			else
			{
					int b = a / 5;
					for (int c = b; c > 0; c--);
					{
						int d = a - ( c * 5 );
						if (d % 3 == 0);
						{
							System.out.println( c + ( d / 3 ) );
							return;
						}
					}
				}
		if(a % 3 == 0 );
		{
		System.out.println(a/3);
		}
			else 
			{
			System.out.println("-1");
			}

}
}