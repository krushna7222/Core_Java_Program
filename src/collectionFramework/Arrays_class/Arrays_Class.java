package collectionFramework.Arrays_class;

import java.util.Arrays;

public class Arrays_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0 1 2 3 4 5
		String days[] = { "tue", "fri", "sat", "wed", "thu", "Mon" };

		/*
		 * for(int i=0; i< days.length;i++) { System.out.println(days[i]); }
		 */
		// or

		// 1.toString => which prints/represents an array object in String format
		// System.out.println(Arrays.toString(days));

		// 2.Sort()
		// in string data sorting, Capital letters sort first, and then it performs
		// small case letters sorting

		// {"tue","fri","sat","wed","thu","mon"};
		// [fri, mon, sat, thu, tue, wed]

		/*
		 * Arrays.sort(days); System.out.println("after sorting , ascending days array="
		 * + Arrays.toString(days)); // fri,mon,sat,thu,tue,wed
		 * 
		 * Arrays.sort(days, Collections.reverseOrder());
		 * System.out.println("after sorting , descending days array=" +
		 * Arrays.toString(days)); // fri,mon,sat,thu,tue,wed
		 */

		// 3.asList() => array to list conversion
		// List to array conversion => toArray()
		// array to list conversion => asList()
//		List<String> l1 = Arrays.asList(days);
//
//		System.out.println("L1 IS = " + l1);

		// 4.BinarySearch

//		Arrays.sort(days);
		System.out.println(Arrays.toString(days));
//		System.out.println(Arrays.binarySearch(days, "sat"));

//		System.out.println("not in array " + Arrays.binarySearch(days, "sun"));// return -4

		// – (insertion point where the element should have been present if exist)-1).
		// - 3-1 => -4

		// 5. copyOf()

//		String days2[] = new String[days.length];
//
//		days2 = Arrays.copyOf(days, days.length);
//
//		System.out.println(Arrays.toString(days2));

		// 6. copyOfRange()

//		days2 = Arrays.copyOfRange(days, 2, 5);
//		System.out.println(Arrays.toString(days2));

		/*
		 * //7.equals() // 0 1 2 3 4 5 String days2[] =
		 * {"tue","fri","sat","wed","sun","Mon"};
		 * 
		 * System.out.println(Arrays.equals(days,days2));
		 */

		// 8.fill

//		Arrays.fill(days, "hello");
//		System.out.println("after fill, days = " + Arrays.toString(days));

		Arrays.fill(days, 2, 3, "sun");
		System.out.println(Arrays.toString(days));

	}

}
