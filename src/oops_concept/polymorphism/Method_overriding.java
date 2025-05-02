package oops_concept.polymorphism;




//2. Run time poly/late binding/dynamic dispatch process

//Method overriding=> 1.multiple methods having same name and with same parameter list
           //  2. in Method overriding, overridden method should be defined inside different class
            //3.Method overriding is the example of run time polymorphism
//OR method overriding means redefining the method of parent class into child class

class Overriding
{
  void operation(int a,int b)
  {
      System.out.println("parent add = "+(a+b));
  }
  
}
class ChildOverriding extends Overriding
{
  void operation(int a,int b)
  {
      System.out.println("child sub = "+(a-b));
  }
  
}
public class Method_overriding {

  public static void main(String[] args) {
      // TODO Auto-generated method stub

      ChildOverriding c1=new ChildOverriding();
        c1.operation(12, 6);
  }

}
