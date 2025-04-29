package string_class;

public class Rotational_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ori_str = "table";
		String chk_string = "ablet";

		String test_str = ori_str.concat(ori_str);

		if (test_str.contains(chk_string)) {
			System.out.println("This is Rotational String...");
		} else {
			System.out.println("This is Non-Rotational String...");
		}

		/*
		 * Rotational_string=>means nothing but string in which after rotations will get
		 * original string
		 * 
		 * 
		 * //table => //ablet //bleta //letab //etabl //table
		 * 
		 * 
		 * non-Rotational_string
		 * 
		 * //table => //btale //ablte //tlabe
		 * 
		 * 
		 * 
		 * 
		 */

	}

}
