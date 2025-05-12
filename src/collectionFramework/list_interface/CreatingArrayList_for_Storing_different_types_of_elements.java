package collectionFramework.list_interface;

import java.util.ArrayList;
import java.util.List;

//Collection => group of OBJECTS that may be of similar type or of different types
//framework  =>  it is an architecture which consists of predefined code in the form of classes,interfaces and methods

//Collection Framework is divided into 2 categories
//1.Collection interface => List,Set,Map
//2.Collections  class

//java.util

//Data structure(organize)=>Collection

//List => sequential/ordered type of collection
//1. list preserves/maintains the insertion order
//2. list allows duplicate elements/object

//Difference between Array and Collection(ArrayList)?
//1.in array, we can store only similar type of data
//1.in ArrayList, we can store both  similar as well as different type of data

//2.Array is static type of Data Structure means in an array we need to specify size of an array
//2.ArrayList is dynamic type of Data Structure means in an 
//arraylist(or in any collection) we need NOT to specify size of an arraylist

public class CreatingArrayList_for_Storing_different_types_of_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[60]; // in this case of array,JVM will create 60 size of an array in the memory..even
								// if we have not added any element in this array
		// but
		List l5 = new ArrayList(); // in this case of Collection,JVM will create 0 size of an arraylist in the
									// memory..because we have not added any element in this arraylist(so memory
									// space is save)

		// ---------------------------------------------------------------

		List l1 = new ArrayList();

		l1.add(67); // 0
		l1.add(6.7); // 1
		l1.add(89.5f); // 2
		l1.add(true);
		l1.add(12);
		l1.add('A');
		l1.add("raj");
		l1.add(12);
		l1.add(8772789878l);
		l1.add(12);

		System.out.println(l1);
		System.out.println(l1.size());

		// l1.remove(4);
		// System.out.println(l1);

		// l1.add(2, 500);
		// System.out.println(l1);

		// l1.get(3);

	}

}