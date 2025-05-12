package java8_features.lambda_expression;

interface Demo14 {

	int add(int a, int b);
}

//class DemoImpl implements Demo {
//
//	public void add(int a, int b) {
//		System.out.println("Addition is :- " + (a + b));
//	}
//}

public class Without_Lambda_Using_return_Expression2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo14 d1 = new Demo14() {
			public int add(int a, int b) {
				return (a + b);
			}
		};

		System.out.println("Addition is:- " + d1.add(12, 21));
	}

}
