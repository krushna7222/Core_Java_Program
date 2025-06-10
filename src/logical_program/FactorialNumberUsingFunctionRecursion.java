package logical_program;

class Factorial {

	int fact(int n) {

		if (n == 1 || n == 0) {
			return 1;
		} else {
			return n * fact(n - 1);
		}

	}
}

public class FactorialNumberUsingFunctionRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factorial f1 = new Factorial();

		System.out.println("Factorial of given Number Is : " + f1.fact(7));

	}

}
