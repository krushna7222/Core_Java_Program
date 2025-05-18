package arrays_in_java;

import java.util.Scanner;

public class Sum_of_An_array_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Size Of Array :- ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the" + size + "Element for Array :- ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Sum of Your Array Is :- ");

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum = " + sum);

	}

}
