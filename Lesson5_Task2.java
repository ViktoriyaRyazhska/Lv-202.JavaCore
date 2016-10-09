package Lesson5.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

/* TASK 2: Enter 10 integer numbers. 
 * Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case.
 */
public class Lesson5_Task2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[10];

		System.out.println("Enter 10 integer numbers ->");

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}
		System.out.println("Your array -> " + Arrays.toString(numbers));
		
		//Calculating the sum of first 5 elements if they are positive or product of last 5 element in the other case.
		if(numbers[0] > 0 & numbers[1] > 0 & numbers[2] > 0 & numbers[3] > 0 & numbers[4] > 0){
			int sum = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
			System.out.println("First 5 elements of array are positive, their sum = " + sum);
		} else{
			int prod = numbers[5] * numbers[6] * numbers[7] * numbers[8] * numbers[9];
			System.out.println("not ALL First 5 elements of array ARE positive, production of last 5 element = " + prod);
		}			
		scanner.close();
	}
	//MISSION COMPLETED!!!	
}
