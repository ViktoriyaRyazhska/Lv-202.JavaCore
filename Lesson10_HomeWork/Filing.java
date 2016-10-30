package Lesson10.HomeWork;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Filing {

	public static void main(String[] args) throws IOException {

		String inputFile = "file1.txt";
		String outputFile = "file2.txt";
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile));
		BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));

		int count = 0;
		int counter = 0;
		ArrayList<String> arrayList = new ArrayList<>();

		String str = null;
		while ((str = bufferedReader.readLine()) != null) {
			++count;
			counter++;
			arrayList.add(str);
		}

		int max = arrayList.get(0).length();
		int index = 0;
		for (int j = 1; j < arrayList.size(); j++) {
			if (max < arrayList.get(j).length()) {
				max = arrayList.get(j).length();
				index = j;
			}
		}

		String name = null;
		Pattern pattern1 = Pattern.compile("valerii yavorskyi");
		for (int j = 0; j < arrayList.size(); j++) {
			Matcher matcher = pattern1.matcher(arrayList.get(j));
			if (matcher.matches()) {
				name = arrayList.get(j);
			}
		}

		String birthDate = null;
		Pattern pattern2 = Pattern.compile("14.08.1989");
		for (int j = 0; j < arrayList.size(); j++) {
			Matcher matcher = pattern2.matcher(arrayList.get(j));
			if (matcher.matches()) {
				birthDate = arrayList.get(j);
			}
		}

		bufferedWriter.write("quantity of lines in input file: " + count + "	|||" + "the longest line: "
				+ arrayList.get(index) + " your name : " + name + "  your birth date : " + birthDate);

		bufferedWriter.close();
		bufferedReader.close();
	}

}
