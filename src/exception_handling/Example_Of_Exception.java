package exception_handling;

//exception  => means runtime errors
//or
/*
An exception (or exceptional event) is a problem that arises during
the execution/run time of a program and because of that problem our program gets terminate abnormally..
*/

/*Why we need to handle an exceptipn?
//Ans =>
-When an Exception occurs, the  normal   flow of the program is disrupted and the program/Application terminates abnormally, which is not recommended, therefore, these   exceptions are need to be handled.

*/

public class Example_Of_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * // 1: ArithmeticException:
		 * 
		 * int a = 10; int b = 0; System.out.println("Addition :- " + (a + b));
		 * System.out.println("Multiplication :- " + (a * b));
		 * System.out.println("Divide :- " + (a / b)); System.out.println("Subtract :- "
		 * + (a - b));
		 */

		// 2: ArrayIndexOutOfBoundsException

		int arr[] = { 10, 11, 12, 13, 14, 15 };
		System.out.println(arr[3]);
		System.out.println(arr[1]);
//		System.out.println(arr[12]);
		System.out.println(arr[5]);

		// 3. NullPointerException

//		String s = null;
//
//		System.out.println(s);
//		System.out.println(s.length()); // 5
//		System.out.println(s.toUpperCase());

		// 4.NumberFormatException => String to int

		String s = "welcome";
		System.out.println(s);

		System.out.println(Integer.parseInt(s));
		System.out.println("thank u");

	}

}
