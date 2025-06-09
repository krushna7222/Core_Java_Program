package logical_program;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t, n1 = 0, n2 = 1, n3;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number : ");
		t = sc.nextInt();

		System.out.print(n1 + " ");
		System.out.print(n2 + " ");

		for (int i = 1; i <= t; i++) {

			n3 = n1 + n2;
			System.out.print(n3 + " ");

			n1 = n2;
			n2 = n3;
		}

	}

}
