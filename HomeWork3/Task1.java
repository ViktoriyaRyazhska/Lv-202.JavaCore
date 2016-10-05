import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Task1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Task 1.1\nPlease, enter 3 float numbers:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double number;
		byte error = 0;
		for (int i = 0; i < 3; i++) {
			number = Double.parseDouble(br.readLine());
			if ((number < -5) || (number > 5))
				error++;
		}
		if (error == 0) {
			System.out.println("All numbers belong to the range [-5; 5].");
		} else {
			if (error == 1) {
				System.out.printf("%d number doesn't belong to the range [-5; 5].\n", error);
			} else {
				System.out.printf("%d numbers don't belong to the range [-5; 5].\n", error);
			}
		}
		System.out.println("\nTask 1.2\nPlease, enter 3 integer numbers:");
		int[] numbers = new int[3];
		for (int i = 0; i < 3; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}
		int min = numbers[0];
		int max = numbers[0];
		for (int i = 1; i < 3; i++) {
			if (min > numbers[i]) {
				min = numbers[i];
			}
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.printf("Min - %d, Max - %d.\n", min, max);
		System.out.println("\nTask 1.3\nPlease, enter numbers (400 - 405):");
		switch (Integer.parseInt(br.readLine())) {
		case 400 : System.out.println(Error.BadRequest);
		break;
		case 401 : System.out.println(Error.Unauthorized);
		break;
		case 402 : System.out.println(Error.Payment);
		break;
		case 403 : System.out.println(Error.Forbidden);
		break;
		case 404 : System.out.println(Error.NotFound);
		break;
		case 405 : System.out.println(Error.MethodNotAllowed);
		break;
		default : System.out.println("Wrong number");
		}
	}

}

enum Error {
	BadRequest,
	Unauthorized,
	Payment,
	Forbidden,
	NotFound,
	MethodNotAllowed;
}