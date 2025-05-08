package java8_features.predicate_interface;

import java.util.function.Predicate;

public class With_Predicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p1 = (n) -> (n % 2 == 0);

		System.out.println(p1.test(66));
		System.out.println(p1.test(33));

		Predicate<String> p2 = (n) -> n.startsWith("k");
		System.out.println(p2.test("krushna"));

	}

}
