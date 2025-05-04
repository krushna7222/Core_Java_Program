package exception_handling;

//1.Can we write try block without catch in our code?
// yes => we write finally with try block
// 2.Can we write try block alone in our code?
// no => we write only try block then no any block to catch the error or not present finally block to exucute everytime
// 3.Can we write multiple catch blocks for single try?
// yes => bcz catch block takes parameter we write different parameter in catch block thats way we write multiple catch block
// 4.Can we write multiple finally blocks for single try?
// no... =>1: bcz finally block run anytime then all code write in one finally block
//				  2: finally block are not take any argument then we dont write multiple finally block

public class Exception_Using_try_finally {
	public static void main(String[] args) {

		int a = 14, b = 0;

		System.out.println("add = " + (a + b));
		try {
			System.out.println("try starts....");
			System.out.println("div = " + (a / b));
			System.out.println("a = " + a);
		} finally {
			System.out.println("Finally block will always get executes whether an exception occurred or not");
			System.out.println("So we can put an important code of our application inside finally block");

		}

		System.out.println("sub = " + (a - b));
		System.out.println("bye");

	}

}
