package Class_and_Object;


//functions/methods => it is block of code that we can write once and execute/call it over multiple times
//function creation and execution in 3 steps
//1.method declaration(outside the main)
//2.method definition(outside the main)
//3.method calling(inside the main)

/*
#functions and methods are same in use and same in syntax but still there are some differences between function and methods

#difference between function and method
#1.function cannot be created inside a class...it can be directly created in program
#1.method should always  be created inside a class

#2.function can be called directly ,without using any object
#2. method must be called either by using object or by using class name


*/

class Abc
{
  //2.method definition/create => 4 parts => 1.return type 2.method name  3.parameter list 4.method body
               //10,     8.2f, 5.0 , "yash"
  void  add(  int a,float b, double z ,String name   )  //formal parameters=> here, a,b,z are formal parameter
   {
          double c=a+b+z;  //8+1.7+2.0=> 11.7
          System.out.println("add = "+c);
          System.out.println("thank u...");
          System.out.println("bye");
  }
                         //3.14      7
  void areaOfCircle( double pi, int r  )
  {       //3.1455
      //double area= pirr;
      System.out.println("area of circle= "+pi*r*r);  //(math+sci+eng)/3 
        
      
  }
  
  
  
  
 }   //class end
public class Methods_without_return_type {

  public static void main(String[] args) {
      // TODO Auto-generated method stub

      Abc  a1= new Abc();
      a1.add(6,3.1f, 6.1,  "harsh" );   //method calling   //here,6,3.1f, 6.1,  "harsh" are the actual parameters/arguments
    a1.add(10, 8.2f, 5.0 , "yash");
      
      a1.areaOfCircle(3.14, 7);
      
      System.out.println("****program over****");
  }

}
