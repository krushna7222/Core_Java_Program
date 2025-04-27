package keyword.final_keyword;


//3.final class =>the class which is declared as a final connot be inherit/access into the child class
//Q.how you can create your own immutable class?
//=> by declaring that class as final..


//final class Food  //or
class Food
{
  String taste="sweet";   //sweet
  
  void cook()
  {
    System.out.println("cooking a 😋 food now!!!");    
  }
}

final class Indian extends Food
{
  
  
  void serve()
  {
      super.cook();
      taste="spicy";
      System.out.println("Ready to Serve food having taste like ..."+taste);
  }
}


public class Final_class {

  public static void main(String[] args) {
      // TODO Auto-generated method stub

      Indian  i1=new Indian();
      
      // i1.cook();
       i1.serve();
  }

}