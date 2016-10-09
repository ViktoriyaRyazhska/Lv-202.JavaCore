package Lesson5.HomeWork;

import java.util.Scanner;

/*TASK 1: Ask user to enter the number of month. Read the value and
 * write the amount of days in this month (create array with amount days
 * of each month).
 */
public class Lesson5_Task1 {	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);		
		int monthDays[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		System.out.println("Enter the number of month from 1 to 12");
		int month = scanner.nextInt();
		System.out.println("The " + month + " month has " + monthDays[month] + " days");
		
		scanner.close();		
		}			
	//MISSION COMPLETED!!!
}
