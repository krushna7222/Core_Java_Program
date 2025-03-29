package static_keyword;

//******difference between instance initializer and static block
//1.instance initializer block => is used to initialized non-static means instance 
//variables of a class
//1.static -block => is used to initialized static members/variables


//2.instance initializer block  is a OBJECT level block hence it calls multiple times 
//depends upon number of objects that we have created for that class
//2.static -block  is a CLASS level block and hence it calls only once and that of very
//first time in a program

//3. instance initializer block  called after static blocks
//3. static -block called very first as compare to instance initializer block ,constructor,method


//if we have instance initializer block ,static block,,constructor,method in one class 
//then the execution sequence be like: 1.static block,  2.instance initializer block, 3.constructor 4.method

class Employee2
{
	int e_id;
	String e_name;
	static String c_name;  
	
	
	{ 		//instance initializer block => is used to initialized non-static means instance variables members
		
		e_id=201;
		e_name="Mahesh";
		System.out.println("In Instance Initilizer Block .....");
	}
	
	
	static
	{		//static/class block  => is used to initialized static members/variables
		
		c_name="TCS";
		System.out.println("In Static Block .....");
	}
	
	Employee2(int e_id,String e_name)
	{
		this.e_id=e_id;
		this.e_name=e_name;
		System.out.println("In Constructor .....");
	}
	
	void Display()
	{
		System.out.println();
		System.out.println("In Display Method .....");
		System.out.println(e_id);
		System.out.println(e_name);
		System.out.println(c_name);
	}
	
	static void change()
	{
		c_name="INFO";
	}
}

public class Static_block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee2 e1 = new Employee2 (101 , "Neha");
		e1.Display();
		Employee2 e2 = new Employee2 (102 , "Ram");
		e2.Display();
		Employee2.change();
		Employee2 e3 = new Employee2 (103 , "Raj");
		e3.Display();
		

	}

}
