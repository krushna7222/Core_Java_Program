package exception_handling;

import java.io.FileNotFoundException;

//throw => is used to create user-defined exception
//throws => is used to declare the exception

//Student registration app
//age >12 , weight  < 45

//e,g void checkingEligibility(int age,int weight) ;  //method declaration/signature

//int a
class ThrowDemo {
	static void checkingEligibility(int age, int weight) throws ClassCastException, FileNotFoundException { // 23 48
		if (age > 12 && weight < 45) // &&, ||, !
		{
			System.out.println("you are eligible for registration");
		} else {
			// this below line is throwing an exception, and from this line program gets
			// terminate...
			throw new ArithmeticException("you are NOT eligible for registration");

		}

		System.out.println("Registered Successfully...");
		System.out.println("Please login to continue your process...");
	}
}

public class Creating_User_Definr_Exception {

	public static void main(String[] args) throws ClassCastException, FileNotFoundException {
		// TODO Auto-generated method stub
		// ThrowDemo t1 = new ThrowDemo();

		System.out.println("-----WELCOME TO REGISTRATION PROCESS-----");
		ThrowDemo.checkingEligibility(23, 48);

	}

}
