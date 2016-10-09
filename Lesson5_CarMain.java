package Lesson5.HomeWork;

import java.util.Scanner;

/*
 * Create and initialize four instances of class Car. 
 * Display cars certain model year  (enter year in the console);
ordered by the field year.
 */
public class Lesson5_CarMain {

	public static void main(String[] args) {

		//Create and initialize four instances of class Car.
		Lesson5_Car zaz = new Lesson5_Car("fuel", 2013, 1300);
		Lesson5_Car vaz = new Lesson5_Car("fuel", 2008, 1500);
		Lesson5_Car tesla = new Lesson5_Car("electrical", 2016, 0);
		Lesson5_Car prius = new Lesson5_Car("hybrid", 2015, 1000);
		
		Lesson5_Car [] cars = {zaz, vaz, tesla, prius};	
		Scanner sc = new Scanner(System.in);

		//Display cars certain model year (enter year in the console)
		System.out.println("Enter car production year -> ");
		int prodYear;
		prodYear = sc.nextInt();
		for (int i = 0; i < cars.length; i++) {
			if(cars[i].getYearOfProduction() == prodYear){
			System.out.println(cars[i]);
			}
		}		
		
		//Ordering cars by the field year->
		System.out.println("Ordering cars by the field year->");
		Lesson5_Car temp = new Lesson5_Car();
		for (int i = 0; i < cars.length - 1; i++) {
			for (int j = i + 1; j < cars.length; j++) {
				if(cars[i].getYearOfProduction() > cars[j].getYearOfProduction()){
					temp = cars[i];
					cars[i] = cars[j];
					cars[j] = temp;
				}
			}
		}
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}		
		sc.close();
	}
}
