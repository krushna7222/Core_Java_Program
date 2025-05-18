package assignment;

import java.util.Scanner;

class Student {
	int rollno;
	String name;
	char div;
	double marks;
	float cgpa;
	long mobno;

	void accept() {
		System.out.println("Enter student details(int,String,char,double) : ");
		Scanner sc = new Scanner(System.in);

		rollno = Integer.parseInt(sc.nextLine());
		// name = sc.next();
		name = sc.nextLine();
		div = sc.next().charAt(0);
		marks = sc.nextDouble();
		cgpa = sc.nextFloat();
		mobno = sc.nextLong();

	}

	void disp() {
		System.out.println();
		System.out.println("---------Student Details are:------------");
		System.out.println("roll no= " + rollno);
		System.out.println("name= " + name);
		System.out.println("div = " + div);
		System.out.println("marks = " + marks);
		System.out.println("cgpa = " + cgpa);
		System.out.println("Mobile No. = " + mobno);
	}

}

public class All_Type_Value_Input {

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
