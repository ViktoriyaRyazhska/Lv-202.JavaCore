import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyException extends Exception {
	public MyException() {
	}

	public MyException(String str) {
		super(str);
	}
}

public class Task1 {
	private static boolean flag = false;

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double a = 0;
		double b = 0;
		while (flag == false) {
			System.out.println("Please, enter a:");
			a = enterDouble(br);
		}
		flag = false;
		while (flag == false) {
			System.out.println("Please, enter b:");
			b = enterDouble(br);
		}
		try {
			System.out.println("a/b = " + div(a, b));
		} catch (MyException e) {
			System.err.println(e);
		}
	}

	public static double enterDouble(BufferedReader br) {
		double d;
		try {
			d = Double.parseDouble(br.readLine());
			flag = true;
			return d;
		} catch (NumberFormatException e) {
			System.out.println("Not double!!!");
			return 0;
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public static double div(double a, double b) throws MyException {
		if (b == 0) {
			throw new MyException("Division by zero!!!");
		} else
			return a / b;
	}
}
