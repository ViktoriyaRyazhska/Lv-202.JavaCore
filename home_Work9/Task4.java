package home_Work9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
	static int numberOfLines = 0;
	static String longestLine;
	static int lengthOfLine = 0;
	static String name;
	static String date;

	public static void main(String[] args) {
		
		System.out.println("Starting process...");
		
		String fileName1 = "src/home_Work9/MyCareer.txt";
		String fileName2 = "src/home_Work9/MyCareer1.txt";

		String pattern = "name is [a-zA-Z_0-9]+";
		String pattern1 = "[0-9]{2}\\.[0-9]{2}\\.[0-9]{4}";
		Pattern p = Pattern.compile(pattern);
		Pattern p1 = Pattern.compile(pattern1);
		

		try (BufferedReader reader = new BufferedReader(new FileReader(fileName1));
				BufferedWriter bw = new BufferedWriter(new FileWriter(fileName2))) {

			String line;
			while ((line = reader.readLine()) != null) {

				numberOfLines++;
				if (line.length() > lengthOfLine) {
					lengthOfLine = line.length();
					longestLine = line;
					
					Matcher m = p.matcher(line);
					Matcher m1 = p1.matcher(line);
					
					while (m.find()) {
						name = line.substring((m.start() + 8), m.end());
						
					}
					while (m1.find()) {
						date = line.substring((m1.start()), m1.end());
					}
					
				}
			}

			bw.write("The number of lines in MyCareer.txt: " + numberOfLines + "\n");
			bw.write("The longest line is: " + longestLine + "\n");
			bw.write("Your name is: " + name+"\n");
			bw.write("Your birth date is: " + date);

		} catch (IOException e) {
			System.out.println("Input/output error!");
		} 
		System.out.println("Sucsess, end of process");
	}

}
