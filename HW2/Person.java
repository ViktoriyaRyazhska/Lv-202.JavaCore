
import java.io.IOException;

public class Person {
	private String name;
	private int birthYear;

	public Person(String name, int birthYear) {
		super();
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

	public int Age() {
		return 2016 - birthYear;
	}

	public void changeName(String name) {
		this.name = name;
	}

	public void InPut(String Input) throws IOException {

	}

	public void OutPut(String Output) {
		System.out.println(name);
		System.out.println(2016 - birthYear);

	}
}
