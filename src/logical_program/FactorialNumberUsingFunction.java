package logical_program;

import java.util.Scanner;

public class FactorialNumberUsingFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, factorial = 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for find factorial  : ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			factorial = factorial * i;
		}

		System.out.println(factorial);

	}

}
