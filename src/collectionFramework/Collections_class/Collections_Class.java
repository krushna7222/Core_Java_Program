package collectionFramework.Collections_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList l1 = new ArrayList();

		List l2 = List.of(78, 58, 45, 21, 747, 65, 25);
//		System.out.println("List.of Method " + l2);

		l1.add(15);
		l1.add(45);
		l1.add(75);
		l1.add(5);
		l1.add(43);
		l1.add(78);
		l1.add(96);
		l1.add(55);

		System.out.println(l1);

		Collections.sort(l1);
//		System.out.println("asc = " + l1);

		Collections.sort(l1, Collections.reverseOrder());
//		System.out.println("desc = " + l1);

//		Collections.addAll(l1, 14, 25, 36, 78, 58, 85);

//		System.out.println(l1);

		// 4. Binary Serarch

		Collections.sort(l1);
//		[5, 15, 43, 45, 55, 75, 78, 96]
//		System.out.println(l1);
//		System.out.println(Collections.binarySearch(l1, 43));// 2
//		System.out.println(Collections.binarySearch(l1, 40));// -3 => -2-1=-3

		// 5. Copylist

		ArrayList<Integer> l3 = new ArrayList<Integer>();
		l3.add(null);
		l3.add(null);
		l3.add(null);
		l3.add(null);
		l3.add(null);
		l3.add(null);
		l3.add(null);
		l3.add(null);
		System.out.println("before add element = " + l3);

		Collections.copy(l3, l1);

		System.out.println("after add element = " + l3);

		// 6.disjoint
		List<Integer> l4 = new ArrayList<Integer>();
		// l1= (ArrayList<Integer>) List.of(9,7,65,4,412,67,3);
		l2.add(560); // 0 //Integer x[]={56,17,8,67}
		l2.add(10); // 1
		l2.add(80); // 2
		l2.add(670); // 3
		l2.add(720); // 4
		l2.add(6); // 6
		l2.add(670);
		l2.add(610);

		System.out.println(Collections.disjoint(l1, l2)); // disjoint => no common element = true

	}

}
