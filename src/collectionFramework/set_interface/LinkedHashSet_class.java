package collectionFramework.set_interface;


import java.util.HashSet;
import java.util.LinkedHashSet;


//LinkedHashSet is the child  class of HashSet class


//LinkedHashSet => Linked list + hashTable + set
//as LinkedHashSet is a combination of List and Set...It follows one property of List(preserves the insertion order) 
//and one of Set(does not allows duplicate elements)

public class LinkedHashSet_class {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


          //    Set<Integer> hs= new LinkedHashSet<Integer>();
        ///or
        LinkedHashSet<Integer> hs= new LinkedHashSet<Integer>();
        
          hs.add(67);
          hs.add(10);
          hs.add(6);
          hs.add(17);
          hs.add(10);
          hs.add(34);
          hs.add(22);
          
          System.out.println("hs = "+hs);
        
          
          LinkedHashSet<Integer> hs2= new LinkedHashSet<Integer>();
            
          hs2.add(600);
          hs2.add(100);
          hs2.add(200);
          hs2.add(17);
          hs2.add(500);
          hs2.add(34);
          hs2.add(200);
          
          System.out.println("hs2 = "+hs2);
          //1.union,intersection, difference
        
          
          /*
          //1.union=>   combining/joining 2 or more sets by avoiding duplicate elements
                //hs = [67, 10, 6, 17, 34, 22]
                // hs2 = [600, 100, 200, 17, 500, 34]

          
            hs.addAll(hs2);    //adding all the elements of hs2 into hs and result will be store into hs
                   //hs=[67, 10, 6, 17, 34, 22,600, 100, 200, 500]
      
            System.out.println("after addAll(), hs = "+hs);
            System.out.println("after addAll(), hs2 = "+hs2);
          */
          
          
          
          /*
          //2.intersection=> getting common elements from more than 1 set
          //hs = [67, 10, 6, 17, 34, 22]
            // hs2 = [600, 100, 200, 17, 500, 34]

           hs.retainAll(hs2);    //retaining common the elements of hs2 into hs and result will be store into hs
                                 //hs = [17,34]
           
    System.out.println("after retainAll(), hs = "+hs);
    System.out.println("after retainAll(), hs2 = "+hs2);
     */
          
          
          
          
    
          
        //3.difference => find those elements which are present in one set but not in another set/retains uncommon elements
            
          //hs = [67, 10, 6, 17, 34, 22]
            // hs2 = [600, 100, 200, 17, 500, 34]

           hs.removeAll(hs2);    //removing all the elements of hs2 from hs and result will be store into hs
                                  //hs = [67, 10, 6, 22]
           
    System.out.println("after removeAll(), hs = "+hs);
    System.out.println("after removeAll(), hs2 = "+hs2);

          
          
          
          
          
          
          
    }

}
