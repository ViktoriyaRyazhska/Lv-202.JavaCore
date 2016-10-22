import java.util.Scanner;
import java.util.regex.*;

public class Task3 {

	public static void main(String[] args) {
		String text;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter US currency");
		text = sc.next();
		String pattern = "[$][0-9]+[.][0-9]{2}";

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		while (m.find()) {
			System.out.print(text.substring(m.start(), m.end()) + "\n");
		}

	}
}
