package scanner_class;

import java.util.Scanner;

class Student {
	int rollno;
	String name;
	char div;
	double marks;

	// next() => method takes an input till next word occurres in an input(means it
	// doens not take an input after the space)
	// nextLine() => method takes an input till next line occurres in an input(means
	// it take an input after the space till next line)
	void accept() {
		System.out.println("Enter student details(int,String,char,double) : ");
		Scanner sc = new Scanner(System.in);

		// String to int conversion => Integer.parseInt()
		rollno = Integer.parseInt(sc.nextLine()); // rollno="45 enter"
		// name = sc.next();
		name = sc.nextLine(); // name= //012345
		div = sc.next().charAt(0); // div=dh //"B" //"Jayesh"
		marks = sc.nextDouble();

	}

	void disp() {
		System.out.println();
		System.out.println("-----Student Details are:------------");
		System.out.println("roll no= " + rollno);
		System.out.println("name= " + name);
		System.out.println("div = " + div);
		System.out.println("marks = " + marks);

	}

}

public class Taking_char_and_string_input_from_user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		s1.accept();
		s1.disp();

		Student s2 = new Student();
		s2.accept();
		s2.disp();

	}

}
