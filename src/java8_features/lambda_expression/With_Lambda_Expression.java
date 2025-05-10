package java8_features.lambda_expression;

//lambda_expression can be implement only in case of functional interfaces
//Types of interface
//1.Marker interface/empty
//2.Functional interface/Single Abstract Method

//Lambda expression is used to implement functional interface(who has only one abstract method) in java
//Lambda expression is the feature of java8, which is used to reduced the line of code of program
//In which we can write the implementation of abstract method of functional interface in one single line

//Lambda expression is also called as arrow function

//syntax:
//parameter -> expression body

@FunctionalInterface
interface Demo11 {

	void add(int a, int b);
}

//class DemoImpl implements Demo {
//
//	public void add(int a, int b) {
//		System.out.println("Addition is :- " + (a + b));
//	}
//}

public class With_Lambda_Expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if method consists of only one statement then the lambda expression will be
		// given below
		// Demo11 a1= (int a,double b)-> System.out.println("add = "+(a+b));
		// or
		Demo11 a1 = (a, b) -> System.out.println("add = " + (a + b));
		a1.add(2, 6);

		// if method consists of multiple statements then the lambda expression will be
		// given below
		Demo11 d2 = (a, b) -> {
			System.out.println("in add = " + (a + b));
			System.out.println("hi");
		};
		d2.add(5, 6);

	}

}
