import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text;
		System.out.println("Enter phrase");
		text = sc.nextLine();
		System.out.println(text.replaceAll("[\\s]{2,}", " "));

	}

}
