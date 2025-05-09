package collectionFramework.list_interface;


import java.util.LinkedList;
import java.util.Vector;


//ArrayList(non syn/multithreaded) => as arraylist is non synchronized multiple threads 
//gets execute at the same time hence Arraylist faster as compared to Vector

//Vector(Synchronized/at a time one thread gets execute on Vector object) and 
//HashTable is synchronized

//Vector is the implementation class of List interface 
//Vector is same as ArrayList, means like ArrayList it also uses dynamic array to store
//its elements

//the only difference between both is :=>  ArrayList is non-synchronized whereas 
//Vector is Synchronized

//another difference between Vector and ArrayList is about capacity
//Default capacity of ArrayList before java8 is 10,,after java8 the capacity will be 0..
//means according to the no of elements in a ArrayList the capacity of ArrayList is decided
//Default capacity of Vector is 10

//ANd in LinkedList,it don't have capacity because the nodes/elements in LinkedList
//does not store in memory..each node is only having pointer to the next node

//In c++
//Q,Difference bet array and vector?   //arrayList and vetcor

//=> array is static                     //arrayList is nonsyn    
//=> vector is dynamic                   //vector is syn


//Q.What is diff between vector and arrayList?
//Similarity => both vector and arrayList internally uses dynamic array to stored the element
//Difference => ArrayList is non-synchronized and  vev1or is synchronized 



public class Vector_class {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //List<String> v1=new     Vector();
        
        Vector<Character> v1=new Vector();
          v1.add('h');     //0 //head node
          v1.add('e');    //1
          v1.add('l');   //2
          v1.add('l');  //3
          v1.add('o');  //4
          
        
          System.out.println(v1);
          
        /*  //1.capacity
          System.out.println("default capacity of vector = "+v1.capacity());//10
          v1.add('f');     //0 //head node
          v1.add('r'); 
          v1.add('n'); 
          v1.add('d'); 
          v1.add('z'); 
          
          System.out.println("after adding 10 elements , capacity of vector = "+v1.capacity());//10
            
          
          v1.add('s');
         
          System.out.println("after adding greater  10 elements , capacity of vector = "+v1.capacity());//10
            */
          
          
          
          /*//2.inserting element at specific position
          v1.insertElementAt('P', 3);
        System.out.println(v1);
        */
          
         /* 
          //3.deleting an element at specific position
          v1.removeElementAt(1);
        System.out.println(v1);
        */
          
          
          
        /*  
          //4.trimToSize();
          
          System.out.println("vector size = "+v1.size()); //5
          System.out.println("vector capacity = "+v1.capacity()); //10
          v1.trimToSize();
          
          System.out.println("after trimToSize(),vector size = "+v1.size()); //5
          System.out.println("after trimToSize(),vector capacity = "+v1.capacity()); //5
          */
          
          
          
        
          
          
          
          
    }

}
