package file_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Taking_Input_Using_InputStream_Class {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * //1. Taking input Using Scanner Class
		 * 
		 * String name; System.out.println("Enter Your name : "); Scanner sc = new
		 * Scanner(System.in); name = sc.nextLine();
		 * 
		 * System.out.println(name);
		 */

		// 2. Taking input Using InputStream Class

		String name;
		System.out.println("Enter Your name : ");
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		name = br.readLine();

		System.out.println(name);
	}

}
