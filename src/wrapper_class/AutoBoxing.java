package wrapper_class;

//Wrapper class => 8 => comes under java.lang -=>and  immutable classes

//int => Integer
//double => Double
//float => Float
//long   => Long
//boolean => Boolean
//char    => Character
//byte  => Byte
//short => Short

//Q.1. Is java 100% purely object oriented programming language?
//=> NO, because java uses primitive datatypes from C language and  c is Procedural Orienetd Programming Lang

//Q.2. What is the need of Wrapper classes?
//=> Wrapper classes are used converts primitive values into an object
public class AutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// JVM => takes every data in the form of object but user passes data in the
		// form of primitive values so wrapper classes
		// converts that primitive values into an object

		// conversion of primitive value into an object called as autoboxing.....
		// conversion of object into primitive values called as autoUnboxing.....
		/*
		 * int a=89; System.out.println("primitive int value a = "+a); //89
		 * 
		 * //Integer z =Integer.valueOf(a); //boxing Integer z = a; //Autoboxing
		 * System.out.println("Integer object z= "+z); //89
		 */

		boolean bl = true;
		System.out.println("primitive boolean value bl = " + bl); // true

		// Boolean b =Boolean.valueOf(bl);

		Boolean b = bl;
		System.out.println("Boolean object b = " + b); // true

	}

}
