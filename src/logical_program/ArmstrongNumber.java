package logical_program;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		153,371
		int n = 153, r, temp;
		temp = n;

		int sum = 0;

		while (n > 0) {

			r = +n % 10;

			sum = sum + (r * r * r);

			n = n / 10;

		}

		if (sum == temp) {
			System.out.println(temp + " This Number Is Armstrong Number...");
		} else {
			System.out.println(temp + " This Number Is Not Armstrong Number...");

		}

	}
}
