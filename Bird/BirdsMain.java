package Lesson6.HomeWork.Bird;

import java.lang.reflect.Array;

/*
 * Create array Bird and add different birds to it. 
Call fly() method for all of it. Output the information about each type of created bird.
 */

public class BirdsMain {

	public static void main(String[] args) {

		Chicken chicken = new Chicken();
		Eagle eagle = new Eagle();
		Penguin penguin = new Penguin();
		Swallow swallow = new Swallow();
		
		Bird [] birds = {chicken, eagle, penguin, swallow};
		
		for (Bird bird : birds) {
			System.out.println(bird);
			bird.fly();
		}
		
	}
	
	

}
