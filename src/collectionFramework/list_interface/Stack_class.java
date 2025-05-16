package collectionFramework.list_interface;

import java.util.Stack;
import java.util.Vector;


//Stack is a subclass of vector, the difference between Vector and Stack is we 
//can performed insertion and deletion operation at any index means on the middle
//of the vector also
//but In stack, insertion(push) and deletion(pop) operations are performed
//on top of stack only

//Stack follows the principle of Last In First Out(LIFO)
//there are 2 basic operations performs on the stack like push() and pop()

//the last element which is added in the stack is called as "top of stack"

//LIFO
public class Stack_class {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        
        //List<Character>  l1= new Stack(); //OR
                Stack<Double>  l1= new Stack();
                           l1.add(5.6);    //7   
                           l1.add(12.6);   //6
                           l1.add(1.9);      //5
                           l1.add(2.0);     //4
                           l1.add(2.15);   //3
                           l1.add(4.7);    //2
                           l1.add(2.15);   //1 // top of stack
                           
                         
                 System.out.println(l1);
                 
                System.out.println(l1.empty());   //false
                
                
                //2.peek()=> accesses but does not remove element present on top of stack
                //System.out.println(l1.peek()); //2.15
                //System.out.println(l1);
                 
                //3.pop()=> accesses and remove element present on top of stack
                //System.out.println(l1.pop()); //2.15
                //System.out.println(l1);
                 
                
                //4.push()
                //l1.push(12.0);
                //System.out.println(l1);
                
                
                //5.
            //System.out.println(l1.search(12.6));  //
                
            
                
                
    }

}