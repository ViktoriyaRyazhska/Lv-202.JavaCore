package home_work8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

	public static int readNumber() throws IOException, ReadNumberException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter start and end number");

		try {
			int start = Integer.parseInt(reader.readLine());

			int end = Integer.parseInt(reader.readLine());

			System.out.println("Enter the number");

			int n = Integer.parseInt(reader.readLine());

			if ((n >= start) && (n <= end)) {
				return n;
			} else {
				throw new ReadNumberException("Invalid number");
			}
		} catch (NumberFormatException e) {
			throw new ReadNumberException("Not a number inputed");
		}
	}

	public static void main(String[] args) {
		try {
			for (int i = 0; i < 10; i++) {
				Task2.readNumber();
			}
		} catch (IOException e) {
			System.out.println("Input/output Exception! try again");
		} catch (ReadNumberException e) {
			System.out.println(e.getMessage());
		}
	}
}

class ReadNumberException extends Exception {

	public ReadNumberException() {
	}

	public ReadNumberException(String msg) {
		super(msg);
	}
}
