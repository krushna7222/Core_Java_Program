package oops_concept.polymorphism;

class Student {
	int rollno;
	String name;
	double marks;

	public Student(int rollno, String name, double marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	@Override // annotations => used to give extra information about your code to the compiler
				// and user..Annotations are executable
	public String toString() // overridden toString() method of object class
	{
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}

}

public class ToString_Method {
	public static void main(String[] args) {

		Student s1 = new Student(101, "Mahesh", 8.47);
		System.out.println(s1); // @626b2d4a => hashCode? => hashcode is nothing but it is an unique integer no
								// assign by the JVM to each and every object of the class
		// whenever we are going to print an object of the class then we need to defined
		// toString method in that class
	}

}
