package softserve.com.person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Person {
	private String name;
	private int birthYear;

	public Person() {
	}

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

	public void setBirthYear(short birthYear) {
		this.birthYear = birthYear;
	}

	public int getAge() {
		return  (LocalDate.now().getYear() - birthYear);
	}

	public void input() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			System.out.println("Hello. What is your name?");
			name = br.readLine();
			System.out.println("When are you born?");
			birthYear =  Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println("You input incorrect information. Try again.");
			input();
		}
	}

	public void output() {
		System.out.println(toString());
	}

	public void changeName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthYear=" + birthYear + " age="+ getAge()+"]";
	}
}