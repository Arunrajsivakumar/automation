package week1.day1;

import java.util.Iterator;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		System.out.println("n1 =" + n1);
		System.out.println("n2 =" + n2);
		for (int i = 3; i <= 11; i++) {
			n3 = n1 + n2;
			System.out.println("n3 =" + n3);
			n1 = n2;
			n2 = n3;

		}

	}

}
