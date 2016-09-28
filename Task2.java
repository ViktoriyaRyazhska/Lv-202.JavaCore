package Lesson1.HomeWork;

import java.util.Scanner;
import java.math.*;

public class Lesson1_Task2 {

	public static void main(String[] args) {
		/* < subtask 1>
		 * Flower bed is shaped like a circle.
		 *  Calculate the perimeter and area by entering the radius. 
		 *  Output obtained results.
		 */		
		double radius, perimeter, area;		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of flower bed");
		radius = sc.nextDouble();
		perimeter = 2* Math.PI * radius;
		area = Math.PI * radius * radius;
		System.out.println("Radius of flower bed = " + radius);
		System.out.println("Perimeter of flower bed = " + perimeter);
		System.out.println("Areaof flower bed = " + area);
	
		/* <subtask 2>
		 * Define string variable name and integer value age. 
		 * Output question "What is your name?" Read the value name and output next question:
		 * “Where are you live, (name)?". Read address and write whole information.
		 */		
		String name;
		int age;
		System.out.println("What is your name?");
		name = sc.next();
		System.out.println("Where are you live, " + name);
		String adress = sc.next();
		System.out.println(name + " , your adress is: " + adress);
		
		/* <subtask 3>
		 * Phone calls from three different countries are с1, с2 and с3 standard units per minute. 
		 * Talks continued t1, t2 and t3 minutes. 
		 * How much computer will count for each call separately and all talk together? 
		 * Input all source data from console, make calculations and output to the screen.
		 */
		double standardUnitPerMinuteC1, standardUnitPerMinuteC2, standardUnitPerMinuteC3;
		double timeCountC1, timeCountC2, timeCountC3;		
		
		System.out.println("How task about phone calls ->");
		
		System.out.println("Enter standard units per minute for Country1");
		standardUnitPerMinuteC1 = sc.nextDouble();
		System.out.println("Enter talks continued in minutes for Country1");
		timeCountC1 = sc.nextDouble();
		
		System.out.println("Enter standard units per minute for Country2");
		standardUnitPerMinuteC2 = sc.nextDouble();
		System.out.println("Enter talks continued in minutes for Country2");
		timeCountC2 = sc.nextDouble();
		
		System.out.println("Enter standard units per minute for Country3");
		standardUnitPerMinuteC3 = sc.nextDouble();
		System.out.println("Enter talks continued in minutes for Country3");
		timeCountC3 = sc.nextDouble();
		
		//calculation of talking costs
		double talkingCost1 = standardUnitPerMinuteC1 * timeCountC1;
		double talkingCost2 = standardUnitPerMinuteC2 * timeCountC2;
		double talkingCost3 = standardUnitPerMinuteC3 * timeCountC3;
		
		System.out.println("standard units per minute for Country1 = " + standardUnitPerMinuteC1 + "; " +
				" talks with Country1 = " + timeCountC1 + " minutes;" + 
				" talking coast = " + talkingCost1);
		
		System.out.println("standard units per minute for Country2 = " + standardUnitPerMinuteC2 + "; " +
				" talks with Country2 = " + timeCountC2 + " minutes;" + 
				" talking coast = " + talkingCost2);
		
		System.out.println("standard units per minute for Country3 = " + standardUnitPerMinuteC3 + "; " +
				" talks with Country3 = " + timeCountC3 + " minutes;" + 
				" talking coast = " + talkingCost3);
		
		
	}

}
