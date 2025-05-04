package exception_handling;

//public class Handling_Multiple_Exceptions_Using_Nested_try_catch {
public class Handling_Multiple_catch_Using_Single_try {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 12, 85, 0, 45, 25 };

		try {
			System.out.println("Start Try Block....");
			System.out.println(arr[3]);
			System.out.println(arr[2] / arr[3]);
			System.out.println(arr[33]);

		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("ArrayIndex catch :- " + e);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Arithmetic catch :- " + e);
		}

	}
//
//	public static void main(String[] args) {
//		// 0 1 2 3 4 5
//		int a[] = { 45, 5, 45, 0, 11, 12 };
//
//		try {
//			System.out.println("try starts....");
//			System.out.println(a[1] / a[3]); // Arith..........
//			System.out.println(a[19]); // ArrayIndex.....
//			System.out.println("try ends..."); // this line will not execute bcz, the above line contains an exception
//												// and from that line control jumps onto the catch block and it will
//												// never get back onto try block to execute remaining code
//		}
//
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("ArrayIndex catch = " + e);
//		}
//
//		catch (ArithmeticException e) {
//			System.out.println("Arithmetic catch  = " + e);
//		}
//		System.out.println("bye");
//		System.out.println("thank u");
//	}

}
