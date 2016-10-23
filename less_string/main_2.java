package less_String_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		Pattern regex = Pattern.compile("[a-zA-Z0-9]+");
		String text = bufferedReader.readLine();
		Matcher matcher = regex.matcher(text);
		while(matcher.find()){
			System.out.print(text.substring(matcher.start(), matcher.end())+" ");
		}

	}

}
