package oops_concept.inheritance;

class Operation
{
	int a;
	int b;
	
	void accept(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
}

class Add extends Operation
{
	Add(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	void display()
	{
		System.out.println("Addition Of two No. = "+ (a+b));
	}
}

class Sub extends Operation
{
	Sub(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	void display()
	{
		System.out.println("Substraction Of two No. = "+ (a-b));
	}
}

class Mult extends Operation
{
	Mult(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	void display()
	{
		System.out.println("Multiplication Of two No. = "+ (a*b));
	}
}

class Div extends Operation
{
	Div(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	void display()
	{
		System.out.println("Division Of two No. = "+ (a/b));
	}
}

public class Hierarchical_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Add a1 = new Add(10,20);
		a1.display();
		
		Sub s1 = new Sub(20,10);
		s1.display();
		
		Mult m1 = new Mult(10,20);
		m1.display();
		
		Div d1 = new Div(20,10);
		d1.display();

	}

}
