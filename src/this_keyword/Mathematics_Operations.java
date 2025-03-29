package this_keyword;


class Operation
{
    int a,b;
    void acceptValues(int a,int b)
    {
    	this.a=a;
    	this.b=b;
        
    }
    void add()
    {
    	int c=a+b;
    	System.out.println("The Addition Of a+b Is :- " + c);
    	square();
        
    }
    void square()
    {
    	
    	System.out.println("Square Of a Is :- "+ a*a );
    	System.out.println("Square Of b Is :- " + b*b);
        sub();
    }
    void sub()
    {
    	int d=a-b;
    	System.out.println("Substraction Of a-b Is :- " + d);
    	div();
        
    }
    void div()
    {
    	int e=a/b;
    	System.out.println("Substraction Of a/b Is :- " + e);
    }
}


public class Mathematics_Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation op1 = new Operation();
		op1.acceptValues(20, 5);
		
        op1.add();
      


	}

}
