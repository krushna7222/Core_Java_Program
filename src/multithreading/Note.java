package multithreading;

//Q. Which is most widely used way to create a thread....out of 2 given ways
//=> by implementing Runnable interface....is the most widely used way to create a thread
/*
class X extends Thread  
{
  
  
}
class Y extends X, Thread                 // ❌
class Y extends X implements Runnable     // ✅     //here,in this Y class we have alredy extended X as a parent so here , if we are going to extend Thread class then it will genrate problem of multiple inheritance..so if we want to avoid that, we should use 2nd way of implementig Runnable interface
{

  @Override
  public void run() {
      // TODO Auto-generated method stub
      
  }
  
}
*/

public class Note {

}
