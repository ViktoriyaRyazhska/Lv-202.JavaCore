package Lesson4.HomeWork;

import java.util.Scanner;
/*Solve the next tasks:
read 3 float numbers and check: are they all belong to the range [-5,5];
read 3 integer numbers and write max and min of them;
read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)
 */
//This class was named like "Lesson4_Task1" only for better recognizing on GitHub, 
//I know that's not according to Java naming convention, SORRY!!!I wont write this in production code
public class Lesson4_Task1 {

	public static void main(String[] args) {

		// read 3 float numbers and check: are they all belong to the range
		// [-5,5];
		float numberOne, numberTwo, numberThree;
		Scanner sc = new Scanner(System.in);
		System.out.println("Task1: read 3 float numbers and check: are they all belong to the range [-5,5]");
		System.out.println("Enter first number");
		numberOne = sc.nextFloat();
		System.out.println("Enter second number");
		numberTwo = sc.nextFloat();
		System.out.println("Enter third number");
		numberThree = sc.nextFloat();

		if (numberOne >= -5 & numberOne <= 5) {
			System.out.println(numberOne + " belong to the range [-5,5]");
		} else
			System.out.println(numberOne + " out of the range [-5,5]");

		if (numberTwo >= -5 & numberTwo <= 5) {
			System.out.println(numberTwo + " belong to the range [-5,5]");
		} else
			System.out.println(numberTwo + " out of the range [-5,5]");

		if (numberThree >= -5 & numberThree <= 5) {
			System.out.println(numberThree + " belong to the range [-5,5]");
		} else
			System.out.println(numberThree + " out of the range [-5,5]");

		// read 3 integer numbers and write max and min of them;
		int number1, number2, number3;
		System.out.println("Task2: read 3 integer numbers and write max and min of them");
		System.out.println("Enter first number");
		number1 = sc.nextInt();
		System.out.println("Enter second number");
		number2 = sc.nextInt();
		System.out.println("Enter third number");
		number3 = sc.nextInt();

		if (number1 > number2 & number1 > number3) {
			System.out.println(number1 + " is MAX");
		} else if (number2 > number1 & number2 > number3) {
			System.out.println(number2 + " is MAX");
		} else if (number3 > number1 & number3 > number2) {
			System.out.println(number3 + " is MAX");
		}
		if (number1 < number2 & number1 < number3) {
			System.out.println(number1 + " is MIN");
		} else if (number2 < number1 & number2 < number3) {
			System.out.println(number2 + " is MIN");
		} else if (number3 < number1 & number3 < number3) {
			System.out.println(number3 + " is MIN");
		}

		// read number of HTTP Error (400, 401,402, ..., 410) and write the name of
		// this error (Declare enum HTTPError)
		System.out.println("Task3: read number of HTTP Error (400, 401,402, ..., 410) and write the name of this error (Declare enum HTTPError)");
		System.out.println("So, enter number of HTTP Error (400, 401,402, ..., 410)");
		int HTTPError;
		HTTPError = sc.nextInt();

		switch (HTTPError) {
		case 400:
			System.out.println(Lesson4.HomeWork.HTTPError.BAD_REQUEST);
			break;
		case 401:
			System.out.println(Lesson4.HomeWork.HTTPError.UNAUTHORIZED);
			break;
		case 402:
			System.out.println(Lesson4.HomeWork.HTTPError.PAYMENT_REQUIRED);
			break;
		case 403:
			System.out.println(Lesson4.HomeWork.HTTPError.FORBIDDEN);
			break;
		case 404:
			System.out.println(Lesson4.HomeWork.HTTPError.NOT_FOUND);
			break;
		case 405:
			System.out.println(Lesson4.HomeWork.HTTPError.METHOD_NOT_ALLOWED);
			break;
		case 406:
			System.out.println(Lesson4.HomeWork.HTTPError.NOT_ACCEPTABLE);
			break;
		case 407:
			System.out.println(Lesson4.HomeWork.HTTPError.PROXY_AUTENTIFICATION_REQUIRED);
			break;
		case 408:
			System.out.println(Lesson4.HomeWork.HTTPError.REQUEST_TIMEOUT);
			break;
		case 409:
			System.out.println(Lesson4.HomeWork.HTTPError.CONFLICT);
			break;
		case 410:
			System.out.println(Lesson4.HomeWork.HTTPError.GONE);
			break;
		default:
			System.out.println("WRONG!!! Enter number of HTTP Error from 400 to 410");
			break;
		}
	}
}

