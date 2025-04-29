package stringBuffer_class;

public class String_Buffer_Method {

	// StringBuffer creates mutable(changeable) type of object
	// Q.difference between String and StringBuffer
	// => String is immutable and StringBuffer is mutable

	// String(immutable), StringBuffer(mutable)(java1),
	// StringBuilder(mutable)(java5)

	// College Application
	// 1.name => StringBuffer and StringBuilder
	// 2.subjects => StringBuffer and StringBuilder
	// 3. PRN => StringBuffer and StringBuilder
	// 4.fees => StringBuffer and StringBuilder
	// 5.clgname => String

	// Q.Except String, what are the different classes present inside java that are
	// immutable
	// => String and wrapper classes in java are immutable

	public static void main(String[] args) {
		// 012345678910 15
		StringBuffer s = new StringBuffer("hello dear java  users");
		System.out.println(s);

		// 1.reverse()
		// System.out.println(s.reverse());
		// System.out.println(s);

		// 2.delete()
		// System.out.println(s.delete(7, 10));

		// 3. deleteCharAt(int);
		System.out.println(s.deleteCharAt(4));

		// 3.replace()
		// System.out.println(s.replace(11, 15, "cpp")); //replacing "java" by "cpp"

		// 4. insert
		// s.insert(16, "language");
		// System.out.println(s);

		// s.insert(15, 21);
		// System.out.println(s);

		// 5.ensureCapacity()
		// 6.capacity()

	}

}
