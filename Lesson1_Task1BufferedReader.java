package Lesson1.HomeWork;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Create Console Application project in Java.
In method main() write code for solving next tasks:
Define integer variables a and b. Read values a and b from Console 
and calculate: a + b, a - b, a * b, a / b. 
Output obtained results.
Output question “How are you?“. Define string variable answer. 
Read the value answer and output: “You are (answer)". 
 */
public class Lesson1_Task1BufferedReader {

	public static void main(String[] args) throws IOException {
		
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number a");		
		String numberA = br.readLine();
		int a = Integer.parseInt(numberA);
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));		
		System.out.println("Enter number b");
		String numberB = br1.readLine();
		int b = Integer.parseInt(numberB);

		System.out.println("Sum A + B = " + (a + b));
		System.out.println("subtraction A - B = " + (a - b));
		System.out.println("Multiplication A * B = " + (a * b));
		System.out.println("Division A/B = " + a/b);
		
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));		
		System.out.println("How are U ?");
		String answer = br.readLine();
		System.out.println("You are " + answer);

	}

}
