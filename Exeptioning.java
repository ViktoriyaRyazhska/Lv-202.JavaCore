package Lesson9.HomeWork;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Create method div(), which calculates the dividing of two double numbers.
 *  In main method input 2 double numbers and call this method. Catch all exceptions. 
Write a method readNumber(int start, int end), that read from console integer number 
and return it, if it is in the range [start...end]. 
If an invalid number or non-number text is read, the method should throw an exception. 
Using this method write a method main(), that has to enter 10 numbers:
	a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100

 */
public class Exeptioning {

	Scanner scanner = new Scanner(System.in);

	public double div() throws InputMismatchException, ArithmeticException {
		System.out.println("==========================TASK 1 START=========================");

		System.out.println("Enter first double number");
		double numberOne = scanner.nextDouble();
		System.out.println("Enter second double number");
		double numberTwo = scanner.nextDouble();
		double division = 0;

		division = numberOne / numberTwo;

		try {

			if (numberTwo == 0)
				throw new ArithmeticException();

		} catch (InputMismatchException e) {
		}
		System.out.println("Division of " + numberOne + " and " + numberTwo + " = " + division);
		System.out.println("==========================TASK 1 END=========================");

		return division;
	}

	public int readNumber(int start, int end) throws InputMismatchException {
		System.out.println("==========================TASK 2 START=========================");
		start = 1;
		end = 100;
		int inputNumber;

		System.out.println("Enter  integer number");
		inputNumber = scanner.nextInt();

		try {
			while (inputNumber >= start & inputNumber <= end) {
				System.out.println("Enter  integer number");
				inputNumber = scanner.nextInt();

			}

		} catch (InputMismatchException e) {

		}
		System.out.println("This number is out of range 0-100");

		System.out.println("==========================TASK 2 END=========================");

		return inputNumber;
	}

	public void closeScanner() {
		scanner.close();
	}

}
