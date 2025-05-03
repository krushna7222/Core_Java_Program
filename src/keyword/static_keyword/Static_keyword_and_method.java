package keyword.static_keyword;

//In a one file we can create only one public class

//static data=> called by class name
//non-static data=> called by object name

//1.To call static data...we need not to create an object of a class
//this => is used for calling purpose
//static => is used for declaration purpose..it used to declare instance var,method,block,class as a static
///static/common
//static variable => refers to the COMMON property of an object...that common property is shared by all the objects of a class
//in one class we can declare one or more static variable
//static method   => accepts only static variable...and static method called by class name

//instance/object, call/invoke,//object creation => instantiation

class Employee
{
	int e_id;
	String e_name;
	static String c_name="TCS";    //static(common) => changeable, const/final(fixed) => non-changeable
	
	Employee(int e_id,String e_name)
	{
		this.e_id=e_id;
		this.e_name=e_name;
		
	}
	
	void Display()
	{
		System.out.println();
		System.out.println(e_id);
		System.out.println(e_name);
		System.out.println(c_name);
	}
	
	static void change()
	{
		c_name="INFO";
	}
}


//non static members called by => object name
//static members called by => class name
//calling static method using class name
//object creation => instantiation



public class Static_keyword_and_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee (101 , "Neha");
		e1.Display();
		Employee e2 = new Employee (102 , "Ram");
		e2.Display();
		Employee.change();
		Employee e3 = new Employee (103 , "Raj");
		e3.Display();
		
	

	}

}
