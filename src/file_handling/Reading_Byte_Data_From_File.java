package file_handling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Reading_Byte_Data_From_File {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin = new FileInputStream("D:\\JAVA FullStack\\Backend\\Java\\Core_Java_Program\\demo.txt");

//		System.out.println(Arrays.toString(fin.readAllBytes()));
//		String data = Arrays.toString(fin.readAllBytes());
//
//		byte data1[] = data.getBytes(Arrays.toString(fin.readAllBytes()));
//
////		String s = new String(data);
//
//		System.out.println(Arrays.toString(data1));

		BufferedInputStream bin = new BufferedInputStream(fin);

		int i;

		do {
			i = bin.read(); // is used to read byte type of data from file
			System.out.print((char) i);

		} while (i != -1);

	}

}
