package home_work8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static double div(double a, double b) throws ArithmeticException {
		if (b != 0) {
			return a / b;
		} else {
			throw new ArithmeticException("Dividing on zero!");
		}
	}

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Input two numbers");

		try {
			double a = Double.parseDouble(reader.readLine());
			double b = Double.parseDouble(reader.readLine());

			System.out.println(div(a, b));
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("Input(Output) exception!");
		} catch (NumberFormatException e) {
			System.out.println("Invalid number format!");
		}
	}

}
