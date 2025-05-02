package oops_concept.polymorphism;

//Polymorphism => poly(many) + morphs(forms)
//1.purpose=>  using one object in different ways

//2.definition => means using one object in multiple ways
//OR one object is having multiple forms is called as polymorphism

//3.e.g =>Person =>  person may be a family member,student,friend,emp,dr
//4.How to implement?
//=>by using the concept of method overloading and overriding...we can implement concept of polymorphism

//5.Program
//Types of polymorphism

//1.Compile time poly/early binding/static binding/static dispatch process
//method overloading  => multiple methods having same name with different parameters
//method overloading can be possible by changing the number of arguments or 
//by changing types of argument 
//but method overloading is not possible by changing the return type of the method

//2. Run time poly/late binding/dynamic binding/dynamic dispatch process
//Method overriding

class Overloading {
	public void add(int a, int b) {
		System.out.println("add(int a,int b) = " + (a + b));
	}

	public void add(int a, float b, int c) {
		System.out.println("add(int a,float b,int c) = " + (a + b + c));
	}

	public void add(int a, double b) {
		System.out.println("add(int a,double b) = " + (a + b));

	}

	public void add(double a, double b) // method definition
	{
		System.out.println("add(double a,double b) = " + (a + b));
	}

}

public class Method_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Overloading o1 = new Overloading();
		o1.add(4.5, 2.5); // method calling is linked with its appropriate method definition at compile
							// time of the program that's why this polymorphism is called as compile time
							// polymorphism
		o1.add(6, 3.9);
		o1.add(3, 6);
		o1.add(2, 4.2f, 9);
	}

}
