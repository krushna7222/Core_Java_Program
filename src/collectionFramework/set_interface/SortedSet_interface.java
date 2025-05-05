package collectionFramework.set_interface;

import java.util.TreeSet;

//SortedSet is an interface and TreeSet is the implementation class of SortedSet
//SortedSet interface sorts the objects of collection in ascending order by default

//NavigableSet is the child interface of SortedSet interface....which also sorts data in ascending order by default 

public class SortedSet_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// NOTE => SortedSet interface performs all the operations on sorted data

		// SortedSet<Integer> ts= new TreeSet<Integer>();

//        TreeSet<Integer> ts= new TreeSet<Integer>();
		TreeSet<Integer> ts = new TreeSet<Integer>();

		// NavigableSet<Integer> ts= new TreeSet<Integer>();
		ts.add(67);
		ts.add(10);
		ts.add(6);
		ts.add(77);
		ts.add(17);
		ts.add(10);
		ts.add(34);
		ts.add(22);

		System.out.println("ascending ts = " + ts);

		// 1.Descending set

		// System.out.println("descending ts = "+ts.descendingSet());

		// 1.ceiling => returns the element which is greater than or equal tothe given
		// element
		// ascending ts = [6, 10, 17, 22, 34, 67]
		// System.out.println(ts.ceiling(26)); //34 => bcz, 26 value is not present in
		// given ts hence returning 34(greater than 26)
		// System.out.println(ts.ceiling(22)); //22 => bcz, 22 is present in ts so given
		// 22 is equal to 22 which is present in ts
		// System.out.println(ts.ceiling(92)); //null

		// 2.floor => returns the element which is less than or equal to the given
		// element
		// System.out.println(ts.floor(26)); //22
		// System.out.println(ts.floor(22)); //22
		// System.out.println(ts.floor(5)); //null

		// 3.tailSet=> returning all the elements from ts which are greater than or
		// equal to given element
		// ascending ts = [6, 10, 17, 22, 34, 67,77]
		// System.out.println(ts.tailSet(26)); // [34, 67,77]
		// System.out.println(ts.tailSet(22)); //[22, 34, 67,77]

		// 4.headSet=> returning all the elements from ts which are strictly less than
		// given element

		// ascending ts = [6, 10, 17, 22, 34, 67,77]
		// System.out.println(ts.headSet(26)); // [6, 10, 17, 22,]
		// System.out.println(ts.headSet(22)); //[6, 10, 17]

		// 5.higher() => returns the element which is greater than or equal tothe given
		// element
		// ascending ts = [6, 10, 17, 22, 34, 67,77]

		// System.out.println(ts.higher(22)); //34

		// 6.lower() => returns the element which is strictly less than tothe given
		// element
		// ascending ts = [6, 10, 17, 22, 34, 67,77]
		// System.out.println(ts.lower(22)); //17

		// 7.first()=> returns first or smallest element from set
		// 8.last()=> returns last or highest element from set
		// ascending ts = [6, 10, 17, 22, 34, 67,77]
		// System.out.println(ts.first());
		// System.out.println(ts.last());

		/*
		 * //8.subSet
		 * 
		 * //ascending ts = [6, 10, 17, 22, 34, 67,77] System.out.println(ts.subSet(17,
		 * 67)); //here, 17 is fromElement and 67 is toElement, so fromElement is
		 * inclusive in the o/p whereas toElement is exclusive from the o/p [17, 22, 34]
		 * System.out.println(ts.subSet(17, 68));
		 */

		/*
		 * //9.pollFirst()=> Retrieves and removes the first (lowest) element,or returns
		 * null if this set is empty. //ascending ts = [6, 10, 17, 22, 34, 67,77]
		 * System.out.println(ts.pollFirst()); //6 System.out.println(ts); //6
		 * 
		 */

		// 10.pollLast()=> Retrieves and removes the last (highest) element,or returns
		// null if this set is empty.
		// ascending ts = [6, 10, 17, 22, 34, 67,77]
		System.out.println(ts.pollLast()); // 77
		System.out.println(ts);

	}
}
