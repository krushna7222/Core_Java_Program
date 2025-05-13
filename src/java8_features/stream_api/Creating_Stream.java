package java8_features.stream_api;

import java.util.stream.Stream;

public class Creating_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<Integer> st = Stream.of(45, 47, 52, 69, 25, 15, 26, 2, 3, 5);

		System.out.println("Printing Stream.......");
		st.forEach((s) -> System.out.print(s + " "));

		Stream<Integer> st2 = Stream.of(45, 47, 52, 69, 25, 15, 26, 2, 3, 5);

		System.out.println("\n\nPrinting Even Number.......");
		st2.filter((n) -> n % 2 == 0).forEach((n) -> System.out.print(n + " "));

		Stream<Integer> st3 = Stream.of(45, 47, 52, 69, 25, 15, 26, 2, 3, 5);

		System.out.println("\n\nPrinting Sorted Number.......");
		st3.sorted().forEach((n) -> System.out.print(n + " "));

	}

}
