package home_Work7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the sentence of five words");
		String sentence = reader.readLine();

		String[] words = sentence.split(" ");

		System.out.println(Arrays.toString(words));

		int temp = words[0].length();

		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > temp) {
				temp = words[i].length();
			}
		}

		for (String word : words) {
			if (word.length() == temp) {
				System.out.println("The longest word: " + word);
			}
		}
		System.out.println("The number of its letters: " + temp);
		System.out.println("The second word in reverse order: " + new StringBuilder(words[1]).reverse().toString());
	}

}
