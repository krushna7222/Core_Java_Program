package java8_features.predicate_interface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class For_Each_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> l1 = new ArrayList<String>();

		l1.add("Mahesh");
		l1.add("Sairaj");
		l1.add("Jivesh");
		l1.add("Santosh");
		l1.add("Hemraj");
		l1.add("Sathish");
		l1.add("Raj");

		System.out.println("Print the name Start with 'S'");

		Predicate<String> p1 = (s) -> s.startsWith("S");
		l1.stream().filter(p1).forEach((p) -> System.out.println(p));

		System.out.println();

		System.out.println("Print the name end with with 'h'");

		Predicate<String> p2 = (s) -> !(s.endsWith("h"));
		l1.stream().filter(p2).forEach((p) -> System.out.println(p));

		System.out.println();
		System.out.println(l1);

//		l1.forEach((p) -> System.out.println(p));
//
//		for (String s : l1) {
//			System.out.println(s);
//		}
	}

}
