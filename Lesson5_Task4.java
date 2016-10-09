package Lesson5.HomeWork;

import java.util.Scanner;

/*
 * Organize entering integers until the first negative number. 
 * Count the product of all entered even numbers.
 */
public class Lesson5_Task4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter integers ->");
		int prod = 1;		
		int number;
		
		while ((number = scanner.nextInt()) >= 0) {
			if (number % 2 == 0) {
				prod *= number;
			}
		}
		scanner.close();
		System.out.println("Product of all entered even numbers = " + prod);
	}
}
