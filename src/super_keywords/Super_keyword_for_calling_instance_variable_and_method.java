package super_keywords;

//this(variable,method,constructor) => this keyword is used to call the data within SAME class
//super(variable,method,constructor) => super keyword is used to call the data within DIFFERENT(parent to child) classses
//Super keyword is used to access the data of super class means parent class

class Person1
{
	String address="Pune";
	
	void eat()
	{
		System.out.println("In Parent class eat methos......");
	}
}

class Student1 extends Person1
{
	String address="Nashik";
	
	void eat()
	{
		super.eat();  //calling parent class Method using super keyword
		System.out.println("In Child class eat methos......");
	}
	
	void disp()
	{
		this.eat();   //calling currunt class Method  using this keyword
		
		System.out.println("calling currunt class property using this keyword = "+ this.address);
		System.out.println("calling parent class property using super keyword = "+ super.address);
	
	}
	
}

public class Super_keyword_for_calling_instance_variable_and_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1 = new Student1();
		s1.disp();
				

	}
}
