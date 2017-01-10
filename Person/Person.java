package Person;

import java.util.Scanner;

public class Person {

	private String name;
	private int birthYear;
	
	
	
	public Person(String name, int birthYear) {
		
		this.name = name;
		this.birthYear = birthYear;
		
	}

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

	
	public int  age(){
		int ag = 2016-birthYear;
		return ag;
		
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", birthYear=" + birthYear + "]";
	}

	public void inputPerson(){
		Scanner sc = new Scanner(System.in);
		System.out.println("¬вед≥ть ≥м€ особи:");
		name=sc.nextLine();
		System.out.println("¬вед≥ть р≥к народженн€ особи:");
		birthYear=sc.nextInt();
		
	}
	public void output(){
		System.out.println("особу звати "+name);
		
		
		System.out.println("особ≥  "+age()+"р.");
		
		}
	
	public void changeName(String name){
		this.name = name;
		
	}
	
}
