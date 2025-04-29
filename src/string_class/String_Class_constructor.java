package string_class;

import java.util.Arrays;

//there are 6 constructors in String class
public class String_Class_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * //Constructor 1: String( )
		 * 
		 * String s=new String(); System.out.println(s);
		 */

		/*
		 * //Constructor 2: String(String s )
		 * 
		 * String s=new String("hello everyone!!"); System.out.println(s);
		 */

		/*
		 * //Constructor 3: String(char x[] ) //String to char array => toCharArray()
		 * method //char array to String => String constructor => String(char x[] )
		 * 
		 * char x[]= {'h','e','l','l','o',' ','e','v','e','r','y','o','n','e','!'};
		 * System.out.println("char array  = "+Arrays.toString(x));
		 * 
		 * String s=new String( x ); System.out.println("string  = "+s);
		 */

		/*
		 * //Constructor 4: String(char x[], int startIndex , int count ) // 0 1 2 3 4 5
		 * 6 7 8 9 10 char x[]= {'h','e','l','l','o','
		 * ','e','v','e','r','y','o','n','e','!'};
		 * System.out.println("char array  = "+Arrays.toString(x));
		 * 
		 * String s=new String( x ,6, 5 ); System.out.println("string  = "+s);
		 */

		// Constructor 5: String(byte x[], int startIndex , int count)
		// String to byte array =>getBytes() method
		// byte array to String conversion => String constructor => String(byte x[] )
//		byte b[] = { 104, 101, 108, 108, 111, 32, 107, 114, 117, 115, 104, 110, 97 };
//		System.out.println("Byte Array :- " + Arrays.toString(b));
//		String s = new String(b);
//		System.out.println("string  = " + s);
//		

		// Constructor 6: String(byte x[])

		// 0 1 2 3 4 5 6 7 8 9 10 11 12
		byte b[] = { 104, 101, 108, 108, 111, 32, 107, 114, 117, 115, 104, 110, 97 };
		System.out.println("Byte Array :- " + Arrays.toString(b));
		String s = new String(b, 6, 7);
		System.out.println("string  = " + s);

	}

}
