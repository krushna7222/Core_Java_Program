package file_handling;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Creatig_file_for_writing_bytes {

	// stream => container which stores data in the form of sequence of characters
	// types of streams
	// 1.input stream => System.in
	// 2. output stream => System.out
	// 3.error stream => System.err

	// writing byte type of data
	// FileOutputStream performs create, open, write, close operations on file

	// Buffer is a temporary memory in which we can store data...means we are
	// writing a
	// data first in buffer and then that buffer writes a data into file..so that
	// data
	// can be written faster
	// if we are using Buffer with output stream then all the data written
	// once means in one go from application to buffer and then from buffer to file

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream fout = new FileOutputStream("D:\\JAVA FullStack\\Backend\\Java\\Core_Java_Program\\demo.txt");

		// creating buffer
		BufferedOutputStream bout = new BufferedOutputStream(fout);

		fout.write(65);
		fout.write(66);
		fout.write(67);

		String s = "\nHello Everyone\nHello Java";

		byte b[] = s.getBytes();
		fout.write(b);

		fout.flush();
		fout.close();

		System.out.println("Write Operation Perform Succesfully!!!");

	}

}
