package TEST111;

import TiverTest.String;

public class Dice {

	public static void main (String[] args) {

		for (int i = 1; i <= 20; i++) {
		      int n = (int) (Math.random() * 10) + 1;
		      System.out.println(n);
		}
	}
}
