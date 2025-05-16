package collectionFramework.Arrays_class;


public class Linear_Search {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        
              //   0  1  2  3  4 5  6
         int a[]= {56,12,78,23,7,17,23};
          int search=7, found=0;

          for(int i=0; i< a.length;i++)
          {   
              //  12==20
               if(a[i]==search)
                 {
                     System.out.println("element is found at poisition ="+i);
                     found=1;
                     break;
                 }
               
               
            }  //for loop close
          
          if(found==0)
          {
              System.out.println("element is not found.....");
          }
    
    
    }

}
