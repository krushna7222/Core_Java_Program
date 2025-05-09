package file_handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Creatig_file_for_writing_character {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter fw = new FileWriter("D:\\JAVA FullStack\\Backend\\Java\\Core_Java_Program\\char.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("Hello in Java");
		bw.write("\nJava is Object oriented Programming Language");
		bw.write("\nBye");

		bw.flush();
		bw.close();

		System.out.println("File Writting is Completed!!!");

	}

}
