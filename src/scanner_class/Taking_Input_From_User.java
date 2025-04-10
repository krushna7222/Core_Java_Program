package scanner_class;

import java.util.Scanner;

class InputeUser {

	String name;

	void run() {
		System.out.println("Enter Name :-");
		Scanner sc = new Scanner(System.in);

		name = sc.next();

		System.out.println("My Name :- " + name);
	}
}

public class Taking_Input_From_User {

	// stream => container which stores data in the form of sequence of characters
	// types of stream
	// 1. Input Stream => System.in
	// 2. output Stream => Syatem.out
	// 3. error Stream => System.err

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		float b;
		double c;

		System.out.println("Enter Three Number (int,Float,double) : ");

		Scanner sc = new Scanner(System.in); // here ,System.in is nothing but an input stream which holds an input
												// enter by user by consol

		a = sc.nextInt();
		b = sc.nextFloat();
		c = sc.nextDouble();

		// sc.nextBoolean();
		// sc.nextByte();
		// sc.next.Long();
		// sc.next();
		// sc.nextLine();
		// sc.next().charAt(0);

		System.out.println("Addition Of a,b,c :- " + (a + b + c));

		InputeUser i1 = new InputeUser();
		i1.run();

	}

}
