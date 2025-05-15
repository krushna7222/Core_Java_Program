package type_casting;

import java.util.Arrays;

//Casting(conversion)

//datatype casting => converts one datatype into another datatypes

//1.upcasting/widening(conversion of smaller size datatype into larger size)
//upcasting will be done automatically by the compiler

//2.downcasting/narrowing(conversion of larger size datatype into smaller size)
//downcasting will be done explicitely by using cast operator

//8 primitive
//int,short,long,double,float,char,boolean,byte
//boolean(1-bit)=>byte(1)=>char(2)=> short(2)=> int(4)=>float(4)=>long(8)=>double(8)

public class UpCasting {

	public static void main(String[] args) {

		/*
		 * //1.byte(1) to double(8)
		 * 
		 * byte a= 120; //-128 to +127 System.out.println("byte value  = "+a); //120,
		 * 
		 * double z= a; System.out.println("double value  = "+z); //120.0
		 * 
		 */

		/*
		 * //2.char(2) to int(4)
		 * 
		 * char ch = 'D'; //-128 to +127 System.out.println("char value  = "+ch); //D
		 * 
		 * int i =ch; System.out.println("int value  = "+i); //68
		 */

		/*
		 * //3. float(4) to long(8)
		 * 
		 * float h= 4.5f; System.out.println("float value  = "+h); //4.5
		 * 
		 * long k =(long)h; System.out.println("long value  = "+k); //4
		 */

		/*
		 * //4. boolean(1 bit) to int(4 byte) boolean bl= false; //byte,short,long,
		 * float, double, String,
		 * 
		 * System.out.println("boolean value  = "+bl); //true=1,false=0
		 * 
		 * int j = bl ? 1 : 0 ;
		 * 
		 * System.out.println("int value  = "+j);
		 * 
		 */

		// 6.String to int => Integer.parseInt()
//		String to Boolean => Boolean.parseBoolean(String)
//		Striong to Long => Long.parseLong(String)

//		String s = "4";
//		String s1 = "7";
//
//		System.out.println(Integer.parseInt(s) + Integer.parseInt(s1));

		/*
		 * 
		 * 
		 * //String to long => Long.parseBoolean() /* // String to boolean =>
		 * Boolean.parseBoolean() //6.String to int => Integer.parseInt() //float to
		 * String => String.valueOf(float f) //double to String => String.valueOf(double
		 * f) //boolean to String => String.valueOf(boolean f) //6.int to String =>
		 * String.valueOf(int a) //7. byte array to String conversion => String
		 * constructor => String(byte x[] ) //8. byte array to String conversion =>
		 * String constructor => String(byte x[] )
		 * 
		 */

//		 7.  int to String => String.valueOf(int a)
		// double to String => String.valueOf(double d)
		// boolean to String => String.valueOf(boolean b)
		// float to String => String.valueOf(float f)

//		int a = 120;
//
//		System.out.println("int Value a = " + a);
//
//		String s = String.valueOf(a);
//		System.out.println("String Value s = " + s);

//		8. Byte To String

//		byte b[] = { 104, 101, 108, 108,111 };
//
//		String s = new String(b);
//
//		System.out.println(s);

//		8. String To Byte

		String s = "hello";
		byte b[] = s.getBytes();

		System.out.println("String = " + Arrays.toString(b));

	}

}