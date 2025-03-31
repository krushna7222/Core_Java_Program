package abstraction;


//JVM is also called as abstract/hidden machine

//abstraction/data hiding
//1.purpose  =>     hiding data/implementation details from user
//2.definition=>  it is the process of hiding implementation details/logic/coding from the user and showing only functionality to that user is called as 'abstraction'
//3.e.g   email, any software,remote,
//4. how to implement?
 //by defining/creating an abstract classes
//Q.What is difference between concrete classes and abstract classes?
//concrete class means which consists of only "concrete methods" 
//abstract class means which consists of both "concrete methods" as well as "abstract methods"
//interface  means which consists of only "abstract methods" 

//abstract class consists of any number  of "concrete methods" as well as "abstract methods"
//concrete method => which is having declaration and definition
//abstract method => which is having only declaration

abstract class StudApp
{
	void registration()
	{
		System.out.println("registration Method In Abstract class...");
	}
	
	abstract void login();
	abstract void logout();
	
}

class xyz extends StudApp
{
	void login()
	{
		System.out.println("Abstract login Method In Xyz class....");
	}
	void logout()
	{
		System.out.println("Abstract logout Method In Xyz class....");
	}
}

public class Abstraction_program {
	public static void main(String[] args) {
		
		xyz x1 = new xyz();
		x1.registration();
		x1.login();
		x1.logout();
	}

}
