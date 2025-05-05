package collectionFramework.map_interface;

import java.util.LinkedHashMap;

//LinkedHashMap class is the child class of HashMap
//LinkedHashMap => Linked list(follows insertion order) + hash map
//LinkedHashMap follows insertion order(Property of list).

public class LinkedHAshMap_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Map<Integer , String> hm= new LinkedHashMap<Integer, String>();
		// or
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();

		// 1.Putting/adding entries(one key and value pair is called as one entry) in
		// hash map
		hm.put(123, "dhoni"); // 0 //entry
		hm.put(300, "sachin"); // 0
		hm.put(100, "virat"); // 0
		hm.put(301, "sachin"); // 0 //values can be duplicate e.g sachin
		hm.put(89, "jadeja"); // 0
		hm.put(110, "rohit"); // 0
		hm.put(200, "shubhman"); // 0

		System.out.println("hm = " + hm);

		// 1.
		// hm.compute(110, (k, v)-> v.concat("sharma") );
		// System.out.println(hm);

		// hm.compute(110, (k, v)-> v.replace('r','m') );
		// System.out.println(hm);

		// hm.compute(123, (k, v)-> v.toUpperCase() );
		// System.out.println(hm);

		// int to string conversion=> String.valueOf()
		// String to int conversion => Integer.parseInt()

		// String len =hm.compute(89, (k, v)-> String.valueOf(v.length())); //6, "6"
		// System.out.println(len);

		// 2.computeIfAbsent() => add if absent
		// hm.computeIfAbsent(150, v-> "rahul");
		// System.out.println(hm);

		// hm.computeIfAbsent(110, v-> "rahul");
		// System.out.println(hm);

		// 3.computeIfPresent() => update if present
		// hm.computeIfPresent(150, (k,v)-> "rahul");
		// System.out.println(hm);

//		hm.computeIfPresent(110, (k, v) -> "rahul");
//		System.out.println(hm);

		/*
		 * //4.here, merge() method merge the given value within the value of given key
		 * when key is present hm.merge(780, "kohali", (k,v)-> k+v);
		 * System.out.println(hm);
		 */

		/*
		 * //5.here, merge() method adds new entry with given key and given value when
		 * given key is absent in hm hm.merge(700, "kohali", (k,v)-> k+v);
		 * System.out.println(hm);
		 */

	}

}