package filehandling;

import java.io.File;
import java.io.IOException;

public class FileEx2 {

	public static void main(String[] args) throws IOException {
		
       File newFile4 = new File("D://File//ListOfCourses4.txt");
		
		System.out.println("Absolute path"+newFile4.getAbsolutePath());
		
		File  newFile3 = new File("D://File//ListOfCourses3.txt");
		System.out.println("Relative path"+newFile3.getCanonicalPath());
     	System.out.println("Absoulte path "+newFile3.getAbsolutePath());
     	if(newFile4.createNewFile()) {
			System.out.println("File is created");
		}
		else {
			System.out.println("File exists");
		}
	}

}
