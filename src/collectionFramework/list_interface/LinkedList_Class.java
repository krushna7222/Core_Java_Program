package collectionFramework.list_interface;

import java.util.LinkedList;

public class LinkedList_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// doubly linked list
//		List<Sting> ct = new LinkedList();

		LinkedList<String> ct = new LinkedList();
		ct.add("pune"); // 0 //head node
		ct.add("mumbai");// 1
		ct.add("nagpur"); // 2
		ct.add("pune");
		ct.add("hy");
		ct.add("bang");
		ct.add("chennai"); // tail node

		System.out.println(ct);

		/*
		 * //1.adding head node ct.addFirst("satara"); //2.adding tail node
		 * ct.addLast("panvel"); System.out.println(ct);
		 */

		// 3.accesses but does not remove head node
		// System.out.println(ct.element());
		// System.out.println(ct);

		// 4.poll() or pollFirst() =>accesses and remove head node
		// System.out.println(ct.poll());
		// System.out.println(ct);

		// System.out.println(ct.pollFirst());
		// System.out.println(ct);

		// 4.pollLast() =>accesses and remove tail node
		// System.out.println(ct.pollLast()); //null=> if the list is empty
		// System.out.println(ct);

		// 5.
		// System.out.println(ct.getFirst());
		// System.out.println(ct);

		// 6.
		// System.out.println(ct.getLast());
		// System.out.println(ct);

		// 7.addFirst() or offer()
		// ct.offer("xyz");
		// System.out.println(ct);

		// 8.element() or peekFirst() => .accesses but does not remove head node
		// System.out.println(ct.peekFirst());
		// System.out.println(ct);

		// 9.peekLAst() => .accesses but does not remove peek node
		// System.out.println(ct.peekLast());
		// System.out.println(ct);

		// 10.size()
		System.out.println(ct.size());
		// int i= ct.size( );

		ct.add(2, "kolhapur");
		System.out.println(ct);
		System.out.println(ct.size()); // 8

		System.out.println(ct.indexOf("kolhapur")); // 2

		// Calendar =>

	}

}
