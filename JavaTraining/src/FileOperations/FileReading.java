package FileOperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Stream Connectivity
				File f = new File("C:\\FileWriting\\myTextFile.txt");
				FileReader fr = new FileReader(f);
				BufferedReader read = new BufferedReader(fr);
				
				//read inside the file
				String line = null;
				while((line = read.readLine())!=null) {
					System.out.println(line);
				}
				
//				System.out.println(read.readLine());
//				System.out.println(read.readLine());


				//Close the stream
				read.close();
				
//				System.out.println("File successfully read");

	}

}
