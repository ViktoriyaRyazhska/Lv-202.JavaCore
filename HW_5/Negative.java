import java.io.IOException;
import java.util.Scanner;

public class Negative {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);

		int prod = 1;
		int number;

		System.out.println("Enter numbers");
		while ((number = sc.nextInt()) >= 0) {
			if ((number % 2) == 0)
				prod = prod * number;

		}

		System.out.println("Product of positive numbers is " + prod);

	}

}
