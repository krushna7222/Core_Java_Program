package java8_features.lambda_expression;

interface Demo15 {

	String greet();
}

public class Non_Parameterised_Lambda_Expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo15 d1 = () -> "Hello in Java Class";

		System.out.println(d1.greet());

	}

}
