package collectionFramework.map_interface;

import java.util.HashMap;

//Map is a collection of elements.MAp stores the elements in the form of key and value pair
//And in map we have to specify elements in key and value pair
//- A Map contains unique keys where as values can be duplicate.

//HashMap=> Hash table + Map
//1. HAshMap doesn't follows the insertion order
//2. It does not allows duplicate entries..

public class HashMap_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Map<Integer , String> hm= new HashMap<Integer, String>();
		// or
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

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

		/*
		 * //2.iterating Map using for each loop for(Map.Entry<Integer, String> z :
		 * hm.entrySet()) { //System.out.println(z); //System.out.println(z.getKey());
		 * //System.out.println(z.getValue()); if(z.getValue().startsWith("s")) {
		 * System.out.println(z.getValue()); } }
		 */

		// 2.replacing value for the given key
		// hm.put(89, "hardik"); //if we are trying to add duplicate key in map then it
		// will replace the given new value at the place old value of mentioned key
		// System.out.println(hm);

		// 3.
		// System.out.println(hm.containsKey(400)); //false
		// System.out.println(hm.containsKey(89)); //true

		// 4.accessing only keys from hashmap
		// System.out.println(hm.keySet());

		// 5.accessing only values from hashmap
		// System.out.println(hm.values());

		// 6.removing entry from hashmap
		// hm.remove(100);
		// System.out.println(hm);

		// 7.replacing value for the given key
		// hm.replace(89, "hardik");
		// System.out.println(hm);

		System.out.println(hm.size());

	}

}