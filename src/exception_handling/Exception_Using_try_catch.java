package exception_handling;

//try block must be followed by catch or finally or both

public class Exception_Using_try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 11, 12, 13, 14, 15 };
		System.out.println(arr[3]);
		System.out.println(arr[1]);

		// try block consists of code that might generates an exception//try block
		// consists of code that might generates an exception
		try {
			System.out.println("In try block");
			System.out.println(arr[3]);
			System.out.println(arr[12]);
			System.out.println(arr[1]);// this line will not execute bcz, the above line contains an exception and from
										// that line control jumps onto the catch block and it will never get back onto
										// try block to execute remaining code

		} catch (Exception e) { // this catch block is GENERALISED to handle ALL the types of exception
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace(); // Give the error line number
		}

//		catch (ArrayIndexOutOfBoundsException e) {  //this catch  block is specific to handle only ArrayIndexOutOfBoundsException
//			System.out.println(e);
//
//		}
		System.out.println("Bye");
		System.out.println(arr[5]);

	}

}
