package oops_concept.inheritance;

class Person3
{
	protected String name;
	protected int age;
	protected String address;
}

class Student3 extends Person3
{
	double marks;
	
	void setName(String name)
	{
		this.name=name;
	}
	void setAge(int age)
	{
		this.age=age;
	}
	void setAddress(String address)
	{
		this.address=address;
	}
	void setMarks(double marks)
	{
		this.marks=marks;
	}
	

	String getName()
	{
		return name;
	}
	int getAge()
	{
		return age;
	}
	String getAddress()
	{
		return address;
	}
	double getMarks()
	{
		return marks;
	}
}


public class single_level_inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student3 s1 = new Student3();
		s1.setName("Mahesh");
		s1.setAge(24);
		s1.setAddress("Nashik");
		s1.setMarks(7.37);
		
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getAddress());
		System.out.println(s1.getMarks());
	}
}
