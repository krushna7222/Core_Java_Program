package file_handling.serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class De_Serializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(
				"D:\\JAVA FullStack\\Backend\\Java\\Core_Java_Program\\serializable.txt");

		ObjectInputStream obj = new ObjectInputStream(fis);

		Student stud = (Student) obj.readObject();

		System.out.println(stud);
	}

}
