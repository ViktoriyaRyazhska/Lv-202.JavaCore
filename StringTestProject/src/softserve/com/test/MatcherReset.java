package softserve.com.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherReset {
	public static void main(String args[]) {
		function();
	}

	public static void function() {
		Pattern pattern = Pattern.compile("\\d");
		Matcher matcher = pattern.matcher("01234");

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
