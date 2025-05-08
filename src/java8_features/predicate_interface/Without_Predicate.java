package java8_features.predicate_interface;

class Sample {
	static boolean test(int n) {
		if (n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}

public class Without_Predicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Sample.test(36));

	}

}
