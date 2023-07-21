package filehandling;

import java.io.File;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {
		File newFile = new File("D://File//ListOfCourses.txt");//absoulte Path
		
		System.out.println("Absolute path"+newFile.getAbsolutePath());
		File  newFile1 = new File("D://File//ListOfCourses2.txt");
		System.out.println("Relative path"+newFile1.getCanonicalPath());
     	System.out.println("Absoulte path "+newFile1.getAbsolutePath());
     	
     	System.out.println("Read Write: "+newFile);
     	System.out.println("File Name: "+newFile.getName());
     	System.out.println("Size of the file:" +newFile.length());
     	
     	System.out.println(newFile.getParent());
     	
     	File newFile2 = new  File("C://Users//ASUS//eclipse-workspace//CoreJava1//src//filehandling//oops.txt");//relative path
     	String[] list = newFile2.list();
     	System.out.println("List of Files:"+list.length);
     	for(int i=0;i<list.length;i++) {
     		System.out.println(list[i]);
     	}
     	
     	
     	
		if(newFile2.createNewFile()) {
			System.out.println("File is created");
		}
		else {
			System.out.println("File exists");
	}
	}

}
