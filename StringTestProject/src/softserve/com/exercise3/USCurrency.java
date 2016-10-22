package softserve.com.exercise3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import softserve.com.exercise1.WrapperScanner;

public class USCurrency {

	public String enterSentense() {
		System.out.println("Enter US currency.");
		WrapperScanner scanner = WrapperScanner.getInstance();
		return scanner.getNextValue();
	}

	public void getUSCurrency(String... strings) {
		String pattern = "\\$(\\d*)(\\.\\d{2})";
		for (String string : strings) {

			Pattern p = Pattern.compile(pattern);
			Matcher m = p.matcher(string);

			while (m.find()) {
				System.out.println(m.group());
			}
		}
	}
}
