package logical_program;

//palindrom no => the number to which when we read from start or  from end

//it appears to be the same number

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 354274185;

		System.out.println("The Forward Number Is = " + n);

		int sum = 0;

		while (n > 0) {

			sum = sum * 10;

			sum = sum + n % 10;
			n = n / 10;

		}

		System.out.println("The after Reverse Number Is = " + sum);

	}

}
