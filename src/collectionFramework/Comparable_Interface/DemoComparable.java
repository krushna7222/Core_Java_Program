package collectionFramework.Comparable_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//1.number data sorting(e.g sorting based on id)
//positive => no swap
///negative => swapping is needed

//2.string data sorting(e.g sorting based on name)
//greater/positive => swap
//lower/negative =no swap

public class DemoComparable {

	public static void main(String[] args) {

		List<Student> studs = new ArrayList<Student>();
		studs.add(new Student(12, "jay", "2666262"));
		studs.add(new Student(9, "vijay", "3466262"));
		studs.add(new Student(4, "digvijay", "3466262"));
		studs.add(new Student(16, "ajay", "9166262"));

		// 16-9 = 7
		// 9 -12 = -3
		// a < j, j< v
		// this.id- o.id;
		Collections.sort(studs); // calling compareTo()

		System.out.println(studs);
	}
}
/*
 * First comparison: Compare Student(16, "ajay") with Student(12, "jay")
 * 
 * 16 - 12 = 4 → result > 0 16 is greater than 12 → ajay should come after jay
 * (no swap needed here if already in that order)
 * 
 * Second comparison: Compare Student(9, "vijay") with Student(16, "ajay")
 * 
 * 9 - 16 = -7 → result < 0 9 is less than 16 → vijay should come before ajay →
 * swap needed
 * 
 * New intermediate order:
 * 
 * [ Student(12, "jay"), Student(9, "vijay"), Student(16, "ajay") ]
 * 
 * Now compare Student(9, "vijay") with Student(12, "jay"):
 * 
 * 9 - 12 = -3 → result < 0 9 is less than 12 → vijay should come before jay →
 * swap needed
 * 
 * Final sorted list:
 * 
 * [ Student(9, "vijay"), Student(12, "jay"), Student(16, "ajay") ]
 */

/*
 * Step 1: Compare "Jay" vs "Ajay"
 * 
 * "Jay".compareTo("Ajay") Java compares character by character:
 * 
 * 'J' (Unicode 74) vs 'A' (Unicode 65)
 * 
 * Since 'J' > 'A', the result is positive
 * 
 * Conclusion: "Jay" comes after "Ajay"
 * 
 * Action: Swap their positions
 * 
 * Intermediate List:
 * 
 * [ Student(16, "Ajay", "9166262"), Student(12, "Jay", "2666262"), Student(9,
 * "Vijay", "3466262") ] Step 2: Compare "Jay" vs "Vijay"
 * 
 * "Jay".compareTo("Vijay") 'J' (Unicode 74) vs 'V' (Unicode 86) //74- 86 Since
 * 'J' < 'V', result is negative
 * 
 * Conclusion: "Jay" comes before "Vijay"
 * 
 * Action: No swap needed
 * 
 * Final Sorted List (By Name):
 * 
 * [ Student(16, "Ajay", "9166262"), Student(12, "Jay", "2666262"), Student(9,
 * "Vijay", "3466262") ]
 * 
 * 
 */