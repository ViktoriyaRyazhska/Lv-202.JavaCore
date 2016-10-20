import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxMin {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number a ");
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("Enter number b ");

		int b = Integer.parseInt(br.readLine());
		System.out.println("Enter number c ");

		int c = Integer.parseInt(br.readLine());

		int max;
		int min;

		if (a > b && a > c) {
			max = a;
			System.out.println("Max is " + max);
		}

		if (b > a && b > c) {
			max = b;
			System.out.println("Max is " + max);
		}
		if (c > a && c > b) {
			max = c;
			System.out.println("Max is " + max);
		}

		if (a < b && a < c) {
			min = a;
			System.out.println("Min is " + min);
		}

		if (b < a && b < c) {
			min = b;
			System.out.println("Min is " + min);
		}
		if (c < a && c < b) {
			min = c;
			System.out.println("Min is " + min);
		}

	}

}
