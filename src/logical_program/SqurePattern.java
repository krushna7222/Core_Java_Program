package logical_program;

import java.util.Scanner;

public class SqurePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number how many rows or column for squre  : ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("\n");
			for (int j = 0; j < n; j++) {
				System.out.print(" *");

			}
		}

	}

}
