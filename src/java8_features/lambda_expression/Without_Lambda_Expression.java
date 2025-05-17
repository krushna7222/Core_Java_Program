package java8_features.lambda_expression;

interface Demo {

	void add(int a, int b);
}

//class DemoImpl implements Demo {
//
//	public void add(int a, int b) {
//		System.out.println("Addition is :- " + (a + b));
//	}
//}

public class Without_Lambda_Expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo d1 = new Demo() {
			public void add(int a, int b) {
				System.out.println("Addition is :- " + (a + b));
			}
		};

		d1.add(10, 20);
	}

}
