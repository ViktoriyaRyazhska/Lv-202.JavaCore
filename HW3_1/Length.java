import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Length {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter number a ");

		float a = Float.parseFloat(br.readLine());

		System.out.println("Enter number b ");

		float b = Float.parseFloat(br.readLine());
		
		System.out.println("Enter number c ");

		float c = Float.parseFloat(br.readLine());
		
		if (a <= 5 && a >= -5) {
			System.out.println("a belong to the range [-5,5]");
		} else
			System.out.println("a  don't belong to the range [-5,5]");

		if (b <= 5 && b >= -5) {
			System.out.println("a  belong to the range [-5,5]");
		} else
			System.out.println("b don't belong to the range [-5,5]");

		if (c <= 5 && c >= -5) {
			System.out.println("c belong to the range [-5,5]");
		} else
			System.out.println("c don't belong to the range [-5,5]");

	}
}
