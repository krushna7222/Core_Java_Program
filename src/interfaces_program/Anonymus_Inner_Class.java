package interfaces_program;

//Types of interface
//1.Marker interface/empty/blank =>          zero abstract method
//2.functional/single abstract method(SAM) => having 1 methods
//e.g ActionListener => performedAction()
//Runnable        => run()
//Predicate    => test()
//the purpose of marker interfaces is nothing but it is used to provide an extra 
//information about class and object to the compiler
//there are 2 ways to create class and object
//1.First create a class then create an object
//2.First create an object then create a class

//Program for  Anonymous_inner_Class(2.First create an object then create a class)

interface Demo1 {
	public abstract void add(int a, int b);
}

/*
 * class Test implements Demo1 { public void add(int a, int b) {
 * System.out.println("addition is = " + (a + b)); }
 * 
 * }
 * 
 */

public class Anonymus_Inner_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo1 d1 = new Demo1() // Anonymous_inner_Class2=> the class which does not have any name and also that
								// class is nested is nested inside another class and thats why it is called as
								// Anonymous_inner_Class
		{
			public void add(int a, int b) {
				System.out.println("addition is = " + (a + b));
			}
		};

		d1.add(10, 5);

	}

}
