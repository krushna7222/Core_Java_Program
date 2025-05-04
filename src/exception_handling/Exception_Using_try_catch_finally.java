package exception_handling;

public class Exception_Using_try_catch_finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 14, b = 0;

		System.out.println("add = " + (a + b));
		try {
			System.out.println("try starts....");
			System.out.println("div = " + (a / b));
			System.out.println("a = " + a);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		} finally {
			System.out.println("Finally block will always get executes whether an exception occurred or not");
			System.out.println("So we can put an important code of our application inside finally block");

		}

		System.out.println("sub = " + (a - b));
		System.out.println("bye");

	}

}
