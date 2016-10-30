package softserve.com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyIO {
	public void read() {
		String fileName = "test.txt";
		int count = 0;
		int longestLine = 0;
		try (BufferedReader inFile = new BufferedReader(new FileReader(fileName));
				BufferedWriter outFile = new BufferedWriter(new FileWriter("test2.txt"));
				) {
			String str;
			while ((str = inFile.readLine()) != null) {
				String[] arr = str.replaceAll("[\\s]+", " ").split(" ");
				for (int i = 0; i < arr.length; i++) {
					if(longestLine<str.length()){
						longestLine=str.length();
					}
				}
				System.out.println();
				++count;
			}
			outFile.write("number of lines "+count);
			outFile.newLine();
			outFile.write("the longest line "+ longestLine);
			outFile.newLine();
			outFile.write("Oleh, 25.06.1991");
		} catch (IOException e) {
			System.out.println("sdf");
			e.printStackTrace();
		}
	}
}
