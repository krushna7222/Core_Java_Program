package string_class;

import java.util.Arrays;

//WAP that count no of words present inside given string

public class Split_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Java is an object oriented programming language";

		String word[] = s.split(" "); // Split() method is used to split your original string on the basis of
										// specified character

		System.out.println("Number of word in given string is :- " + word.length);
		System.out.println("Array is :- " + Arrays.toString(word));

//		for (int i = 0; i < word.length; i++) {
//			System.out.println(word[i]);
//		}

	}

}
