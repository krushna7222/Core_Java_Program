package logical_program;

public class RightHalfPeramid2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 15; i++) // rows
		{
			for (int j = 1; j <= 15; j++) // cols
			{
				if ((i + j) <= 15) {
					System.out.print(" ");
				} else {
					// System.out.print("*"); //only * => right half pyramid
					System.out.print("*"); // * space => full pyramid
				}
			}

			System.out.println();
		}

	}
}
