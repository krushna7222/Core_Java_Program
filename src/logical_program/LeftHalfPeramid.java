package logical_program;

import java.util.Scanner;

public class LeftHalfPeramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number how many rows or column : ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.print("\n");

			for (int j = 0; j < i; j++) {

				System.out.print(" *");

			}
		}

	}
}
