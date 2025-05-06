package string_class;

//Intern method => It creates exact copy of heap string object inside SCP
public class Intern_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String("hello"); // 2 heap and SCP
		String s2 = "hello"; // 1 SCP
		String s3 = s1.intern(); // s1.intern() returns/copy a string from heap into SCP and then stored that SCP
									// copy into s3,now s3 will be same as s2 because, both s2 and s3 are referring
									// to the object present inside scp area
		// 6==6
		System.out.println(s1 == s2); // false because reference variables s1 and s2 are pointing to different
										// instance/objects in memory(s1 present in heap and s2 present in scp).here s1
										// pointing to the heap object whereas s2 is pointing to the SCP object
		System.out.println(s2 == s3); // true because reference variables s2 and s3 are pointing to same instance in
										// memory(that is present inside SCP). Here, s2 and s3 both are pointing to the
										// SCP object

		/*
		 * equals() method => (equals method always meant for content comparison)
		 * ==comparator operator=>(comparator operator always meant for reference
		 * comparison)
		 */

		// comparator operator returns true when both the strings are reffering to the
		// same object in memory
	}

}
