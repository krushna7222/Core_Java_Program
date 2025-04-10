package oops_concept.inheritance;

class Person
{
	String name;
	int age;
	String address;
	
	void eat()
	{
		System.out.println("Person Can Eat...........");
	}
}

class Student extends Person
{
	double marks;
	
	void accept(String name,int age,String address,double marks)
	{
		this.name=name;
		this.age=age;
		this.address=address;
		this.marks=marks;
	}
	
	void display()
	{
		System.out.println("name  "+"   "+" age "+" "+" Address "+"   marks ");
		System.out.println(name+"   "+ age+ "    "+ address +"     "+marks );
	}
	
}

public class single_level_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.accept("Krushna", 21, "Nashik", 6.47);
		s1.display();
		s1.eat();
	}

}
