package hw8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dollar {
	public String enterSentense() {
		 		System.out.println("Enter US currency.");
		 		WScanner scanner = WScanner.getInstance();
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
