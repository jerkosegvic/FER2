package labos_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileEditor {
	public static void  processFile(String inputFile , String outputFile) throws IOException {
		
		File f2 = new File(outputFile);
		try {
			File f1 = new File(inputFile);
			Scanner myReader = new Scanner(f1);
			FileWriter myWriter = new FileWriter(f2);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
		        data = data.trim();
		        myWriter.write(data);
		    }
			myReader.close();
			myWriter.close();
		}
		catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}
	}
}
