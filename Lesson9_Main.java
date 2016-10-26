package Lesson9.HomeWork;

import java.util.InputMismatchException;

public class Lesson8_Main {

	public static void main(String[] args) {

		Exeptioning exeptioning = new Exeptioning();

		try {
			exeptioning.div();

		} catch (InputMismatchException e) {
			System.out.println("Enter numbers, not string. Use , instead of .");

		} catch (ArithmeticException e) {
			System.out.println("DIVISION BY 0!!! Do not input second number 0");

		}

		try {
			exeptioning.readNumber(0, 100);

		} catch (InputMismatchException e) {

		}
		
		exeptioning.closeScanner();
	}
}
