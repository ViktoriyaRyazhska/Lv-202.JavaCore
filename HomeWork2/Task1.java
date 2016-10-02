import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

abstract class Shape{
	
	
}
class Person {
	private int birthYear;
	private String name;

	public Person() {
	}

	public Person(int birthYear, String name) {
		this.birthYear = birthYear;
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please, enter your name:");
		String newName = br.readLine();
		setName(newName);
		System.out.println("Please, enter your Birthday year:");
		int newBirthYear = Integer.parseInt(br.readLine());
		setBirthYear(newBirthYear);
	}

	public void output() {
		System.out.printf("Your name is %s, your Birth year are %d.\n", this.name, this.birthYear);
	}

	public void changeName(String name) {
		this.name = name;
	}

	public void age() {
		System.out.println("Your age: " + (Calendar.getInstance().get(Calendar.YEAR) - birthYear));
	}
}

public class Task1 {
	public static void main(String[] args) throws IOException {
		Person person = new Person(1990, "Igor");
		person.output();
		person.age();
		Person person2 = new Person();
		person2.input();
		person2.output();
		person2.age();
		person2.changeName("Oleksandr");
		person2.output();
		person2.age();
	}
}
