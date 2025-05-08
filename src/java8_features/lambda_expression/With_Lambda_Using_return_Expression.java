package java8_features.lambda_expression;

@FunctionalInterface
interface Demo12 {

	int add(int a, int b);
}

//class DemoImpl implements Demo {
//
//	public void add(int a, int b) {
//		System.out.println("Addition is :- " + (a + b));
//	}
//}

public class With_Lambda_Using_return_Expression {

	public static void main(String[] args) {

		Demo12 a1 = (a, b) -> (a + b);

		System.out.println(a1.add(12, 6));

	}

}
