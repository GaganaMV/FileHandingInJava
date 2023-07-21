package filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AbsoultePath {

	public static void main(String[] args) throws IOException {
		File newFile5=new File("D://File//AbsoluteFileCreated.txt");
		Path absolutePath1 = Paths.get("C:\\Users\\ASUS\\eclipse-workspace\\CoreJava1\\src\\filehandling\\FileEx.java");
	    Path absolutePath2 = Paths.get("C:\\Users\\ASUS\\eclipse-workspace\\CoreJava1");

	    // convert the absolute path to relative path
	    Path relativePath = absolutePath2.relativize(absolutePath1);
	  
	    System.out.println("Relative Path: " + relativePath);
	    
	    if(newFile5.createNewFile()) {
			System.out.println("File is created");
		}
		else {
			System.out.println("File exists");
		}
	}

}
