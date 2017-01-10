package hw8;

import java.util.regex.Pattern;

public class Matcher {

	public static void main(String[] args) {
		function();

	}
	public static void function() {
		 		Pattern pattern = Pattern.compile("\\d");
		 		java.util.regex.Matcher matcher = pattern.matcher("01234");
		 
		 		while (matcher.find()) {
		 			System.out.println("" + matcher.group());
		 		}
		 		matcher.reset();
		 		System.out.println("After resetting the Matcher");
		 		while (matcher.find()) {
		 			System.out.println("" + matcher.group());
		 		}
		 	}

}
