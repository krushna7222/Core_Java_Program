package interfaces_program;

//concrete classes  => consists of concrete methods only
/*
class Abc
{
   void msg()
   {
   
   }

}
*/
//abstract classes   => consists of concrete methods as well as abstract methods 
/*
abstract class Pqr
{
  abstract void put();
  
  void display()
  {
  }
}

*/
//interface is similar to the class...the only difference is that the interface can 
//consists of only abstract method

//interface=> consists of only abstract_methods(having only declaration not definition)
//interface is used to achieve multiple inheritance and abstraction/data hiding in java
//class  to class relationship => extends
//interface  to class relationship => implements

interface xyz {
	public abstract void put(); // by default all the methods in interface are "public abstract"

	void add(int a, int b);

	String displayData(String msg);

	void display();

	default void demo11() {
		System.out.println("Default methos");
	}

	static void demo12() {
		System.out.println("Static methos");
	}

}

abstract class pqr implements xyz {
	public void put() {
		System.out.println("In Put Method....");
	}

	public void add(int a, int b) {
		System.out.println("Addition is : " + (a + b));
	}

	public String displayData(String msg) {
		return msg;
	}
}

class def extends pqr {
	public void display() {
		System.out.println("in Display method....");
	}
}

public class Interface_Demo {
	// we cannot create an object of abstract class and interface.. but we can
	// create reference varible of abstract class and interface
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		xyz x1 = new def();
		x1.put();
		x1.add(10, 20);
		System.out.println(x1.displayData("Hello World!!"));
		x1.display();
		xyz.demo12();
		x1.demo11();
	}

}
