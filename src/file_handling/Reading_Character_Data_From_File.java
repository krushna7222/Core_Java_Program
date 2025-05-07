package file_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reading_Character_Data_From_File {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("D:\\JAVA FullStack\\Backend\\Java\\Core_Java_Program\\char.txt");
		BufferedReader br = new BufferedReader(fr);

		int i;

		do {
			i = br.read();
			System.out.print((char) i);

		} while (i != -1);
	}

}
