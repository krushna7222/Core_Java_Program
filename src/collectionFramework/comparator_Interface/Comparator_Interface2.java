package collectionFramework.comparator_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//1.comparable interface is used to perform sorting based on only one property of an object at a time
//1.comparator interface is used to perform sorting based on multiple properties of an object at a time

//2.comparable interface is having method like compareTo(Object o)  which accepts one parameter
//2.comparator interface is having method like compare(Object o,Object o2)  which accepts 2 parameters

//comparator  and Comparable is used to perform customized sorting

public class Comparator_Interface2 {

	public static void main(String[] args) {

		List<Emp2> Emp2 = new ArrayList<Emp2>();
		Emp2.add(new Emp2(6, "ram", 80000));
		Emp2.add(new Emp2(9, "sham", 20000));
		Emp2.add(new Emp2(2, "gita", 60000));

		System.out.println("Sorting objects based on name : ");
		Collections.sort(Emp2, new Sort_on_name());
		System.out.println(Emp2);

		System.out.println("Sorting objects based on salary : ");
		Collections.sort(Emp2, new Sort_on_Salary());
		System.out.println(Emp2);

		// Collections.sort(studs);

		/*
		 * String s="Sort_on_name";
		 * 
		 * if(s.equals("Sort_on_name")) { Collections.sort(Emp2s,new Sort_on_name()); }
		 * else { Collections.sort(Emp2,new Sort_on_Salary());
		 * 
		 * } System.out.println(Emp2);
		 */

	}
}
