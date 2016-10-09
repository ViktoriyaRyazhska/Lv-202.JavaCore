package Lesson5.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Enter 5 integer numbers. 
 * Find position of second positive number;
	minimum and its position in the array.
 */
public class Lesson5_Task3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[5];

		System.out.println("Enter 5 integer numbers ->");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}
		System.out.println("Your array -> " + Arrays.toString(numbers));
		
		//Find position of second positive number;
		int positionOfSecondPositiveNumber = 0;
		int counter = 0;
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] > 0){
				counter++;
				positionOfSecondPositiveNumber = i + 1;
			}
			if(counter == 2){
				System.out.println("Position of second positive number -> " + positionOfSecondPositiveNumber);
			}
		}		
		
		//searching for minimum and its position in the array
		int min = numbers[0];
		int imin = 0;
		int i = 0;
		while (i < numbers.length) {
			if (numbers[i] < min) {
				min = numbers[i];
				imin = i;
			}
			i++;
		}
		System.out.println("Minimum = " + min + " is in " + (imin + 1) + " place");
		scanner.close();
	}
	//MISSION COMPLETED!!!
}
