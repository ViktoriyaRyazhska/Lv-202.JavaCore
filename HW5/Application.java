import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Application {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers;
		numbers = new int[10];

		System.out.println("Enter 10 numbers");

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}

		int sum = 0;
		int prod = 1;
		for (int i = 0; i < 10; i++) {
			if (i < 5 && numbers[i] >= 0) {
				sum += numbers[i];
				if (i == 4) {
					System.out.println("Sum " + sum);
					break;
				}
				continue;
			} else if (i >= 5 ) {
				prod *= numbers[i];
				if (i == 9) {
					System.out.println("Добуток " + prod);
				}
			}else {
				i = 4;
				continue;
			}
		}

	}
}
