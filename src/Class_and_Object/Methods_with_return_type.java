package Class_and_Object;


class Xyz
{

  int  add(  int a,int b, int z    )  //formal parameters=> here, a,b,z are formal parameter
   {
          int c=a+b+z; 
         return c;
  }
                         
  double areaOfCircle( double pi, int r  )
  {    
      
      //System.out.println("area of circle= "+pi*r*r);  
      return (pi*r*r);
      
  }
  
  String returnName(String name)
  {
	  return name;
  }
  
}

public class Methods_with_return_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xyz x1 = new Xyz();
		System.out.println(x1.add(10, 20, 30));
		System.out.println(x1.areaOfCircle(3.14, 14));
		System.out.println(x1.returnName("Krushna"));

	}

}
