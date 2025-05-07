package collectionFramework.map_interface;

import java.util.TreeMap;

public class SortedMap_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Map<Integer , String> tm= new TreeMap<Integer, String>();
		// or
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

		// 1.Putting/adding entries(one key and value pair is called as one entry) in
		// hash map
		tm.put(123, "dhoni"); // 0 //entry
		tm.put(300, "sachin"); // 0
		tm.put(100, "virat"); // 0
		tm.put(301, "rikalton"); // 0 //values can be duplicate e.g sachin
		tm.put(89, "jadeja"); // 0
		tm.put(110, "rohit"); // 0
		tm.put(200, "shubhman"); // 0

		System.out.println("tm = " + tm);

//		System.out.println(tm.ceilingEntry(100));
//		System.out.println(tm.ceilingKey(300));

//		System.out.println(tm.floorEntry(301));
//		System.out.println(tm.floorKey(301));

//		System.out.println(tm.containsKey(110));
//		System.out.println(tm.containsValue("shubhman"));

//		System.out.println(tm.firstEntry());
//		System.out.println(tm.lastEntry());

//		System.out.println(tm.pollLastEntry());
//		System.out.println(tm);

//		System.out.println(tm.size());

//		System.out.println(tm.descendingKeySet());
//		System.out.println(tm.descendingMap());

//		System.out.println(tm.lowerKey(100));
//		System.out.println(tm.higherKey(100));

		System.out.println(tm.isEmpty());

	}

}
