package Day4;

import java.util.Scanner;

public class Test123 {
public static void main(String[] args) {
	  int n1 = (int) (Math.random() *10) +1; //���� ����

	  int n2, i;

	  Scanner sc = new Scanner(System.in); //�Է�

	  

	  for (i = 1; 1 <= 5; i++)

	  {

	     System.out.print("���� �Է� �ϼ���");

	     

	  n2 = sc.nextInt();

	  

	  if(n1 == n2) {

	    System.out.println("count" +i);

	    break;

	      

	  }

	  }

	  if(i > 5)  System.out.println("X");

	}

}

