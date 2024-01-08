package collectionex;

import java.io.File;
import java.io.IOException;

public class fileexample {
	public class FileExample {
		public static void main(String[] args) throws IOException {
			File newFile = new File("ListOfCourses.txt");
			if (newFile.createNewFile()) {
				System.out.println("File created.");
			} else {
				System.out.println("File exists.");
			}
		}
	}
}
