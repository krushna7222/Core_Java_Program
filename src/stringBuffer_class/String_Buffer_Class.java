package stringBuffer_class;

//there are 3 constructors in String class
public class String_Buffer_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * //Constructor1 : StringBuffer(); StringBuffer sb =new StringBuffer();
		 * System.out.println(sb); System.out.println(sb.capacity()); //16
		 * 
		 */

		/*
		 * //Constructor2 : StringBuffer(int initialCapacity); StringBuffer sb =new
		 * StringBuffer(1000); System.out.println(sb);
		 * System.out.println(sb.capacity()); //1000
		 */

		/*
		 * //or StringBuffer sb =new StringBuffer(); System.out.println(sb);
		 * 
		 * System.out.println("default capacity of empty SB object = "+sb.capacity());
		 * 
		 * sb.append("hnjmkloipopoiujy");
		 * 
		 * sb.ensureCapacity(500); //using this ensureCapacity(500) method also we can
		 * set our own capacity
		 * 
		 */

		/*
		 * //Constructor3 : StringBuffer(String s);
		 * 
		 * StringBuffer sb =new StringBuffer("welcome"); System.out.println(sb); //16
		 * 
		 * System.out.println(sb.capacity()); //capacity = default_capacity+ length //
		 * 23 = 16 + 7
		 */

	}

}
