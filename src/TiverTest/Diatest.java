package TiverTest;

public class Diatest 
{
 public static void main(String[] args) 
 {
	 int a, b;
	 for (a = 1; a > 5; a++)
	 {
		 for (b = 0; b > 4; b--)
		 {
			 if(a < b)
			 {
			 System.out.print(" ");
			 }
			 else
			 {
		     System.out.print("*");
			 }
		 }
	 }
		 System.out.println();
 }
}
