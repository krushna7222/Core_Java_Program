package keyword.this_keyword;

//members of class ->instance var ,constructor,method
//this keyword is used for calling instance variable and instance method of current class

class Vehicle
{
	int capacity;
	String color;
	
	Vehicle(int capacity,String color)
	{
		this.capacity=capacity;    //1st use of this => whenever you are using same 
        							//name for instance and local variable..
									//so to identify the difference between local and insatnce var we need to use this keyword
		this.color=color;
	}
	
	void show()
	{
		this.put();				//2nd use of this is => we can call one method within the 
								//definition/body of another method using this keyword 
								//and this process is called as "method chaining"
		System.out.println("----vehicle info----");
		System.out.println("Capacity of Seat :- "+this.capacity);
		System.out.println("Color of Vehicle :- "+this.color);
	}
	
	void put()
	{
		this.msg();
		System.out.println("Hello");
	}
	void msg() 
	{
		this.disp();
		System.out.println("Bye...");
		
	}
	
	void disp()
	{
		System.out.println("Hello in Java Class...");
	}
}

public class this_keyword_calling_instance_variable_and_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v1 = new Vehicle(15 ,"Red");
		v1.show();
		
		Vehicle v2 = new Vehicle(2 ,"black");
		v2.show();
		
		
		

	}

}
