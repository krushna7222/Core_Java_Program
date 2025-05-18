package arrays_in_java;

import java.util.Scanner;

public class Creating_1D_array_using_new_keyword {

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

		System.out.println("Your Entered Array Is :- ");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
