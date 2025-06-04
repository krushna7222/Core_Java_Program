package logical_program;

public class RightHalfPeramid {

	public static void main(String[] args) {

		for (int i = 1; i <= 15; i++) {
			for (int j = 15; j >= 1; j--) {
				if ((i + j) <= 15) {
					System.out.print("*");
				} else {
					// System.out.print("*"); //only * => right half pyramid
					System.out.print(" "); // * space => full pyramid
				}
			}

			System.out.println();
		}

	}
}
