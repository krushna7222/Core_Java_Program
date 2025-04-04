package oops_concept.abstraction;

abstract class Fruit
{
	int price;
	
	Fruit()   //this default constructor of an abstract class will get execute automatically...
	
	{
		this(150);   //calling  parameterized constructor
		price=120;
		System.out.println("In Default Constructor...Price= "+price);
	}
	
	Fruit(int price)
	{
		this.price=price;
		System.out.println("In Parameterised Constructor...Price= "+price);
	}
	
	void buy()
	{
		System.out.println("In Buy Method........");
	}
	
	abstract void peel();
}

class Apple extends Fruit
{
	void peel()
	{
		System.out.println("In Peel Method defination in Apple Class........");
	}
}

public class Abstract_class_having_constructor_and_instance_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Apple a1 = new Apple();
		a1.peel();
		a1.buy();
		
		

	}

}
