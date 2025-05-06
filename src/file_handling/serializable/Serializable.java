package file_handling.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//Writing object into the file
//Q.Why we need to serialized an object? OR what is need of serialization?
//=> because, object can contains different types of data so we cant write an
//object directly into a file..
//so we needs to converts or to performs serialization(object to byte stream conversion) on that object

//Serialization in Java is a mechanism of converting object state into a byte-stream.

//Serializable is a marker interface (has no data member and method). 
//1. Marker Interface                      => blank/empty/zero abstract method
//2. SAM/Single Abstract Method/functional => contains exactly one method

//Serializable interface must be implemented by the class whose object you want to serialized.

//byte type of data can be write and read fastly into the file
//The process of converting object into byte-stream is called as serialization
//but the byte-stream is non-readable to human and hence while reading that byte-stream we need to convert them back into an object is called as deserialization

//Program for Serialization/writing object into the file(by converting that object into  byte-stream)

class Student implements java.io.Serializable {
	int rollno;
	String name;
	transient double mark; // the property which is declared as a "transient" will not be serialized into
							// the bytestream
	// the default value for the transient property is according to its datatype
	// for string=> null
	// int,long,short,byte,=> 0
	// float, double => 0.0
	// boolean => false

	public Student(int rollno, String name, double mark) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", mark=" + mark + "]";
	}

}

public class Serializable {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Student s1 = new Student(101, "Krushna", 452.5);

		FileOutputStream fos = new FileOutputStream(
				"D:\\JAVA FullStack\\Backend\\Java\\Core_Java_Program\\serializable.txt");

		ObjectOutputStream obj = new ObjectOutputStream(fos);

		obj.writeObject(s1); // writing an object e1 into o_out means in ObjectOutputStream and then
								// ObjectOutputStream writes an object into file

		obj.flush();
		obj.close();

		System.out.println("Object Serilizable...");

	}

}
