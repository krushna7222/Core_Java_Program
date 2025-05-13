package assignment;

import java.util.Arrays;

public class Replace_String_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String days[] = { "tue", "fri", "sat", "wed", "thu", "Mon" };

		System.out.println(Arrays.binarySearch(days, "sat"));
		Arrays.fill(days, 2, 3, "sun");

		System.out.println(Arrays.toString(days));

	}

}
