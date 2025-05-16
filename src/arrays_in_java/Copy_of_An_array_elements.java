package arrays_in_java;

import java.util.Scanner;

public class Copy_of_An_array_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Size Of Array :- ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		int y[] = new int[arr.length];

		System.out.println("Enter the " + size + " Element for Array :- ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println();
		System.out.println("Your Entered element in Array :- ");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			y[i] = arr[i];
		}

		System.out.println();
		System.out.println("Coppied element in y :- ");

		for (int i = 0; i < y.length; i++) {
			System.out.println(y[i]);
		}

	}

}
