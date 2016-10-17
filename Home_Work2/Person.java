package Home_Work2;

import java.time.Year;


public class Person {
	private String name;
	private int birthYear;
	
	public String getName(){return name;}
	public void setName(String name){this.name = name;}
	
	public int getBirthYear(){return birthYear;}
	public void setBirthYear(int birthYear){this.birthYear = birthYear;} 
	
	public Person(){}
	
	public Person(String name, int birthYear){
		this.name = name;
		this.birthYear = birthYear;
	}
	

	public int age(){
		return Year.now().getValue()- birthYear;
	}
	
	public void input(String name, int birthYear){
		this.name = name;
		this.birthYear = birthYear;
	}
	
	public void output(){
		System.out.println("Person name is: "+name);
		System.out.println("Person was born in: "+ birthYear);
		System.out.println("Person age is: "+this.age());
	}
	
	public void changeName(String newName){
		this.name = newName;
	}
	
	
	
	
	public static void main(String[] args) {
		Person person1 = new Person("Vitalik",1993);
		Person person2 = new Person("Vova",1988);
		Person person3 = new Person("Natalia",1992);
		Person person4 = new Person("Maks",2000);
		Person person5 = new Person("Roman",1980);
		
		person1.output();
		person2.output();
		person3.output();
		person4.output();
		person5.output();
		
	}

}
