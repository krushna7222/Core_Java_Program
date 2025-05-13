package assignment;

public class ConvertUpperToLower_LowerToUpper_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "JaVa PrOgraMMinG lAngUagE";
		String splitarr[] = str.split(" ");

		for (int j = 0; j < splitarr.length; j++) {
			char arr[] = splitarr[j].toCharArray();

			for (int i = 0; i < arr.length; i++) {
				int ascii = arr[i];
				if (ascii >= 65 && ascii <= 90) {
					int new_ascii = ascii + 32;
					System.out.print((char) new_ascii);
				}
				if (ascii >= 97 && ascii <= 122) {
					int new_ascii = ascii - 32;
					System.out.print((char) new_ascii);
				}
			}
			System.out.print(" ");

		}

	}

}
