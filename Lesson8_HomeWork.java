package Lesson8.HomeWork;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson8_HomeWork {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("=========================Home Work Task 1==================");
		// Enter in the console sentence of five words.
		System.out.println("Enter in the console sentence of five words");
		String sentence = scanner.nextLine();

		// display the longest word in the sentence
		String[] words = sentence.split(" ");
		String longestWord = words[0];
		for (String word : words) {
			if (longestWord.length() < word.length()) {
				longestWord = word;
			}
		}
		System.out.println("The first longest word in your sentence is -> " + longestWord);

		// determine the number of its letters
		for (String word : words) {
			System.out.println("Word ->" + word + "<- has " + word.length() + "letters");
		}

		// bring the second word in reverse order
		for (int i = 0; i < words.length; i++) {
			if (i == 1) {
				StringBuilder str = new StringBuilder(words[i]);
				System.out
						.println("Second word->" + words[i] + "<-in your sentence in reverse order->" + str.reverse());
			}
		}
		System.out.println("========================= Task 1 End==================");

		System.out.println("=========================Home Work Task 2==================");
		/*
		 * Enter a sentence that contains the words between more than one space.
		 * Convert all spaces, consecutive, one. For example, if we introduce
		 * the sentence "I am learning Java Core», we have to get the "I'm
		 * learning Java Core»
		 */
		System.out.println("Enter a sentence that contains the words between more than one space");
		String sentence2 = scanner.nextLine();
		System.out
				.println("Converted sentence with 1 space beetween words -> " + sentence2.replaceAll("[\\s]{2,}", " "));
		System.out.println("========================= Task 2 End==================");

		System.out.println("=========================Home Work Task 3==================");
		/*
		 * Implement a pattern for US currency: the first symbol "$", then any
		 * number of digits, dot and two digits after the dot. Enter the text
		 * from the console that contains several occurrences of US currency.
		 * Display all occurrences on the screen.
		 */
		System.out.println("Enter the text from the console that contains several occurrences of US currency");
		String sentence3 = scanner.nextLine().trim();
		String pattern = "\\$(\\d*)(\\.\\d{2})?";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(sentence3);
		while (m.find()) {
			System.out.println(sentence3.substring(m.start(), m.end()));
		}
		System.out.println("========================= Task 3 End==================");
		scanner.close();
	}

}
