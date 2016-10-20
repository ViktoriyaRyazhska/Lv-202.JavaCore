import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence of five words");

		String words[] = new String[5];

		String longest = null;
		for (int i = 0; i < 5; i++) {
			words[i] = sc.next();
		}
		int l = 1;

		for (int o = 0; o < 5; o++) {
			if (words[o].length() > l) {
				l = words[o].length();
				longest = words[o];

			}
			o++;
		}
		System.out.println("Longest word is " + longest);
		System.out.println("This word consist of " + longest.length() + " letters");
		byte [] strAsByteArray = words[1].getBytes();
		  byte [] result = new byte [strAsByteArray.length];
		   
		  for(int i = 0; i<strAsByteArray.length; i++){
		  result[i] = strAsByteArray[strAsByteArray.length-i-1];
		  }
		  System.out.println( new String(result));
		   }
	}


