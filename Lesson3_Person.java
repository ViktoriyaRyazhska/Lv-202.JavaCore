package Lesson3.HomeWork;

import java.util.Calendar;

//This class was named like "Lesson3_Person" only for better recognizing on GitHub, 
//I know that's not according to Java naming convention, SORRY!!!
public class Lesson3_Person {
	/*
	 * Class Person should consists of 
	 * two private fields: name and birthYear (the birthday year) 
	 * 
	 * properties for access to these fields
	 * 
	 * default constructor and constructor with 2 parameters
	 * 
	 * methods: 
	 * age - to calculate the age of person
	 * input - to input information about person 
	 * output - to output information about person
	 * changeName - to change the name of person
	 *     
	 * In the method main() create 5 objects of Person type and input
	 * information about them. 
	 */
	
	//two private fields: name and birthYear (the birthday year)
	private String name;
	private int birthYear;
	
	//default constructor and constructor with 2 parameters
	public Lesson3_Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	public Lesson3_Person() {
	}
	
	//age - to calculate the age of person
	public void age(int birthYear){		
	    Calendar calendarNow = Calendar.getInstance();
	    int currentYear= calendarNow.get(calendarNow.YEAR);
	    int age = currentYear - birthYear;	    
	    System.out.println(this.getName() + " is " + age + " years old");;
	}
	
	//input - to input information about person -> the same as constructor with two fields
	public void input(String name, int birthYear){
		this.setName(name);
		this.setBirthYear(birthYear);	
	}	
	
	//output - to output information about person -> used toString
	public void output(){
		System.out.println(this.toString());
	}
	
	//changeName - to change the name of person -> the same as method setName()
	public void changeName(String name) {
		this.name = name;
	}	
	
	//properties for access to these fields -> getters&setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	@Override
	public String toString() {
		return "Person: name - " + name + "; year of birth -> " + birthYear;
	}	
	
}
