package logical_program;

import java.util.Scanner;

public class SumOfPrimNumbers {

	public static void main(String[] args) {

		int n, count, sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		n = sc.nextInt();

		for (int i = 2; i <= n; i++) {
			count = 0;

			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}

			if (count == 2) {
				sum = sum + i;
			}
		}

		System.out.println("Sum of prime numbers from 1 to " + n + " is: " + sum);
	}
}
