import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Task2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please, enter a sentence:");
		String sentence = br.readLine();
		Pattern p = Pattern.compile(" +");
		System.out.println("Result after replacing 'extra spaces' - " + sentence.replaceAll(" +", " "));
	}

}
