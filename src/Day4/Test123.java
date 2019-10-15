package Day4;

import java.util.Scanner;

public class Test123 {
public static void main(String[] args) {
	  int n1 = (int) (Math.random() *10) +1; //난수 생성

	  int n2, i;

	  Scanner sc = new Scanner(System.in); //입력

	  

	  for (i = 1; 1 <= 5; i++)

	  {

	     System.out.print("수를 입력 하세요");

	     

	  n2 = sc.nextInt();

	  

	  if(n1 == n2) {

	    System.out.println("count" +i);

	    break;

	      

	  }

	  }

	  if(i > 5)  System.out.println("X");

	}

}

