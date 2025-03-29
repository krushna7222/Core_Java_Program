package Class_and_Object;

//Q.Can we overload main method?
//=>yes......we can overload main method...but out of that all the overloaded
//format of main,the only main will get execute which is having string[] args as an argument


public class Main_method_overloading {

  public static void main(int[] args)   //method signature/declaration
  {
      
      System.out.println("hello");

  }
  
  public static void main(String[] args) 
  {
      
      System.out.println("hi");

  }
  
  
  public static void main(double[] args) 
  {
      
      System.out.println("bye");

  }

}
//JVM
//public static void main(String[] args)
