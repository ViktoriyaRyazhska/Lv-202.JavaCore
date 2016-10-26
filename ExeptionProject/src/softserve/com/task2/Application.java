package softserve.com.task2;

import java.util.InputMismatchException;

import softserve.com.sours.MyExeption;
import softserve.com.sours.WrapperScanner;

public class Application {
	private static final WrapperScanner SCANNER = WrapperScanner.getInstance();
	public static void main(String[] args) {
		Task2 task2 = new Task2();
		for (int i = 0; i < 10; i++) {
			try {
				task2.readNumber(1, 12);
			} catch (MyExeption e) {
				System.out.println(e);
			}catch (InputMismatchException e) {
				System.out.println("You enter not integer number");
				SCANNER.getNextValue();
			}
		}
	}
}
