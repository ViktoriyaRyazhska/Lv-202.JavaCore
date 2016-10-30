package Home_Work4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[5];

		System.out.println("Enter five integer numbers");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(reader.readLine());
		}

		int count = 0;
		int secondPositiveNumber = 0;
		int position = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				count++;
			}
			if (count == 2) {
				secondPositiveNumber = numbers[i];
				position = i;
				break;
			}
		}

		int minimum = numbers[0];
		int minimumPosition = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < minimum) {
				minimum = numbers[i];
				minimumPosition = i;
			}
		}

		if (secondPositiveNumber == 0) {
			System.out.println("There are no positive numbers!");
		}else{System.out.println("Second positive number is :" + secondPositiveNumber + " its position: " + position);}


		System.out.println("The minimum is: " + minimum + "\n" + "The position of minimum is: " + minimumPosition);

	}

}
