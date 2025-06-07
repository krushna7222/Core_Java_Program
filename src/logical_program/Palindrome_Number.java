package logical_program;

public class Palindrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 58285;
		int temp = 58285;
		int sum = 0;

		while (n > 0) {

			sum = sum * 10;

			sum = sum + n % 10;
			n = n / 10;

		}

		if (temp == sum) {
			System.out.println("The Number Is a Palindrome..");
		} else {
			System.out.println("The Number Is Not a Palindrome..");

		}

	}

}
