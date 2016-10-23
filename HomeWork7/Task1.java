import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please, enter a sentence which contains five words:");
		String sentence = br.readLine();
		String[] words = sentence.split(" ");
		int imax = 0;
		int max = words[0].length();
		for (int i = 1; i < words.length; i++) {
			if (max < words[i].length()) {
				max = words[i].length();
				imax = i;
			}
		}
		StringBuilder sb = new StringBuilder(words[1]);
		sb.reverse();
		System.out.printf("The longest word - %s, its length is %d.\nReverse of second word - %s.", words[imax], max,
				sb);
	}

}
