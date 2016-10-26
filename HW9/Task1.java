import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter numbers");
		double a = 0;
		try {
			a = Double.parseDouble(br.readLine());
		} catch (NumberFormatException | IOException e) {

			e.printStackTrace();
		}
		double b = 0;
		try {
			b = Double.parseDouble(br.readLine());
		} catch (NumberFormatException | IOException e) {

			e.printStackTrace();
		}

		try {
			System.out.println(div(a, b));
		} catch (MyException e) {

			e.printStackTrace();
		}

	}

	public static double div(double a, double b) throws MyException {
		if (b == 0)
			throw new MyException("Division by zero!");
		return a / b;
	}
}

class MyException extends Exception {
	public MyException() {
	}

	public MyException(String str) {
		super(str);
	}
}
