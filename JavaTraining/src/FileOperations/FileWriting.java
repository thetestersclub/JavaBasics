package FileOperations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		
		//Stream Connectivity
		File f = new File("C:\\FileWriting\\myTextFile.txt");
		FileWriter fw = new FileWriter(f,true);
		BufferedWriter writer = new BufferedWriter(fw);
		
		//Write inside the file
		writer.write("Test");
		writer.newLine();
		writer.write("everybody");
		
		//Close the stream
		writer.close();
		
		System.out.println("File successfully created");
		

	}

}
