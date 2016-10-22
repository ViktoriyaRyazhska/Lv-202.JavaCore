package home_Work7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the sentence that contains the words between more than one space");
		String sentence = reader.readLine();

		String[] words = sentence.split(" ");

		for (String word : words) {
			if (!word.equals("")) {
				System.out.print(word + " ");
			}
		}

	}

}
