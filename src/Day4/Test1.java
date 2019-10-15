package Day4;

public class Test1 {
public static void main(String[] args) {
	
	int a = 1, b = 2, c = 3, x = 0, y = 0;
	
	if (a > b)
		x = a + b;
	
	else if (a > c)
		x = a - b;
	else 
		x = a * b;
	y = a / b;
			
	
	System.out.println("x = " +x);
	System.out.println("y = " +y);
}
}
