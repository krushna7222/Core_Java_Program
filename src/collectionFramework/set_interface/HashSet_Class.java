package collectionFramework.set_interface;

import java.util.HashSet;

//Set or HashSet Properties
//1.Set is a unordered type of collection means it does not preserves the
//insertion order
//2. duplicates are not allowed

//HashSet
//HashSet is combination of set + hashtable(hashtable is a table which stores
//the elements in key and value pair)

//HashSet is implementation class or child class of Set interface

public class HashSet_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Set<Integer> hs= new HashSet<Integer>();
		// or

		HashSet<Integer> hs = new HashSet<Integer>();

		hs.add(88);
		hs.add(12);
		hs.add(67);
		hs.add(56);
		hs.add(29);
		hs.add(3);
		hs.add(12);

		System.out.println(hs);

		System.out.println("Elements which are divisible by 3 from hs : ");
		for (Integer x : hs) {
			if (x % 3 == 0) {
				System.out.println(x);
			}
		}

	}

}