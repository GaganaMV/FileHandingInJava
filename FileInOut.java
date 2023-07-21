package filehandling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInOut {

	public static void main(String[] args) throws IOException {
		try {
	FileOutputStream fos =  new FileOutputStream("D:/file1.txt");
	String s="Java provide I/O Streams to read and write data";
	byte b[] = s.getBytes();
	//fs.write("Hello Everyone");
	//fos.write(65);
	fos.write(b);
	System.out.println("Content written successfully ");
	
			
	FileInputStream fis=new FileInputStream("D:/file1.txt")	;

	System.out.println("File Content");
	int i=fis.read();
	while(i!=-1) {
		System.out.println(i);
		i=fis.read();
	}
	System.out.println();
	}catch(IOException e) {
		
		e.printStackTrace();
		
	}
	finally {
		System.out.println("File ended");
	}
		
		FileReader fReader = new FileReader("D:/file1.txt");
		BufferedReader bReader = new BufferedReader(fReader);
		int records;
		while((records = bReader.read()) != -1) { 
		System.out.print((char)records);
		} 
		bReader.close(); 
		//fReader.close()

	}

}
