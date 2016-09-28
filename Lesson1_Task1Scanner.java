package Lesson1.HomeWork;

import java.util.Scanner;

public class Lesson1_Task1Scanner {

	public static void main(String[] args) {
/*
 * Define integer variables a and b. 
 * Read values a and b from Console and calculate: a + b, a - b, a * b, a / b. 
Output obtained results.
*/
		int a, b;		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter namber a");		
		a = sc.nextInt();
		
		System.out.println("Enter namber a");
		b = sc.nextInt();
		
		System.out.println("Sum A + B = " + (a + b));
		System.out.println("subtraction A - B = " + (a - b));
		System.out.println("Multiplication A * B = " + (a * b));
		System.out.println("Division A/B = " + a/b);		
		
/*
Output question “How are you?“. Define string variable answer. 
Read the value answer and output: “You are (answer)".
 */
		System.out.println("How are you?");
		String line = sc.next();		
		System.out.println("You are " + line);
		
	}

}
